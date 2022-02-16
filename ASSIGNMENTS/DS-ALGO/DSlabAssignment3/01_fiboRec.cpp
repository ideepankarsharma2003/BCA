#include<stdio.h>

int fiboRec(int n)
{
    if(n==0)return 0;
    if(n==1)return 1;
    return(fiboRec(n-1)+fiboRec(n-2));
}

int main()
{
    int n;
    printf("Enter the number : ");
    scanf("%d", &n);
    printf("The series upto %d is: \n", n);
    for(int i=0; i<=n; i++)
    {
       int z = fiboRec(i);
       printf("%d\t",z );
    }
    return 0;
}