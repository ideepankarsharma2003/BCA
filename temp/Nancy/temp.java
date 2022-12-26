
class Papatemp {

    public Papatemp() {
        System.out.println("This is papa Temp");
    }

    
}

class Betatemp extends Papatemp {

    public Betatemp() {
        System.out.println("This is beta temp");
    }

    
}
/**
 * temp
 */
public class temp {

    public static void main(String[] args) {
        Betatemp b= new Betatemp();
        
        Papatemp p= new Betatemp();
        
        Papatemp p2= new Papatemp();
    }
}