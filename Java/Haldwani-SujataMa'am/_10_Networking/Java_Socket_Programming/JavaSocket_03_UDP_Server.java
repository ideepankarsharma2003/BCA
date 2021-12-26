import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class JavaSocket_03_UDP_Server {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds= new DatagramSocket(3500);

        byte[] bReceived = new byte[10000];
        DatagramPacket dxReceived = new DatagramPacket(bReceived, bReceived.length);
        ds.receive(dxReceived);
        System.out.println(new String(dxReceived.getData(), 0, dxReceived.getLength()));

        String s = "Sure Deepankar :) ";
        byte[] b = s.getBytes();
        DatagramPacket dxSend = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), dxReceived.getPort());
        ds.send(dxSend);


        byte []b1= new byte[2048];

        DatagramPacket dp= new DatagramPacket(b1, b1.length);
        ds.receive(dp);
        String str= new String(dp.getData(), 0, dp.getLength());
        int num= Integer.parseInt(str);
        num=num*num*num;

        byte b2[]= String.valueOf(num).getBytes();
        DatagramPacket dp1= new DatagramPacket(b2, b2.length, InetAddress.getLocalHost(), dp.getPort());
        ds.send(dp1);
    }
}
