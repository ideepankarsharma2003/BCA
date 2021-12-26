// javac -Xlint _42_Interface.java

public interface _42_Interface {
    public static final int x = 10;
    public abstract void show();  
}

class _42_A implements _42_Interface{
    public void show(){
        System.out.println("Abstract Show method of Interface implementation");
    }
}

