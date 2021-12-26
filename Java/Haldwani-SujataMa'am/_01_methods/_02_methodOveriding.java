class Parent{
    void Hello(){
        System.out.println("Hello from Papa !!!!");
    }
}

class Child extends Parent{
    void Hello(){
        System.out.println("Hello from Beta !!!!");
    }
}

public class _02_methodOveriding {
    public static void main(String[] args) {
        Parent baap = new Parent();
        baap.Hello();

        Child beta= new Child();
        beta.Hello();
    }
}
