import java.lang.Thread;

class _69_TestThread extends Thread{
    
    // overriding the run method
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Custom Thread executed !!");
            
        }
    }
}


public class _69_ThreadClass {

    public static void main(String[] args) {

        _69_TestThread obj= new _69_TestThread();
        obj.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread executed !!");
        }
    }
}