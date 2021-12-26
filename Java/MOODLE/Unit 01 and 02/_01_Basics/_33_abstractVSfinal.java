class _33_A {
    int m = 20;

    final void func() {
        System.out.println("This is parent function and is final method !!!!");
    }
}

class _33_B extends _33_A {
    int m = 25;

    // Cannot override the final method

    /*
    void func() {
        System.out.println("This is child function !!!");
    }
    */
}


public class _33_abstractVSfinal {
    public static void main(String[] args) {
        _33_A obj1; // object of _33_A instantiated with NULL Value reference
        _33_B obj2 = new _33_B(); // object of _33_B instantiated with address Value refrence of a _33_B object in the heap
        obj1 = new _33_B(); // parent class variable having reference of child class

        obj1.func(); // _33_A class function is called
        obj2.func(); // _33_A class function is called
    }
    
}
