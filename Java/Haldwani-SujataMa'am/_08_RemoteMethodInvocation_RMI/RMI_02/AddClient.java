import java.net.*;
import java.rmi.*;
import java.util.*;

public class AddClient {
    public static void main(String[] args) {
        String host= "localhost";
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= sc.nextInt();
        System.out.print("Enter the second number: ");
        int b= sc.nextInt();


        try {
            // AddRem obj= (AddRem)Naming.lookup("rmi://"+ host+ "/AddRem");
            AddRem obj= (AddRem)Naming.lookup("RegisteredName");
            obj.addNum(a, b);
        } catch (RemoteException e) {
            e.printStackTrace();
        }catch(NotBoundException e){
            e.printStackTrace();
        }catch(MalformedURLException e){
            e.printStackTrace();
        }

        sc.close();
    }
    
}
