class _08_NumObj{
    static int count=0;
    _08_NumObj(){
        countObj();
    }
    static void countObj(){ // static method to count number of objects made of the class
        count++;
    }
}


public class _08_numberOfObject {
    public static void main(String[] args) {
        // _08_NumObj obj1 = new _08_NumObj();
        // _08_NumObj obj2 = new _08_NumObj();
        // _08_NumObj obj3 = new _08_NumObj();
        System.out.println("Number of objects made of class '_08_NumObj' is: "+ _08_NumObj.count);
    }
}
