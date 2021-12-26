import java.rmi.Naming;

public class Server {
    public static void main(String[] args) throws Exception{
        RemoteInterfaceImplementation obj= new RemoteInterfaceImplementation();
        Naming.rebind("RegisteredName", obj);
        System.out.println("Server Started :)");
    }
    
}
