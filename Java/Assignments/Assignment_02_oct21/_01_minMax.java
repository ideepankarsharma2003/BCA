import java.util.Scanner;
class _01_minMax{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[];
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        arr= new int[10];
        for (int i=0; i<arr.length; i++) {
            System.out.print("Enter the arr["+ (i)+ "]: ");
            arr[i]= sc.nextInt();
            if (arr[i]>max)max= arr[i];
            if (arr[i]<min)min= arr[i];
        }
        System.out.println("Maximum element is: "+ max);
        System.out.println("Minimum element is: "+ min);
        sc.close();
    }
}