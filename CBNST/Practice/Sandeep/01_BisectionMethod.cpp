#include <stdio.h>
#include <math.h>
#define f(x) x *x *x - 4 * x - 9
int main()
{
    float a, b, x, aerr;
    int itr = 0, flag = 0;
    // a ---> positive
    do
    {
        printf("Enter the initial guess a(positive): ");
        scanf(" %f", &a);
    } while (f(a)< 0);


    // b ---> negative
    do
    {
        printf("Enter the initial guess b(negative): ");
        scanf(" %f", &b);
    } while (f(b)> 0);


    printf("\nthe root lies between the intervals %f and %f", a, b);
    printf("\nenter the allowed error: ");
    scanf("%f", &aerr);
    do
    {
        itr++;
        x = (a + b) / 2;
        printf("\n %d iteration \t|\t value of x : %f \t|\t value of f(x) : %f", itr, x, f(x));
        if (fabs(f(x)) < aerr)
        {
            printf("\nthe root is %f at %d iteration\n\n", x, itr);
            flag = 1;
        }
        else if (f(x) < 0)
            b = x;
        else
            a = x;

    } while (flag == 0);
}