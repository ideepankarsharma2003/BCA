abstract class _32_A // abstract class
{
    void func1()
    {
        System.out.println("Normal method of parent Class");
    }

    abstract void func2(); 
    abstract void func3(); 
}

// duty of child class to give definition to abstract methods of parent class
abstract class _32_B extends _32_A
{
    void func2()
    {
        System.out.println("Abstract method 'func2' of parent class _32_A !!");
    }
}

// duty of child class to give definition to abstract methods of parent class
class _32_C extends _32_B
{
    void func3()
    {
        System.out.println("Abstract method 'func2' of garndparent class _32_A !!");
    }
}


public class _32_AbstractClass {
    public static void main(String[] args) {
        _32_C obj = new _32_C(); 
        obj.func1();
        obj.func2();
        obj.func3();
    }
    
}
