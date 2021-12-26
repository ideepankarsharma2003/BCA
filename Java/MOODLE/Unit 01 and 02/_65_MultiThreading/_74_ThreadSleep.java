class _74_TestThreadSleep01 extends java.lang.Thread{

    public void run(){
        for (int i = 0; i <10; i++) {
            System.out.println("_74_TestThreadSleep01 executed !!!");
            if(i==4){
                try {
                    Thread.sleep(1000); // 1000 milliseconds
                }
                catch(Exception e){

                }
                finally {
                    System.out.println("\n\nException Handled !!!");
                    System.out.println("\n\n");
                }
            }
        }
    }
    
}
class _74_TestThreadSleep02 extends java.lang.Thread{

    public void run(){
        for (int i = 0; i <10; i++) {
            System.out.println("_74_TestThreadSleep02 executed !!!");
        }
    }

}

public class _74_ThreadSleep {
    public static void main(String[] args) {
        _74_TestThreadSleep01 obj1= new _74_TestThreadSleep01();
        _74_TestThreadSleep02 obj2= new _74_TestThreadSleep02();
        obj1.start();
        obj2.start();
    }
}
