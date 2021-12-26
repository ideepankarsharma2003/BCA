// /**
//  * _01_fibonicci
//  */
// public class _01_fibonicci{
//     public static void main(String[] args){
//         int n=Integer.parseInt(args[0]);
//         System.out.println("Entered no. is "+n);
//         int term1=0;
//         int term2=1;
//         int nextterm=0;

//         while(term1<=n){
//             System.out.print(term1);
//             if(term1!=n)
//             System.out.print(' ');
//             nextterm=term1+term2;
//             term1=term2;
//             term2=nextterm;
//         }
//         System.out.println();
//     }
// }


class fibonacci {
      
    public static void main(String[] args)
    {
        int n=Integer.parseInt(args[0]);
        System.out.println("Entered no. is"+n);
        int term1=0;
        int term2=1;
        int nextterm=0;
        while(term1<=n)
        {
            System.out.print(term1);
            if(term1!=n)
            System.out.print(' ');
            nextterm=term1+term2;
            term1=term2;
            term2=nextterm;
        }
    }
}