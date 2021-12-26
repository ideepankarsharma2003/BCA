public class _52_StringMethods_01 {
    public static void main(String[] args) {
        String str = "Hello Deepankar";

        System.out.println("The string is: "+ str);
        System.out.println("The string in uppercase is: "+ str.toUpperCase());
        System.out.println("The string in lowercase is: "+ str.toLowerCase());

        char ch= str.charAt(7);
        System.out.println("The character at index 7 is: "+ ch);

        int len= str.length();
        System.out.println("The length of the string is: "+ len);
    }
}
