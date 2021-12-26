import java.util.Scanner;

public class _02_searchArr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter the number of array: ");
        n= sc.nextInt();
        
        int arr[];
        int searchInd;
        arr= new int[n];
        for (int i=0; i<arr.length; i++) {
            System.out.print("Enter the arr["+ (i)+ "]: ");
            arr[i]= sc.nextInt();
        }
        
        System.out.print("Enter the element to be searched: ");
        searchInd= sc.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==searchInd){
                System.out.println("The element is found at index ["+ (i)+ "].");
                break;
            }
            if(i==arr.length){
                System.out.println("The element is not in the array !!!");
            }
        }

        sc.close();
    }
}
