class Inner_01_35_superKeyword {
    int m=5;
    void show(){
        System.out.println("Show method of parent class !!!");
    }    
}
/**
 * Inner_01_35_superKeyword_1
 */
class Inner_01_35_superKeyword_1 extends Inner_01_35_superKeyword{
    int m = super.m;

    void show() {
        System.out.println("Show method of child class !!!");
        super.show(); // show method of parent class
    }
}

public class _01_35_superKeyword extends Inner_01_35_superKeyword{
    
    public static void main(String[] args) {
        Inner_01_35_superKeyword_1 obj= new Inner_01_35_superKeyword_1();
        System.out.println("value of m is "+ obj.m);
        obj.show();
    }
    
}
