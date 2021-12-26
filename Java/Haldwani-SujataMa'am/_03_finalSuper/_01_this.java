import java.util.Scanner;

class _01_Hello {
    int i;
    void set(int i){
        this.i = i;
        iTimesHello();
    }

    void iTimesHello(){
        System.out.println("The value of i is: "+ i);
        System.out.println(i + " times Helooo ");
        for (int i = 0; i < this.i; i++) {
            System.out.println("Helllllloo !!!!!!");
            
        }
    }
    
}



public class _01_this {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of i: ");
        int i= sc.nextInt();
        _01_Hello obj= new _01_Hello();
        obj.set(i);
        sc.close();
    }
    
}