public class _02_CustomExceptions extends java.lang.Exception{
    // overridden methods
    public String toString(){
        return "This is the toString() method also called in 'System.out.println(e)' !!!";
    }
    public String getMessage(){
        return "This is the getMessage() method";
    }

    public static void main(String[] args) {
        try{
            throw new _02_CustomExceptions();
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally{
            System.out.println("This will always execute !!!");
        }
    }
}

