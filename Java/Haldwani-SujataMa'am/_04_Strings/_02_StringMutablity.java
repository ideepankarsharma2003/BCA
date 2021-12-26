public class _02_StringMutablity{
    public static void main(String[] args) {
        String s1="Tushar";
        s1.concat("JEENa");
        System.out.println(s1);
        // System.out.println(s1.concat("JEENa"));
        
        s1=s1.concat("JEENa");
        System.out.println(s1);

    }
}