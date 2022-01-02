import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaSocket_02_2_WayCommunication_Server {
    public static void main(String[] args) throws Exception{
        System.out.println("Server Established !!!");
        System.out.println("Chloe (Server): Can I get your name?");
        ServerSocket ss = new ServerSocket(3600);
        Socket s= ss.accept(); // create socket when the connection is established !!! ----> connection request accepted :)

        BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
        // sending from Lucifer to Chloe(client-->server)
        String str= br.readLine();
        System.out.println("Lucifer (Client): "+ str);

        OutputStreamWriter outs = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(outs);
        // receiving to Lucifer from Chloe(client<---server)
        out.println("Chloe (Server): Can I get your name?");
        outs.flush();

        // sending from Lucifer to Chloe(client-->server)
        str= br.readLine();
        System.out.println("Lucifer (Client): "+ str);
        
        // receiving to Lucifer from Chloe(client<---server)
        // out.println("Welcome, "+ str+ ",Enter your message:  ");
        out.println("Chloe (Server): "+ "Welcome, "+ str+ ", This is Chloe *_*");
        outs.flush();

        // sending from Lucifer to Chloe(client-->server)
        str = br.readLine();
        System.out.println("Lucifer (Client): "+ str);

        ss.close();
        s.close();
        br.close();
        System.out.println("\nServer Closed !!!\n\n");

    }
}
