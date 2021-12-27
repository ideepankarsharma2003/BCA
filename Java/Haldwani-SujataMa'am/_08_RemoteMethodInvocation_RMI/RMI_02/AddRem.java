import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * AddRem
 */
public interface AddRem extends Remote{
    public void addNum(int a, int b) throws RemoteException;
    
}