public class _04_superException extends RuntimeException{
    _04_superException(String s){
        super(s);
    }
    
    public static void main(String[] args) {
        try {
            throw new _04_superException("This is a Runtime exception");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("This will always execute !!!");
        }
    }
}
