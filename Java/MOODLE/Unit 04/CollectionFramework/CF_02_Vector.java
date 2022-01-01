import java.util.Iterator;
import java.util.Vector;

/**
 * Vector -----> Slow , Syncronized, Capacity increases by 100%
 */

public class CF_02_Vector {

    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Hello");
        names.add("Hello1");
        names.add("Hello2");
        names.add("Hello3");
        names.add("Hello1");
        names.add("Hello4");

        Iterator i = names.iterator();
        while (i.hasNext())System.out.println(i.next());

        System.out.println(names.get(2));
        System.out.println(names.indexOf("Hello1"));
        System.out.println(names.lastIndexOf("Hello1"));
        System.out.println(names.contains("Hello1"));
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        names.clear();
        System.out.println(names.isEmpty());
    }
}
