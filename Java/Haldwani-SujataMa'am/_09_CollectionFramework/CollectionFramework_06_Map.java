import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionFramework_06_Map {
    public static void main(String[] args) {
        /**
         * Map<Key, Value> -----> (key, value) pairs, unordered, returns null if key is not present
         * Keys ---> Set of keys {unique}
         * Values ----> List of values {can be duplicate}
         */

        // Map<String, String> myMap= new HashMap<>(); // unordered because of Hashing, non synchronized, fast, and can have one 'null' key
        // Map<String, String> myMap= new Hashtable<>(); // unordered because of Hashing, synchronized--> Thread Safe and can't have any 'null' key
        // Map<String, String> myMap= new LinkedHashMap<>(); // fixed insertion order, non synchronized, fast, and can have one 'null' key
        Map<String, String> myMap= new TreeMap<>(); // sorted order, non synchronized, fast, and can't have any 'null' key
       
       
        myMap.put("Lucifer", "Morningstar");
        myMap.put("Chloe", "Decker");
        myMap.put("Deepankar", "Sharma");
        myMap.put("Kuldeep", "Sharma");
        // myMap.put(null, "BCA"); // only allowed in HashMap, LinkedHashMap
        // myMap.put("Chloe", "Morningstar"); // updates

        
        /**
         * {Lucifer=Morningstar, Deepankar=Sharma, Kuldeep=Sharma, Chloe=Decker}
         */
        // System.out.println(myMap);

        Set<String> set= myMap.keySet();
        for (String key : set) {
            System.out.println(key+" "+ myMap.get(key));
        }

        // String key= "Hello";
        // System.out.println(key +" "+ myMap.get(key)); // null because "Hello" is not a key
    }
}
