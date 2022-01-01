import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionFramework_04_ComparatorInterface {
    public static void main(String[] args) {
        List <Integer> values= new ArrayList<>();
        values.add(451);
        values.add(4357);
        values.add(453);
        values.add(745);
        values.add(12);

        // for (Integer integer : values) {
        //     System.out.println(integer);
        // }
        
        // Collections.sort(values); // ascending order
        // for (Integer integer : values) {
        //     System.out.println(integer);
        // }

        // Collections.reverse(values); // NOT REALLY (descending order), Just reverse the way elements exist in list
        // for (Integer integer : values) {
        //     System.out.println(integer);
        // }



        Comparator<Integer> desComparator= new CollectionFramework_04_ComparatorInterfaceImplementation();
        Collections.sort(values, desComparator); // sort in descending order
        // for (Integer integer : values) {
        //     System.out.println(integer);
        // }
        
        
        Comparator<Integer> comLastDigits= new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if((o1%10)>(o2%10))
                    return 1; // swap 
                return -1;
            }
            
        };
        Collections.sort(values, comLastDigits); // sort on basis of last digits 
        for (Integer integer : values) {
            System.out.println(integer);
        }
        
    }
}

