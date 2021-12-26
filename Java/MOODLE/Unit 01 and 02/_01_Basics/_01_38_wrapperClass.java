public class _01_38_wrapperClass {
    public static void main(String[] args) {
        int i= 10;
        // Integer objI= new Integer(i); // The constructor Integer(int) has been deprecated since version 9 and marked for removal
        Integer objI= i; // Autoboxing

        System.out.println("Value of Integer is "+ i);
        System.out.println("Value of Wrapper class Integer is "+ objI);
        
        float f= 67.9067f;
        // Float objF= new Float(f); // The constructor Float(float) has been deprecated since version 9 and marked for removal
        Float objF= f;
        
        System.out.println("Value of Float is "+ f);
        System.out.println("Value of Wrapper class Float is "+ objF);
        
        
        double d= 67.9067;


        // Double objF= new Double(d); // The constructor Double(double) has been deprecated since version 9 and marked for removal
        Double objD= d;
        
        System.out.println("Value of Double is "+ d);
        System.out.println("Value of Wrapper class Double is "+ objD);
    }
}
