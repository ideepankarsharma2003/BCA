import java.util.Comparator;

public class CollectionFramework_04_ComparatorInterfaceImplementation implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o2 > o1) {
            return 1; // swap
        }
        return -1;
    }   
    
}
