import java.util.Scanner;

public class _01_readLine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter some string: ");
        String str= sc.nextLine();
        System.out.println(str);

        Scanner scan= new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter some other string: ");
        String str2= scan.next();
        System.out.println(str2);
        scan.close();
        sc.close();
    }
}
