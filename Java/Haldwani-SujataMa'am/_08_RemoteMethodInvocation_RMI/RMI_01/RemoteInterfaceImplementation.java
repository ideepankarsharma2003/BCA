import java.rmi.server.UnicastRemoteObject;

public class RemoteInterfaceImplementation extends UnicastRemoteObject implements RemoteInterface{
    
    
    RemoteInterfaceImplementation() throws Exception{
        super();
    }

    public String add(int a, int b) throws Exception{
        System.out.println("The sum of "+ a+ " and "+ b+ " is: "+ (a+b));
        return "Addition Performed Successfully :)";
    }

}
