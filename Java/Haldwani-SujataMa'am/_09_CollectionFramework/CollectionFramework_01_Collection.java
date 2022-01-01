import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Collections_01_Intro
 */
public class CollectionFramework_01_Collection {

    /**
     * InnerCollections_01_Intro
     */
    public class InnerCollections_01_Intro {
    
        
    }

    public static void main(String[] args) {
        // int a[]= new int[10]; // fixed sized array


        /**
         *  Java 1.2
         *  collection------> Topic/Concept to talk about
         *  Collection------> Interface, no indexing
         *  Collections-----> Class
         */

        Collection values= new ArrayList<>();

        
        // Adding values
        values.add(45);
        values.add("Lucifer");
        values.add("Lucifer");
        values.add(56.87);
        values.add("Lucifer");
        values.add(56.5f);
        values.add(true);

        
        //  Iteration
        // using Iterator Interface
        // Iterator i= values.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

        // using enhanced for loop
        // for (Object object : values) {
        //     System.out.println(object);
        // }

        // Stream API: Lambda Expressions, JAVA 1.8
        // values.forEach(System.out::println);

         
        //  Removing Values
        // values.remove("Lucifer"); // removes the First "Lucifer"
        // for (Object object : values) {
        //     System.out.println(object);
        // }






        /**
         *  Lists----> ordered and indexed 
         */

        // adding values
        List l1= new ArrayList<>();
        l1.add(4);
        l1.add(45);
        l1.add(49);
        l1.add("Hello");
        l1.add(2, "Namaste"); // add "Namaste" at index 2
        l1.add(3, "Dean Winchester"); // add "Dean Winchester" at index 2
        // for (Object object : l1) {
        //     System.out.println(object);
        // }

        // removing values
        int index= 3;
        l1.remove(index); // removes the object at index=index
        l1.remove("Namaste"); // removes the first occurance of the object
        // for (Object object : l1) {
        //     System.out.println(object);
        // }

        // sorting ------> for Generics (homogeneous data types)
        // Collections.sort(l1);
        // for (Object object : l1) {
        //     System.out.println(object);
        // }






        /**
         * Set---> unique values
         */

        // HashSet----->Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load factor (0.75).
        Set s1= new HashSet();
        s1.add("Hello");
        s1.add("Munna Bhaiya");
        s1.add("Hello");
        s1.add("Chota Cheems");
        s1.add("Hello");
        s1.add(96);
        s1.add("Hello");
        // for (Object object : s1) {
        //    System.out.println(object);
        // }

        /** Throws Exception, Should be sorted and synchronized externally */
        // TreeSet ----> Constructs a new, empty tree set, sorted according to the natural ordering of its elements.
        // Set s2= new TreeSet();
        // s2.add("Hello");
        // s2.add("Munna Bhaiya");
        // s2.add("Hello");
        // s2.add("Chota Cheems");
        // s2.add("Hello");
        // s2.add(96);
        // s2.add("Hello");
        // for (Object object : s2) {
        //    System.out.println(object);
        // }







        /**
         * Map-----> key values pairs
         */

        // HashMap ----> Not Thread Safe: Non-Synchronized
        Map m1= new HashMap<>();
        m1.put("Sad", "Nibba");
        m1.put("key", "value");
        m1.put("Deepankar", "Sharma");
        m1.put("Sam", "Winchester");
        m1.put("you", 4);
        m1.put(4.5, false);
        // for (Object key : m1.keySet()) {
        // System.out.println(key+ " : "+ m1.get(key));
        // }

        // HashTable ----> Thread Safe: Synchronized
        Map m2 = new Hashtable();
        m2.put("Sad", "Nibba");
        m2.put("key", "value");
        m2.put("Deepankar", "Sharma");
        m2.put("Sam", "Winchester");
        m2.put("you", 4);
        m2.put(4.5, false);
        for (Object key : m2.keySet()) {
            System.out.println(key + " : " + m2.get(key));
        }



    }
}