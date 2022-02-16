#include<stdio.h>

int fiboRec(int n)
{
    if(n==0||n==1)return 1;
    // if(n==1)return 1;
    return(n*fiboRec(n-1));
}

int main()
{
    int n;
    printf("Enter the number : ");
    scanf("%d", &n);
    printf("The factorial of %d is: %d \n", n,fiboRec(n));
    // for(int i=0; i<=n; i++)
    // {
    //    int z = fiboRec(i);
    //    printf("%d\t",z );
    // }
    return 0;
}