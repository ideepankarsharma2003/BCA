import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionFramework_06_Set {

    public static void main(String[] args) {
        /**
         * Set -----> unique values , returns false while adding duplicate values
         * Unordered -----> HashSet , uses hashing algorithm, nearest value from heap is fetched 
         * Ordered -------> TreeSet , sorted in ascending order , AVL Tree concept !!!!
         */

        // Set<String> namesSet= new HashSet<>(); // ------> HashSet: stored in unsorted fashion
        Set<String> namesSet= new TreeSet<>(); // ------> TreeSet: sorted alphabetically
        // List<String> namesSet= new ArrayList<>(); // ------> List: stored in order of birth
        namesSet.add("Lucifer Morningstar");
        namesSet.add("Dean Winchester");
        namesSet.add("Daniel August");
        namesSet.add("Dean Winchester");
        namesSet.add("Daniel August");
        namesSet.add("Kevin Levin");
        namesSet.add("Barry Allen");
        // System.out.println(namesSet.add("Amenadiel")); // true -----> because new value
        // System.out.println(namesSet.add("Lucifer Morningstar")); // false -----> because duplicate value
        // System.out.println(namesSet.add("Kevin Levin")); // false -----> because duplicate value

        
        for (String string : namesSet) {
            System.out.println(string);
        }

        /**
         * Set: [Barry Allen, Daniel August, Dean Winchester, Kevin Levin, Lucifer Morningstar]
         * List: [Lucifer Morningstar, Dean Winchester, Daniel August, Dean Winchester, Daniel August, Kevin Levin, Barry Allen]    
         */
        // System.out.println(namesSet); 

    }
}
