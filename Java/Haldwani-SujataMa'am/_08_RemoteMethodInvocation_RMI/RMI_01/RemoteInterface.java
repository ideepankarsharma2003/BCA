import java.rmi.Remote;

/**
 * RemoteInterface
 */
public interface RemoteInterface extends Remote{

    public String add (int a, int b) throws Exception;
}