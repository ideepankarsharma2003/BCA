public class _03_throws {
    static void division (int a, int b) throws Exception{
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            division(85, 6);
        } 
        catch (Exception e) {
            System.out.println("Exception occured is: " + e);
            e.printStackTrace();
        }

        
        try {
            division(89, 0);
        } 
        catch (Exception e) {
            System.out.println("Exception occured is: " + e);
            e.printStackTrace();
        }
    }
}
