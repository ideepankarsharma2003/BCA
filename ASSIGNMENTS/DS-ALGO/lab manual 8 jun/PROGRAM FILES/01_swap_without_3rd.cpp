#include<stdio.h>
int main()
{
    int a, b;
    printf("Enter the value 1: ");
    scanf("%d", &a);
    printf("Enter the value 2: ");
    scanf("%d", &b);
    printf("\n\nThe values are:\na = %d\nb = %d\n", a, b);
    a = a+b;
    b=a-b;
    a=a-b;
    printf("\n\nThe values after swapping are:\na = %d\nb = %d\n", a, b);
    return 0;
}