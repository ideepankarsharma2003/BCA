#include <stdio.h>
#include <math.h>
#define f(x) x *x *x - 4 * x - 9
int main()
{
    float x0, x1, x2, aerr;
    int itr = 0, flag = 0;

    do
    {
        printf("Enter the initial guess a(negative): ");
        scanf("%f", &x0);
    } while (f(x0) > 0);

    do
    {
        printf("\nEnter the initial guess b(positive): ");
        scanf("%f", &x1);
    } while (f(x1) < 0);

    printf("\nThe root lies between the intervals %f and %f", x0, x1);
    printf("\nEnter the allowed error: ");
    scanf("%f", &aerr);

    do
    {
        itr++;
        float fx0 = f(x0);
        float fx1 = f(x1);

        x2 = ((x0 * fx1) - (x1 * fx0)) / (fx1 - fx0);
        printf("\n iteration %d | value of x: %f | value of f(x): %f", itr, x2, f(x2));
        if (fabs(f(x2)) < aerr)
        {
            printf("\n the root is: %f after %d iteration\n", x2, itr);
            flag = 1;
        }
        else if (f(x2) < 0)
        {
            x0 = x2;
        }
        else
        {
            x1 = x2;
        }
    } while (flag == 0);
}