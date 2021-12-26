import javax.sound.midi.SysexMessage;

class _75_TeststopThread extends java.lang.Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Custom Thread executed !!!! ");            
            if(i==4){
                System.out.println("\n\nStopping Thread, going to dead state\n\n");
                try{
                    Thread.currentThread().stop();
                }
                catch(Exception e){
                    System.out.print("\n\n Excepetion occured: ");
                    System.out.println(e+ "\n\n");
                }
            }
        }
    }
}
public class _75_stopThread {
    public static void main(String[] args) {
        
        _75_TeststopThread obj= new _75_TeststopThread();
        obj.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread Executed !!!!!");
        }
    }
}
