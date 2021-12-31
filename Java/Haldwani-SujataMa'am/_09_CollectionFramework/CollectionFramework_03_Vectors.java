import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import java.lang.reflect.Field;

/**
 * JAVA 1.0
 * Vector ----> dynamic arrays , which can increases the size accordingly, increases capacity by 100%
 * Thread Safe , Synchronized, wastes the memory
 */

public class CollectionFramework_03_Vectors {


    static int getCapacity(ArrayList<Integer> al) throws Exception{
        Field field= ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
    public static void main(String[] args) throws Exception{
        Vector<Integer> v= new Vector<>(); // Constructs an empty vector so that its internal data array has size 10 and its standard capacity increment is zero.
        System.out.println("Current capacity of the vector at initialization is: "+ v.capacity());
        System.out.println("Current size of the vector at initialization is: "+ v.size());
        
        // adding values
        for (int i = 10; i < 100; i++) {
            int index=i-10;
            v.add(index, i); // add i at index= index
            // increases capacity by 100 % (double the capacity)
            // if(i%10==9){

            //     System.out.println("Added i= "+ i+" at index= "+ index+ ":\tCurrent capacity of the vector is: "+ v.capacity()+ " and size: "+ v.size());
            // }
        }
        System.out.println("\n\nVector at index 50 is: "+ v.get(50)+ "\n\n");

        // removing values
        for (int i = v.size(); i > 9; i--) {
            int index= i-10;
            v.remove(index);
            // decreases size (capacity remains same)
            // if(i%10==9)
            // System.out.println("Removed i= " + i + " from index= " + index + ":\tCurrent capacity of the vector is: "+ v.capacity() + " and size: " + v.size());
        }


        Vector<String> v1= new Vector<>();
        // adding values
        v1.add("Lucifer");
        v1.add("Dean");
        v1.add("Oliver");        
        v1.add(2, "Lucifer"); // Add Lucifer at index 2
        v1.add(4, "Amenadiel");

        // for (String string : v1) {
        //     System.out.println(string);
        // }

        // removing values
        v1.remove("Lucifer"); // removes the first occurance of Lucifer
        v1.remove(3); // remove the value at index 3
        // for (String string : v1) {
        //     System.out.println(string);
        // }


        
        /**
         * ArrayList ----> fast, non-synchronized(not thread-safe), saves memory
         */
        ArrayList<Integer> l = new ArrayList<>(); // Constructs an empty list with an initial capacity of 10.
        System.out.println("Current size of the list at initialization is: " + l.size());

        // adding values
        for (int i = 10; i < 100; i++) {
            int index = i - 10;
            l.add(index, i); // add i at index= index
            // increases capacity by 50 % -----> saves memory
            // Do Not Have method to see capacity !!!!
            // if(i%10==9){
            // System.out.println("Added i= "+ i+" at index= "+ index+ ":\tCurrent capacity of the vector is: "+ getCapacity(l)+ " and size: "+ l.size());
            // }
            if(i%10==9){
            System.out.println("Added i= "+ i+" at index= "+ index+ ":\tCurrent size: "+ l.size());
            }
        }
        System.out.println("\n\nList at index 50 is: " + l.get(50) + "\n\n");

        // removing values
        for (int i = l.size(); i > 9; i--) {
            int index = i - 10;
            l.remove(index);
            // decreases size
            // if(i%10==9)
            // System.out.println("Removed i= " + i + " from index= " + index + ":\tCurrent size: " + l.size());
        }


    }
}
