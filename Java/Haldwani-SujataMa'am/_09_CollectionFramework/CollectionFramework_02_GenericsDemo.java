import java.util.ArrayList;



/**
 * CollectionFramework_02_Test01
 */
class CollectionFramework_02_Test01 <T> { // T is the generic type(Type=T)
    T value; 

    CollectionFramework_02_Test01(T value){
        this.value= value;
        show();
    }

    public void show(){
        System.out.println("Type of 'value' is: " +value.getClass().getName());
    }

    /**
     * Even the getter/setter will be of 'T' type
     */
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}





/**
 * CollectionFramework_02_Test02
 */
// Number --->superclass of platform classes representing numeric values that are convertible to the primitive types byte, double, float, int, long, and short
class CollectionFramework_02_Test02 <T extends Number>{ // Any of the Number or it's subclasses will do *_*
    T value;

    CollectionFramework_02_Test02(T value){
        this.value= value;
    }

    public void demoChild(ArrayList<? extends T> obj){ // any class inheriting the T Class will do !!!!

    }

    public void demoParent(ArrayList<? super T> obj){ // any class which is the super class of the T Class will do !!!!

    }
    
}




/**
 * CollectionFramework_02_GenericsDemo
 */

public class CollectionFramework_02_GenericsDemo {
    public static void main(String[] args) {
        
        CollectionFramework_02_Test01<?> obj1= new CollectionFramework_02_Test01<>("Hello"); 
        CollectionFramework_02_Test01<Integer> obj2= new CollectionFramework_02_Test01<>(78);
        CollectionFramework_02_Test01<Double> obj3= new CollectionFramework_02_Test01<>(758.999);


        CollectionFramework_02_Test02<Integer> o1= new CollectionFramework_02_Test02<>(56); // T is Integer for o1
        CollectionFramework_02_Test02<?> o2= new CollectionFramework_02_Test02<>(516.5);
        // CollectionFramework_02_Test02<?> o3= new CollectionFramework_02_Test02<>("56"); // ----> only a class inheriting Number Class
        CollectionFramework_02_Test02<Number> o4= new CollectionFramework_02_Test02<>(516.5); // T is Number for o4


        // o1.demoChild(new ArrayList<Number>()); // Error---> because Number is not inheriting Integer
        o1.demoChild(new ArrayList<Integer>());
        o1.demoParent(new ArrayList<Number>()); // Works Fine---> because Number is superclass of Integer

        o4.demoChild(new ArrayList<Float>()); // Works Fine---> because Number is superclass of Float
        o4.demoChild(new ArrayList<Short>()); // Works Fine---> because Number is superclass of Short
        o4.demoChild(new ArrayList<Double>()); // Works Fine---> because Number is superclass of Double
    }
}
