class _75_TestThreadYield01 extends java.lang.Thread{
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("_74_TestThreadYield01 executed !!!");
            if (i == 4) {
                System.out.println("\n\nYielding the Thread, Going to Runnable !!!\n\n");
                Thread.yield();
            }
        }
    }

}

class _75_TestThreadYield02 extends java.lang.Thread{
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("_74_TestThreadYield02 executed !!!");
        }
    }
}

class _75_TestThreadYield03 extends java.lang.Thread{
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("_74_TestThreadYield03 executed !!!");
        }
    }
}

public class _75_ThreadYield {
    public static void main(String[] args) {
        _75_TestThreadYield01 t1= new _75_TestThreadYield01();
        _75_TestThreadYield02 t2= new _75_TestThreadYield02();
        _75_TestThreadYield03 t3= new _75_TestThreadYield03();
        t1.start();
        t2.start();
        t3.start();
    }
}
