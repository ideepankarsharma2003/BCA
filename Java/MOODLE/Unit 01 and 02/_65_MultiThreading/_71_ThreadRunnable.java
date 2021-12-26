import java.lang.Thread;
import java.lang.Runnable;


class _71_TestThreadRunnable implements Runnable{
    // overridden run method
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Custom Thread executed !!");

        }
    }
}

public class _71_ThreadRunnable {
    public static void main(String[] args) {

        _71_TestThreadRunnable t= new _71_TestThreadRunnable();
        Thread obj= new Thread(t);
        obj.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread executed !!");

        }
    }
}
