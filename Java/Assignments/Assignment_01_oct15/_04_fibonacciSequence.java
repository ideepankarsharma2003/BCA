public class _04_fibonacciSequence {
    public static void main(String[] args) {
        int n1=0, n2=1, n3;
        int num= Integer.parseInt(args[0]);
        System.out.println("The fibonacci series upto "+ num+ " terms is: ");
        System.out.print(n1+ " "+ n2);
        for(int i=0; i<num; i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+ n3);
        }
    }
}
