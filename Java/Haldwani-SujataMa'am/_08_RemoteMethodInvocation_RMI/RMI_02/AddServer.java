import java.net.*;
import java.rmi.*;

public class AddServer {
    public static void main(String[] args) {
        try {
            AddRemImplementation locobj= new AddRemImplementation();
            // Naming.rebind("rmi:///AddRem", locobj);
            Naming.rebind("RegisteredName", locobj);
        } catch (RemoteException e) {
            e.printStackTrace();
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
