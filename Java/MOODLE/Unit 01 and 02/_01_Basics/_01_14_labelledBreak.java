public class _01_14_labelledBreak {
    public static void main(String[] args) {
        label: for(int i=1; i<=5; i++) // label is a label
        {
            for(int j=1; j<=5; j++)
            {
                if(j==2){
                    System.out.println("Continue!!!");
                    continue;
                }
                if(j==3 && i==3)break label; // breaks both the loops
                System.out.println("Inner 'for' loop & j="+j);
            }
            System.out.println("Outer 'for' loop & i="+i+"\n\n");
        }
        System.out.println("Out of both 'for' loop");
    }
    
}
