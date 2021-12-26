import java.io.File;

public class _01_createNewFile{
    public static void main(String[] args) {
        String path="_03_UsingCreateNewFile.txt";
        File newFile= new File(path);
        try {
            boolean a= newFile.createNewFile();
            if(a) System.out.println("File Created !!!!");
            else System.out.println("File already exists !!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}