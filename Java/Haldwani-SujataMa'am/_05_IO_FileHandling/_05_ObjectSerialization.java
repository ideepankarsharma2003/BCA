import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class _05_ObjectSerializationDemo implements Serializable{
    String name;
    String favMovie;
}


public class _05_ObjectSerialization {
    public static void main(String[] args) {
        
        File f= new File("_05_ObjectSerialization");

        
        /**
         * Object Serialization ---------> Storing Objects in Memory
         */

        // Writing objects in File 
        try {
            _05_ObjectSerializationDemo obj = new _05_ObjectSerializationDemo();
            obj.name = "Chota Cheems";
            obj.favMovie = "Dilwaamle Dulhamiya Lem Jayemge";

            FileOutputStream fos= new FileOutputStream(f);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        try {
            FileInputStream fis= new FileInputStream(f);
            ObjectInputStream ois= new ObjectInputStream(fis);
            _05_ObjectSerializationDemo obj1= (_05_ObjectSerializationDemo)ois.readObject();
            ois.close();
            System.out.println("The favourite movie of "+ obj1.name+ " is "+ obj1.favMovie);
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
