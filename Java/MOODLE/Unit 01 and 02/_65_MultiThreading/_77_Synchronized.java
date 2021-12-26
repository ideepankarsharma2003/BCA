import java.util.Scanner;

class _77_BankOfJointAccount{
    double jointAmount;
    synchronized void show(){
        System.out.println("The current amount is: "+ jointAmount);
    }

    // void addBalance(double amount, String name){
    synchronized void addBalance(double amount, String name){
        System.out.println(name+ ": ");
        jointAmount+=amount;
        System.out.println("Added amount is: "+ amount);
        show();
    }

    // void withdrawBalance(double amount, String name){
    synchronized void withdrawBalance(double amount, String name){
        System.out.println(name+ ": ");
        jointAmount-=amount;
        System.out.println("Withdrawal amount is: "+ amount);
        show();
    }

}

class _77_TestSynchronized01 extends java.lang.Thread{
    _77_BankOfJointAccount account;
    String name;

    // constructor 
    _77_TestSynchronized01(_77_BankOfJointAccount account, String name){
        this.name= name;
        this.account= account;
    }

    public void run(){
        double amount=500;
        account.addBalance(amount, name);
        account.withdrawBalance(amount, name);
    }
}


class _77_TestSynchronized02 extends java.lang.Thread{
    _77_BankOfJointAccount account;
    String name;

    // constructor 
    _77_TestSynchronized02(_77_BankOfJointAccount account, String name){
        this.name= name;
        this.account= account;
    }

    public void run(){
        double amount=982.76;
        Scanner sc = new Scanner(System.in);
        account.addBalance(amount, name);
        account.withdrawBalance(amount, name);
    }
}


class _77_TestSynchronized03 extends java.lang.Thread{
    _77_BankOfJointAccount account;
    String name;

    // constructor 
    _77_TestSynchronized03(_77_BankOfJointAccount account, String name){
        this.name= name;
        this.account= account;
    }

    public void run(){
        double amount=10000.78;
        account.addBalance(amount, name);
        account.withdrawBalance(amount, name);
    }
}


class _77_TestSynchronized04 extends java.lang.Thread{
    _77_BankOfJointAccount account;
    String name;

    // constructor 
    _77_TestSynchronized04(_77_BankOfJointAccount account, String name){
        this.name= name;
        this.account= account;
    }

    public void run(){
        double amount=98.6;
        account.addBalance(amount, name);
        account.withdrawBalance(amount, name);
    }
}


public class _77_Synchronized {
    public static void main(String[] args) {
        _77_BankOfJointAccount account= new _77_BankOfJointAccount();
        _77_TestSynchronized01 t1= new _77_TestSynchronized01(account, "Deepankar");
        _77_TestSynchronized02 t2= new _77_TestSynchronized02(account, "Oliver");
        _77_TestSynchronized03 t3= new _77_TestSynchronized03(account, "Dean Winchester");
        _77_TestSynchronized04 t4= new _77_TestSynchronized04(account, "Bruce Wayne");
        t1.start();
        t2.start();
        t3.start();
        t4.start();


        _77_TestSynchronized01 [] arr= new _77_TestSynchronized01[10];
        for (_77_TestSynchronized01 i : arr) {
            i=new _77_TestSynchronized01(account, "name"+ i);
            i.start();
        }


    }
}
