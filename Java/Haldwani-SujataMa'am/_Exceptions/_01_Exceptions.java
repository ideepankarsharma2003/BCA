/**
 * _01_Exceptions
 */
public class _01_Exceptions {
    
    static void division(int a, int b){
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        try {
            division(89, 0);
        }
        catch (Exception e){
            System.out.println("Exception occured is: "+ e);
            e.printStackTrace();
        }
    }
}