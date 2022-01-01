import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionFramework_05_Student implements Comparable<CollectionFramework_05_Student>{
    int rollNo;
    int marks;

    CollectionFramework_05_Student(int rollNo, int marks){
        this.rollNo= rollNo;
        this.marks= marks;
    }

    @Override
    public String toString() {
        return "Student{"+ "Roll No= "+ rollNo+ ", Marks= "+ marks+ "} ";
    }


    @Override
    public int compareTo(CollectionFramework_05_Student o) {
        // highest marks on the top !!!
        return this.marks> o.marks? -1: this.marks<o.marks?1: 0;
    }


}

public class CollectionFramework_05_ComparableInterface {
    public static void main(String[] args) {
        List<CollectionFramework_05_Student> studs= new ArrayList<>();
        studs.add(new CollectionFramework_05_Student(1, 45));
        studs.add(new CollectionFramework_05_Student(2, 78));
        studs.add(new CollectionFramework_05_Student(3, 89));
        studs.add(new CollectionFramework_05_Student(6, 39));
        studs.add(new CollectionFramework_05_Student(5, 98));
        studs.add(new CollectionFramework_05_Student(4, 33));

        // for (CollectionFramework_05_Student collectionFramework_05_Student : studs) {
        //     System.out.println(collectionFramework_05_Student);
        // }
        
        Collections.sort(studs);
        for (CollectionFramework_05_Student collectionFramework_05_Student : studs) {
            System.out.println(collectionFramework_05_Student);
        }
    }
}
