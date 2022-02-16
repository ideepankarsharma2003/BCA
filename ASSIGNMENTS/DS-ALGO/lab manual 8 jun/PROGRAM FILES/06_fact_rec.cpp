#include <stdio.h>

int fact(int n)
{
    if(n==1 || n==0)
        return 1;
    else
        return (n*fact(n-1));
}

int main()
{
    int a = 1;
    printf("Enter the number: ");
    scanf("%d", &a);
    printf("The factorial of %d is %d", a, fact(a));
    return 0;
}