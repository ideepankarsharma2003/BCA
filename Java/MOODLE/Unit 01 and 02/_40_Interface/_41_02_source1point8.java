package _40_Interface;

// javac -source 1.8 _41_02_source1point8.java

// abstract methods and final variables
// default methods/ public static methods

public interface _41_02_source1point8 {
    public static final int x = 10;

    public abstract void show();
    public static void m(){
        System.out.println("Public static method");
    }

    default void showDef(){
        System.out.println("Default method");
    }
}
