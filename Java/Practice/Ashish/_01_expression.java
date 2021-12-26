import java.util.Scanner;
import java.lang.Math;

/**
 * _01_expression
 */
public class _01_expression {

    public static double findX(double a, double b){
        double temp= 3*a + 1;
        temp= Math.sqrt(temp);
        double x= temp/b;
        return x;
    }

    public static void findLargestElement(){
        Scanner sci = new Scanner(System.in); 
        int n;
        System.out.print("Enter the number of elements in the array: ");
        n= sci.nextInt();
        int[] arr = new int[10];
        for (int i=0; i<n; i++) {
            System.out.print("Enter value of arr["+ i+ "]: ");
            arr[i] = sci.nextInt();
        }


        System.out.println();
        int l= arr[0];
        for(int i=0; i<n-1; i++){
            if(arr[i+1]>l){
                l= arr[i+1];
            }
        }
        System.out.println("The largest element of the array is: "+ l);
        sci.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, x;
        System.out.print("Enter the value of a: ");
        a=sc.nextDouble();
        System.out.print("Enter the value of b: ");
        b=sc.nextDouble();
        
        x=findX(a, b);
        System.out.println("The value of x is: "+ x);
        System.out.println();
        findLargestElement();
        sc.close();
    }
}