import java.rmi.Remote;

/**
 * RemoteInterface
 */
public interface RemoteInterface extends Remote{

    public void ShowName (String Name) throws Exception;
}