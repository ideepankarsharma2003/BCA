class _03_Student{
    String name;
    int rollno;
    String Course;
    int age;

    _03_Student(){
        name="Deepankar Sharma";
        rollno=14;
        Course="Bachelors of Computer Applications";
        age= 18;
    }

    public void show(){
        System.out.println("The name of student is: "+ name);
        System.out.println("The age of student is: "+ age);
        System.out.println("The roll no of student is: "+ rollno);
        System.out.println("The course of student is: "+ Course);
    }
}


public class _03_defaultConstructor {
    public static void main(String[] args) {
        _03_Student obj= new _03_Student();
        obj.show();
    }
}
