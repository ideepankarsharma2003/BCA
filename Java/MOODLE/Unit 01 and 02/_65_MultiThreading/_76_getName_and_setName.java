
class _76_Test_getName_and_setName extends java.lang.Thread{
    public void run(){
        System.out.println("\n_76_Test_getName_and_setName Thread:  \n");
        System.out.println("The default name provided by JVM: "+ Thread.currentThread().getName());
        Thread.currentThread().setName("_76_Test_getName_and_setName Thread");
        System.out.println("The name provided by Deepankar: "+ Thread.currentThread().getName());
    }
}

public class _76_getName_and_setName {
    public static void main(String[] args) {
        System.out.println("\nMain Thread:  \n");
        System.out.println("The default name provided by JVM: " + Thread.currentThread().getName());
        Thread.currentThread().setName("MAIN() of _76_getName_and_setName Thread");
        System.out.println("The name provided by Deepankar: " + Thread.currentThread().getName());

        _76_Test_getName_and_setName obj= new _76_Test_getName_and_setName();
        obj.start();
    }
}
