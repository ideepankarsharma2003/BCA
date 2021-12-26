public class _01_39_WrapperClassUnboxing {
    public static void main(String[] args) {
        int n=5;
        Integer objI= n; // autoboxing
        int i= objI.intValue(); // unboxing
        float m=5.674f;
        Float objF= m; // autoboxing
        float f= objF.floatValue(); // unboxing
        double d= 45.78;
        Double objD= d; // autoboxing 
        double d1= objD.doubleValue(); // unboxing

        System.out.println("i= "+i);
        System.out.println("f= "+f);
        System.out.println("d1= "+ d1);
    }
    
}
