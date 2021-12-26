class _43_Child implements _43_Interface_01, _43_Interface_02{
    public void m1(){
        System.out.println("M1 method of Interface 1");
    }
    public void m2(){
        System.out.println("M2 method of Interface 2");
    }
    public void m3(){
        System.out.println("M2 method of Interface 2");
    }
}

public class _43_Interface_MultipleInheritance {
    public static void main(String[] args) {
        _43_Child obj= new _43_Child();
        obj.m1();
        obj.m2();
        obj.m3();
        System.out.println("Static variable x= "+ _43_Interface_01.x);
    }
}
