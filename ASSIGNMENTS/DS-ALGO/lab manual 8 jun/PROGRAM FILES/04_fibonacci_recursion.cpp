#include<stdio.h>
int fibo(int n)
{ 
    if(n==0)
        return 0;
    if(n==1)
        return 1;

    return(fibo(n-1)+fibo(n-2));
}

int main()
{
    int a;
    int first = 0, second = 1, next = 0;
    printf("Enter the range for the series: ");
    scanf("%d", &a);
    printf("The series upto %d terms is: \n", a);
    for(int i=0; i<a; i++)
    {
        printf("%d\n", fibo(i));        
    }

    return 0;
}