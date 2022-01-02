import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04_FileReadWriteUTF {
    public static void main(String[] args) {
        String path= "_04_FileReadWriteUTF";
        File f= new File(path);

            // Writing File
        try {
            FileOutputStream fos= new FileOutputStream(f);
            DataOutputStream dos= new DataOutputStream(fos);
            dos.writeUTF("Hello Welcome to my File !!!!!");
            dos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

            // Reading File
        try {
            FileInputStream fis;
            fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            String msg = dis.readUTF();
            System.out.println(msg);
            dis.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
    
}
