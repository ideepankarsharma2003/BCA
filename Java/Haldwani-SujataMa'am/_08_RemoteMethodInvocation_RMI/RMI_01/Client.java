import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception{
        String host = "localhost";

        System.out.println("Client started :)");
        RemoteInterface obj= (RemoteInterface) Naming.lookup("rmi://" + host + "/RemoteInterface");
        obj.ShowName("Deepankar");
    }    
}
