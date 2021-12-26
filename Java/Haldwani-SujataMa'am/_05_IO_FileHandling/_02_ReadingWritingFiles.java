import java.io.FileReader;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class _02_ReadingWritingFiles {
    public static void main(String[] args) throws Exception{

        String path="_02_ReadingWritingFiles";
        String path2="_02_ReadingWritingFiles copy";

        // // reading with FileReader
        // FileReader fin= new FileReader(path);
        // int i;
        // do{
        //     i=fin.read();
        //     System.out.print((char)i);
        // }while (i!= -1);
        // fin.close();


        // // reading with FileReader
        // FileReader fin= new FileReader(path);
        // int i;
        // while ((i=fin.read())!=-1) {
        //     System.out.print((char)i);
        // }
        // fin.close();


        // reading with Scanner class
        FileReader fileObj= new FileReader(path);
        Scanner sc= new Scanner(fileObj).useDelimiter("\n");
        while( sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();

        String str= "My name is Khan and I'm not a terrorist.\n Just stop being a dick sometimes.\n Well personally I don't like to study !!!\n";

        // // writing in files ----> clears the previous content
        // FileWriter fout= new FileWriter(path2);
        // fout.write(str);
        // fout.close();

        // appending in files ----> appending in the previous content
        RandomAccessFile fout= new RandomAccessFile(path2, "rw");
        fout.seek(fout.length()); // end of the file
        fout.writeBytes(str);
        // fout.writeChars(str);
        // for (char ch : str.toCharArray()) {
        //     if(ch!='\0')
        //     fout.writeChar(ch);
        // }
        fout.close();
    }
}
