import java.util.*;
class Series{
    public static void main(String[] args){
        int n;
        float i;
        float sum=0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 'n': ");
        n= sc.nextInt();
        for(i=1.0f; i<n; i++){
        sum+=1/i;
        System.out.print(1+ "/"+ i+ "  +  ");
        }
        sum+=1/i;
        System.out.println(1+ "/"+ i+ " = "+ sum);
        sc.close();
    }
}
