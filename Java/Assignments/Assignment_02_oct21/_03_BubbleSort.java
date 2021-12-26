import java.util.Scanner;

public class _03_BubbleSort {

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of array: ");
        n = sc.nextInt();

        int arr[];
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the arr[" + (i) + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray before sorting: ");
        for (int i : arr) {
            System.out.print(i+ "\t");
        }

        bubbleSort(arr);

        System.out.println("\nArray after sorting: ");
        for (int i : arr) {
            System.out.print(i + "\t");
        }

        sc.close();
    }
}
