import java.util.LinkedList;

class CollectionFramework_07_Node{
    int data;
    CollectionFramework_07_Node(int data){
        this.data= data;
    }
}

public class CollectionFramework_07_LinkedList {
    public static void main(String[] args) {
        LinkedList<CollectionFramework_07_Node> list = new LinkedList<>();

        list.add(new CollectionFramework_07_Node(56));
        list.add(new CollectionFramework_07_Node(89));
        list.add(new CollectionFramework_07_Node(56));
        list.add(2, new CollectionFramework_07_Node(256)); // add 256 at index 2
        list.add(new CollectionFramework_07_Node(526));
        list.add(new CollectionFramework_07_Node(43));
        list.add(5, new CollectionFramework_07_Node(534)); // add 534 at index 5

        // list.forEach(System.out::println);

        for (CollectionFramework_07_Node collectionFramework_07_Node : list) {
            System.out.println(collectionFramework_07_Node.data);
        }
    }
}
