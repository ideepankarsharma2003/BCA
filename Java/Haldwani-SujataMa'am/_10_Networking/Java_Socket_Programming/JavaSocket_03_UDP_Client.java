import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * JavaSocket_03_UDP_Client
 */
public class JavaSocket_03_UDP_Client {

    public static void main(String[] args) throws Exception{
        
        DatagramSocket ds= new DatagramSocket();
        int num=8;



        InetAddress url= InetAddress.getLocalHost();
        String s= "Hello Server !!!, This is Deepankar, Can you find cube of 8? ";
        byte[] b= s.getBytes();
        DatagramPacket dxSend = new DatagramPacket(b, b.length, url, 3500);
        ds.send(dxSend);

        byte[] bReceived= new byte[10000];
        DatagramPacket dxReceived = new DatagramPacket(bReceived, bReceived.length);
        ds.receive(dxReceived);
        System.err.println(new String(dxReceived.getData(), 0, dxReceived.getLength()));


        byte[] data= String.valueOf(num).getBytes();
        DatagramPacket dp= new DatagramPacket(data, data.length, url, 3500);
        ds.send(dp);

        byte[] b1= new byte[2048];
        DatagramPacket dp1= new DatagramPacket(b1, b1.length);
        ds.receive(dp1);

        String str= new String(dp1.getData(), 0, dp1.getLength());
        System.out.println("Result is: "+ str);

        ds.close();
    }
}