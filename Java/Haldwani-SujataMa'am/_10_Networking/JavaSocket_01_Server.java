import java.net.*;
import java.io.*;

/**
 * JavaSocket_01_Server
 */
public class JavaSocket_01_Server {
    public static void main(String[] args) {
        int portNo= 3600;
        ServerSocket server=null;
        Socket socket=null;
        DataInputStream din=null;

        // instantiate the ServerSocket
        try {
            server= new ServerSocket(portNo);            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // server invokes the accept()
        try {
            socket= server.accept();            
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // din= new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            // din= new DataInputStream(socket.getInputStream());
            din= new DataInputStream(socket.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println((String)din.readUTF());
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            din.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}