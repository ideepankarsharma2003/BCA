import java.util.Scanner;

public class _02_SandeepAssignment01 {
    long accno;
    String name;
    float balance;
    String account_type;
    Scanner sc = new Scanner(System.in);
    Scanner scanName = new Scanner(System.in);

    void getData() {
        System.out.print("enter your Account No.: ");
        accno = sc.nextInt();
        System.out.print("enter your Name: ");
        name = scanName.nextLine();
        System.out.print("enter your Total Balance: ");
        balance = sc.nextFloat();
        System.out.print("enter your Account type: ");
        account_type = sc.next();
    }

    void display() {
        System.out.println("Your Account No. is: " + accno);
        System.out.println("Your Name is: " + name);
        System.out.println("Your Total Balance is: " + balance);
        System.out.println("Your Account Type is.: " + account_type);
    }

    void withdraw() {
        System.out.print("enter the amount you want to withdraw: ");
        float withdraw = sc.nextFloat();
        float new_balance = balance - withdraw;
        balance = new_balance;
        System.out.println("new balance is: " + new_balance);
    }

    void deposit() {
        System.out.print("enter the amount you want to deposit: ");
        float deposit = sc.nextFloat();
        float new_balance2 = balance + deposit;
        System.out.println("new balance is: " + new_balance2);
    }

    public static void main(String[] args) {
        _02_SandeepAssignment01 a1 = new _02_SandeepAssignment01();
        a1.getData();
        a1.display();
        a1.withdraw();
        a1.deposit();
    }
}
