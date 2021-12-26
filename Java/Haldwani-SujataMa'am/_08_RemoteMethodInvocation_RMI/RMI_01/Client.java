import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception{
        RemoteInterface obj= (RemoteInterface)Naming.lookup("RegisteredName");
        System.out.println(obj.add(6, 12));
    }    
}
