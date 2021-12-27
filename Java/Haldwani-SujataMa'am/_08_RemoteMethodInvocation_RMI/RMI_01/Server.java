import java.rmi.Naming;

public class Server {
    public static void main(String[] args) throws Exception{
        RemoteInterfaceImplementation obj= new RemoteInterfaceImplementation();
        Naming.rebind("rmi:///RemoteInterface", obj);

        System.out.println("Server Started :)");
    }
    
}
