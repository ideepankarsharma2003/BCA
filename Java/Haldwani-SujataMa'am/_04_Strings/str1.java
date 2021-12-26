class str1
{
    
    public static void main(String[] args)
    {
        String str1="Hello";
        String str2="World !!";
        String str3=new String("World !!");
        String str4=new String("458.99");
        String str5="World !!";

        // equals()
        System.out.println("equals(): ");
        boolean b=str5.equals(str2);
        System.out.println(b);
        System.out.println(str2==str5);
        System.out.println(str5.equals(str3));
        System.out.println(str3==str5);        
        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): ");
        System.out.println("Hello".equals("hello"));
        System.out.println("Hello".equalsIgnoreCase("hello"));

        
        // contains()
        System.out.println("\ncontains(): ");
        System.out.println(str1.contains("Hello"));

        
        // concat()
        System.out.println("\nconcat(): ");
        System.out.println(str1.concat(" "+str2));
        System.out.println(str1+ " "+ str2);

        
        // substring()
        System.out.println("\nsubstring(): ");
        System.out.println(str1.substring(2));
        
        
        // join()
        System.out.println("\njoin(): ");
        String message = String.join("-", "Java", "is", "cool");
        // message returned is: "Java-is-cool"
        System.out.println(message);
        System.out.println(String.join(" ",str1, "Detective !!", "Didn't know that you were here."));
        

        // replace()
        System.out.println("\nreplace(): ");
        System.out.println(str1.replace("ll", "mm"));
        
        
        // replaceFirst()
        System.out.println("\nreplaceFirst(): ");
        System.out.println(str1.replaceFirst("l", "mm"));

        
        // replaceAll()
        System.out.println("\nreplaceAll(): ");
        System.out.println(str1.replaceAll("l", "mm"));

        
        // charAt()
        System.out.println("\ncharAt(): ");
        System.out.println(str1.charAt(4));

        
        // toLowerCase()
        System.out.println("\ntoLowerCase(): ");
        System.out.println(str1.toLowerCase());

        
        // toUpperCase()
        System.out.println("\ntoUpperCase(): ");
        System.out.println(str1.toUpperCase());

        
        // startsWith()
        System.out.println("\nstartsWith(): ");
        System.out.println(str1.startsWith("Hell"));

        
        // endsWith()
        System.out.println("\nendsWith(): ");
        System.out.println(str1.endsWith("llo"));

        
        // valueOf()
        System.out.println("\nvalueOf(): ");
        System.out.println(String.valueOf(56.89));
        System.out.println(Double.valueOf(str4));

        
        // isEmpty()
        System.out.println("\nisEmpty(): ");
        System.out.println("".isEmpty());

        
        // compareTo()----> difference of unicode
        System.out.println("\ncompareTo(): ");
        System.out.println(str1.compareTo("Hello ")); // returns 0
        // compareTo()
        System.out.println(str1.compareTo(str2)); // returns negative
        // compareTo()
        System.out.println(str1.compareTo("Ab")); // returns positive


        System.out.println("\nStrings are immutable, hence all the values are preserved: ");
        System.out.println("str1: \""+ str1+ "\"");
        System.out.println("str2: \""+ str2+ "\"");
        System.out.println("str3: \""+ str3+ "\"");
        System.out.println("str4: \""+ str4+ "\"");        
        System.out.println("str5: \""+ str5+ "\"");     
        

    }
}