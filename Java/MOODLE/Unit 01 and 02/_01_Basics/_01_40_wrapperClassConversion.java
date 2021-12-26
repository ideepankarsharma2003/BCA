public class _01_40_wrapperClassConversion {
    public static void main(String[] args) {
       
        // convert number to String using toString()
        int n= 54567;
        String str1= Integer.toString(n);
        System.out.println("String is: "+ str1);

        float f= 4567.90f;
        String str2= Float.toString(f);
        System.out.println("String is: "+ str2);

        // convert String to number using valueOf()
        int m= Integer.valueOf(str1);
        System.out.println("Integer is: " + m);
        float x= Float.valueOf(str2);
        System.out.println("Float is: " + x);

        // using String Class parse functions 
        String str3= "56748";
        String str4= "7542.8935f";
        String str5= "5212.35";

        int p= Integer.parseInt(str3);
        float q= Float.parseFloat(str4);
        double r= Double.parseDouble(str5);

        System.out.println("Integer is: "+ p);
        System.out.println("Float is: "+ q);
        System.out.println("Double is: "+ r);
    }
}
