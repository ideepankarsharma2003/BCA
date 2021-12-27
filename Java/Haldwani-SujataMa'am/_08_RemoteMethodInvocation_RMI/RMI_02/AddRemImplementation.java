import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;

public class AddRemImplementation extends UnicastRemoteObject implements AddRem{
    public AddRemImplementation() throws RemoteException{
        super();
    }
    public void addNum(int a, int b){
        System.out.println("The sum is : "+ (a+b));
    }
}
