import java.util.Scanner;

/**
 * DiagonalAddition
 */
public class DiagonalAddition {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter the number of rows: ");
        n= sc.nextInt();
        int arr[][]= new int[n][n];
        int sum=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter arr["+ i+"]["+ j+ "]: ");
                arr[i][j]= sc.nextInt();
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The sum of diagonal elements is: "+ sum);
        sc.close();

    }
}