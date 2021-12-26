import java.io.File;

/**
 * FileStreams
 */
public class _01_FileStreams {

    public static void main(String[] args) {
        // String path = "COPYRIGHT.txt";
        String path = "java\\COPYRIGHT.txt";
        File myFile = new File(path);

        if(myFile.exists()){
            System.out.println("File exists :)");
            System.out.println("The name of the file is: " + myFile.getName());
            System.out.println("The relative path of the file is: " + myFile.getPath());
            System.out.println("The absolute path of the file is: " + myFile.getAbsolutePath());
            System.out.println("The parent directory of the file is: " + myFile.getParent());

            if (myFile.canRead())
                System.out.println("The file have read access !!!");
            else
                System.out.println("The file doesn't have read access !!!");
            if (myFile.canWrite())
                System.out.println("The file have write access !!!");
            else
                System.out.println("The file doesn't have write access !!!");

            System.out.println("The size of the file in bytes is: " + myFile.length());
        }

        else System.out.println("File doesn't exists !!!");
        
    }
}