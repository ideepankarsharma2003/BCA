import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * JavaSocket_02_2_WayCommunication_Client
 */
public class JavaSocket_02_2_WayCommunication_Client {

    public static void main(String[] args) throws Exception{
        String ip= "localhost";
        int port= 3600;
        Socket s= new Socket(ip, port);

        System.out.println("Client Connected :) \n");
        
        OutputStreamWriter outs= new OutputStreamWriter(s.getOutputStream());
        PrintWriter out= new PrintWriter(outs);
        
        // sending from Lucifer to Chloe(client-->server)
        out.println("Hello There !!!");
        outs.flush();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // receiving to Lucifer from Chloe(client<---server)
        String str = br.readLine();
        System.out.println(str);

        
        // sending from Lucifer to Chloe(client-->server)
        String name= "Lucifer Morningstar ";
        out.println(name);
        outs.flush();
        

        // receiving to Lucifer from Chloe(client<---server)
        str = br.readLine();
        System.out.println(str);

        Scanner sc= new Scanner(System.in).useDelimiter("\n");
        // String message= sc.nextLine();
        // sending from Lucifer to Chloe(client-->server)
        String message= "Hello Detective , Didn't know you were here !!!";
        out.println(message);
        outs.flush();

        s.close();
        sc.close();
        System.out.println("\nClient Closed !!!\n\n");
    }
}