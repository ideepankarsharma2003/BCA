/**
 * _51_Strings02
 */
public class _51_Strings02 {

    public static void main(String[] args) {
        String str1= new String(); // empty string
        System.out.println(str1);

        String str2= new String("Passing value to Constructor"); 
        System.out.println(str2);

        String str3= "Direct Initialization";
        System.out.println(str3);
        
        // character array
        char[] ch= {'a', 'b', 'c', 'd', 'e'};
        String str4= new String(ch);
        System.out.println(str4);
    }
}