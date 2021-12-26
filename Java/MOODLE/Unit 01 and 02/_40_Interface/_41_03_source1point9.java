package _40_Interface;


// javac -source 1.9 _41_03_source1point9.java

// abstract methods and final variables
// default methods/ public static methods
// public/private static methods

public interface _41_03_source1point9 {
    public static final int x = 10;

    public abstract void show();

    public static void m() {
        System.out.println("Public static method");
    }

    default void showDef() {
        System.out.println("Default method");
    }

    public static void pubs(){
        System.out.println("Public static method");
    }

    private static void privs(){
        System.out.println("Private static method");
    }

    private void showpriv(){
        System.out.println("Private method");
    }

}
