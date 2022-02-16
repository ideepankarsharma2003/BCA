#include <stdio.h>
int main()
{
    int a=1, b, fact=1;
    printf("Enter the number: ");
    scanf("%d", &a);
    b=a;
    while (a>0)
    {
        fact*=a;
        a--;
    }
    printf("The factorial of %d is %d", b, fact);

    return 0;
}