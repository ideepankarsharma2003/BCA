public class _45_InterfaceAnonymousClassMain {
    public static void main(String[] args) {
        
        // anonymous class
        _45_InterfaceAnonymousClass obj= new _45_InterfaceAnonymousClass(){
            public void m1(){
                System.out.println("m1() method of Interface defined in Anonymous Class !!");
            }

            public void m2(){ 
                System.out.println("m2() method of Interface defined in Anonymous Class !!");
            }
        };

        obj.m1();
        obj.m2();
    }
    
}
