import java.util.Scanner;
public class _03_sortingStrings{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter the number of names: ");
        int n= sc.nextInt();
        String [] names= new String[n];
        System.out.println();
        for(int i=0; i<n; i++){
            
            System.out.print("Enter names["+i+"]: ");
            names[i]=scan.next();
            
        }
        
        System.out.println("Original order of names: ");
        // for(String i: names){
            
        //     System.out.print(i);
            
        // }
        
        for(int i=0; i<n; i++){
            System.out.println(names[i]);
            
        }
        
        for (int j = 0; j < n; j++) {
            for (int i = j + 1; i < names.length; i++) {
                if (names[i].compareTo(names[j]) < 0) {
                    String temp = names[j];
                    names[j] = names[i];
                    names[i] = temp;
                }
            }
            //  System.out.println(names[j]);
        }
        
        System.out.println("\nSorted order of names: ");

        for(String i: names){
            
        System.out.println(i);
        
    }
        
    }
}