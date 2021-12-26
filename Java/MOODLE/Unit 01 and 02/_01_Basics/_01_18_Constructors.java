class _01_Test_1_18
{
    int age;
    String name;
    _01_Test_1_18() // explicit default constructor
    {
        name="Deepankar";
        age=18;
    }
    
    _01_Test_1_18(String name, int age) // parameterized constructor
    {
        this.name= name;
        this.age= age;
    }
    void show()
    {
        System.out.println("The age is " + age);
        System.out.println("The name is " + name);
    }
}

public class _01_18_Constructors {
    public static void main(String[] args) {
        _01_Test_1_18 obj1=new _01_Test_1_18();
        obj1.show();        
        _01_Test_1_18 obj2=new _01_Test_1_18("Rahul", 12);
        obj2.show();        
    }
    
}
