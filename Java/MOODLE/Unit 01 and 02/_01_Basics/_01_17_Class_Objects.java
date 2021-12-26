class Dem
{
    int i=90, j=91;

    void mm()
    {
        System.out.println("The value of obj.i is "+ i);
        System.out.println("The value of obj.j is "+ j);
    }
}

public class _01_17_Class_Objects {
    public static void main(String[] args) {
        Dem obj1; // object with Null 
        obj1 = new Dem(); // object is now having reference to newly created object in heap
        obj1.mm();
    }
}
