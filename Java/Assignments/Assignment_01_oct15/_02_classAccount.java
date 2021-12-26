import java.util.Scanner;

class _02_Account{
    int accno;
    String name;
    double balance;
    String accType;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter the account no: ");
        accno= sc.nextInt();
        System.out.print("Enter the name: ");
        name= scan.next();
        System.out.print("Enter the balance: ");
        balance= sc.nextDouble();
        System.out.print("Enter the account type: ");
        accType= sc.next();
        sc.close();
        scan.close();
    }

    public void display(){
        System.out.println("\n\nThe account no is: "+ accno);
        System.out.println("The name is: "+ name);
        System.out.println("The balance is: "+ balance);
        System.out.println("The account type is: "+ accType);
    }

    public void withdraw(double amount){
        System.out.println("\n\nAmount withdrawn is: "+ amount);
        balance-=amount;
        System.out.println("The final balance is: " + balance);
    }

    public void deposit(double amount){
        System.out.println("\n\nAmount deposited is: "+ amount);
        balance+=amount;
        System.out.println("The final balance is: " + balance);
    }
    
}

public class _02_classAccount {
    public static void main(String[] args) {
        _02_Account obj= new _02_Account();
        obj.getData();
        obj.display();
        obj.withdraw(19000.00);
        obj.deposit(25000);
    }
}
