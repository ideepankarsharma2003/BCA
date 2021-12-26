import java.util.Scanner;

class _03_01_Student{
    String name;
    int rollno;
    String Course;
    int age;

    _03_01_Student(){
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter the roll no: ");
        rollno = sc.nextInt();
        System.out.print("Enter the name: ");
        name = scan.next();
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        System.out.print("Enter the Course: ");
        Course = scan.next();
        sc.close();
        scan.close();
    }

    public void show(){
        System.out.println("\n\nThe name of student is: "+ name);
        System.out.println("The age of student is: "+ age);
        System.out.println("The roll no of student is: "+ rollno);
        System.out.println("The course of student is: "+ Course);
    }
}


public class _03_instantiatedConstructor {
    public static void main(String[] args) {
        _03_01_Student obj= new _03_01_Student();
        obj.show();
    }
}
