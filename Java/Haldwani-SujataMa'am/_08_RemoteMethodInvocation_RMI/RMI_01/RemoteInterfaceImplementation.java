import java.rmi.server.UnicastRemoteObject;

public class RemoteInterfaceImplementation extends UnicastRemoteObject implements RemoteInterface{
    
    
    RemoteInterfaceImplementation() throws Exception{
        super();
    }

    public void ShowName(String Name) throws Exception{
        System.out.println("Hello, "+ Name);
    }

}
