/**
 * _01_methodOverloading
 */
public class _01_methodOverloading {
    static int Hello(){
        System.out.println("No Argument Method Hello ");
        System.out.println("Hello !!!");
        System.out.println();
        return 0;
    }

    static void Hello(int a){
        System.out.println("Int Method Hello ");
        System.out.println("Hello "+ a+ "!!!!");
        System.out.println();
    }
    
    static void Hello(float f){
        System.out.println("Float Method Hello ");
        System.out.println("Hello "+ f+ "!!!!");
        System.out.println();
    }
    
    static void Hello(Object obj){
        System.out.println("Object Class Method Hello ");
        System.out.println("Hello "+ obj+ "!!!!");
        System.out.println();
    }

    public static void main(String[] args) {
        Hello();
        Hello("Deepankar");
        Hello(4);
        Hello(45.56f);
    }
}