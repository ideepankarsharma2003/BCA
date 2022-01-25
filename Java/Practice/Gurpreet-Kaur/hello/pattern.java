/*
 
* * * * * * * * * -----> 5*2-1
  * * * * * * * -------> 5*2-3
    * * * * * -------> 5*2-5
      * * * -------> 5*2-7
        * -------> 5*2-9
  
 */
public class pattern {

    static {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (5 * 2) - (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
    }
}