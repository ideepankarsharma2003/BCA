import java.util.Scanner;

public class _01_electricBill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        float units= sc.nextFloat();
        float bill= 0.0f;
        if(units<100){
            bill= 1.20f*units;
        }
        else if(units<200){
            bill= (1.20f*100)+ (units-100)*2;
        }
        else{
            bill = (1.20f*100) + (units-100)*2 + (units-200)*3;
        }
        System.out.println("The total bill is: "+ bill);
        sc.close();
    }
}
