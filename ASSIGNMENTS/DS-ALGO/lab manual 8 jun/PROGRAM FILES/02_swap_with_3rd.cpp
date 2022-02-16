#include <stdio.h>
int main()
{
    int a, b, c;
    printf("Enter the value 1: ");
    scanf("%d", &a);
    printf("Enter the value 2: ");
    scanf("%d", &b);
    printf("\n\nThe values are:\na = %d\nb = %d\n", a, b);
    c=a;
    a=b;
    b=c;
    printf("\n\nThe values after swapping are:\na = %d\nb = %d\n", a, b);
    return 0;
}