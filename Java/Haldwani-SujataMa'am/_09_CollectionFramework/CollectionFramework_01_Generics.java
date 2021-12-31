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
 * Collections_01_Generics
 */
public class CollectionFramework_01_Generics {

    public static void main(String[] args) {
        // int a[]= new int[10]; // fixed sized array

        /**
         * Java 1.5
         * Generics ---> homogeneous data types, to achieve 'type-safety'
         */

        Collection<Integer> values = new ArrayList<>();

        // Adding values
        values.add(45);
        values.add(49);
        values.add(65);
        // values.add(56.87); // ----> only Integers
        // values.add(56.5f); // ----> only Integers
        values.add(89);
        values.add(49);
        // values.add("Lucifer"); // -----> only Integers

        // Iteration
        // using Iterator Interface
        Iterator<Integer> i= values.iterator();
        while(i.hasNext()){
        System.out.println(i.next());
        }

        // using enhanced for loop
        // for (Object object : values) {
        // System.out.println(object);
        // }

        // Stream API: Lambda Expressions
        // values.forEach(System.out::println);

        // Removing Values
        values.remove(49); // removes the First occurance of 49
        // for (Object object : values) {
        // System.out.println(object);
        // }

        /**
         * Lists----> ordered and indexed, support duplicate values
         */

        // adding values
        List<Integer> l1 = new ArrayList<>();
        l1.add(4);
        l1.add(45);
        l1.add(49);
        l1.add(2, 34);
        l1.add(4, 56);
        l1.add(5, 78); // add 78 at index 2
        l1.add(4, 49);
        // for (Object object : l1) {
        // System.out.println(object);
        // }

        // removing values
        int index = 3;
        l1.remove(index); // removes the object at index=index i.e. 49
        // l1.remove("Lucifer"); // removes the first occurance of the object
        // for (Object object : l1) {
        // System.out.println(object);
        // }

        // sorting ------> for Generics (homogeneous data types)
        Collections.sort(l1); // Collections is a class 
        // for (Object object : l1) {
        // System.out.println(object);
        // }

        /**
         * Set---> unique values
         */

        // HashSet----->Constructs a new, empty set and random order; the backing HashMap instance has
        // default initial capacity (16) and load factor (0.75).
        Set<String> s1 = new HashSet<>();
        s1.add("Hello");
        s1.add("Munna Bhaiya");
        s1.add("Hello");
        s1.add("Chota Cheems");
        s1.add("Hello");
        // s1.add(96); // -----> only Strings
        s1.add("Hello");
        // for (Object object : s1) {
        // System.out.println(object);
        // }

        /** Throws Exception, Should be sorted and synchronized externally */
        // TreeSet ----> Constructs a new, empty tree set, sorted according to the
        // natural ordering of its elements.
        // Set s2= new TreeSet();
        // s2.add("Hello");
        // s2.add("Munna Bhaiya");
        // s2.add("Hello");
        // s2.add("Chota Cheems");
        // s2.add("Hello");
        // s2.add(96);
        // s2.add("Hello");
        // for (Object object : s2) {
        // System.out.println(object);
        // }

        /**
         * Map-----> key values pairs
         */

        // HashMap
        Map<String, String> m1 = new HashMap<>();
        m1.put("Sad", "Nibba");
        m1.put("key", "value");
        m1.put("Deepankar", "Sharma");
        m1.put("Sam", "Winchester");
        // m1.put("you", 4); //------> key and values should be String
        // m1.put(4.5, false); //------> key and values should be String
        // for (Object key : m1.keySet()) {
        // System.out.println(key+ " : "+ m1.get(key));
        // }

        // HashTable
        Map<Integer, String> m2 = new Hashtable<>();
        m2.put(1, "Nibba");
        m2.put(2, "value");
        m2.put(3, "Deepankar");
        m2.put(4, "Winchester");
        // m2.put("you", 4); //-----> key should be Integer and value should be String
        // m2.put(4.5, false); //-----> key should be Integer and value should be String
        // for (Object key : m2.keySet()) {
        //     System.out.println(key + " : " + m2.get(key));
        // }
    }
}