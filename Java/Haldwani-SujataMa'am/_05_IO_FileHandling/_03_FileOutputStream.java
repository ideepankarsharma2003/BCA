import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class _03_FileOutputStream {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in).useDelimiter("\n\n");
        Scanner scan= new Scanner(System.in);
        

        try {
            // System.out.print("Enter the path to file: ");
            // String path = sc.nextLine();
            String path = args[0];
            System.out.println("path: "+ path);
            if(new File(path).exists())System.out.println("File already exists !!!");
            // System.out.print("Do you want to append data to file: ");
            // Boolean append=scan.nextBoolean();
            Boolean append= Boolean.parseBoolean(args[1]);
            System.out.println("append: "+append);
            FileOutputStream myFile= new FileOutputStream(path, append);
            System.out.print("Enter the message to write in file: ");
            String message = sc.nextLine();
            byte[] b= message.getBytes();
            myFile.write(b);
            myFile.close();
            
        } catch (Exception e) {
            System.out.println("Error Generating the file !!!!");
        }

        sc.close();
        scan.close();

    }
}
