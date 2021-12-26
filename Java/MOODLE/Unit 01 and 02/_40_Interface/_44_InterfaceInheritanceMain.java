class _44_Child implements _44_InterfaceInheritanceChild{
    public void showLegs(){
        System.out.println("I've two legs !!!!");
    }

    public void showTeeth(){
        System.out.println("I've 32 teeth !!!");
    }
}

public class _44_InterfaceInheritanceMain {
    public static void main(String[] args) {
        _44_Child obj= new _44_Child();
        obj.showLegs();
        obj.showTeeth();
    }
}
