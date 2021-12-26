// Run Time Polymorphism

class A
{
        int m =20;
        void func()
        {
            System.out.println("This is parent function !!!!");
        }    
}

class B extends A
{
    int m= 25;
    void func()
    {
        System.out.println("This is child function !!!");
    }
}

class _34_DynamicMethodDispatch
{
    public static void main(String[] args) {
        A obj1; // object of A instantiated with NULL Value reference
        B obj2= new B(); // object of B instantiated with address Value refrence of a B object in the heap
        obj1 = new B(); // parent class variable having reference of child class

        obj1.func(); // B class function is called 
        obj2.func(); // B class function is called 
    }
}