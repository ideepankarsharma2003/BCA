import java.util.Scanner;

/**
 * Write a Java code to demonstrate: define a class, which accepts two input
 * from the user by using scanner class and display the add/sum/div and multiply
 * as per the below mentioned choice:
 * 
 * 1: Add
 * 
 * 2: Sub
 * 
 * 3: Div
 * 
 * 4: Multiply
 * 
 * 5: Exit
 * 
 * Also write the code for above mentioned operations by using suitable
 * conditional statements.
 */

public class _01_Conditional {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        int num1, num2;
        System.out.print("Enter num 1: ");
        num1= sc.nextInt();
        System.out.print("Enter num 2: ");
        num2= sc.nextInt();
        System.out.println("Enter choice: \n* 1: Add\n* 2: Sub\n* 3: Div\n* 4: Multiply\n* 5: Exit");
        choice= sc.nextInt();
        switch(choice){
            case 1: System.out.println(num1+num2);break;
            case 2: System.out.println(num1-num2);break;
            case 3: System.out.println(num1/num2);break;
            case 4: System.out.println(num1*num2);break;
            case 5: System.out.println("Exit");break;
            default:System.out.println("Wrong Choice");
        }
    }
}
