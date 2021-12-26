import java.net.*;
import java.util.Scanner;
import java.io.*;

/**
 * JavaSocket_01_Client
 */
public class JavaSocket_01_Client {

    public static void main(String[] args) {
        int portNo = 3600;
        Socket socket = null;
        DataOutputStream dout = null;

        try {
            socket= new Socket("localhost", portNo);
        } catch (Exception e) {
            e.printStackTrace();
        }



        try {
            // din= new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            dout = new DataOutputStream(socket.getOutputStream());
            System.out.println("Enter the message for the server: ");
            Scanner sc= new Scanner(System.in).useDelimiter("\n");
            String str= sc.nextLine();
            dout.writeUTF(str);
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            dout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
