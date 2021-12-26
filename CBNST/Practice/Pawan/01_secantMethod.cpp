#include <stdio.h>
#include <math.h>
#define f(x) x *x *x - 4 * x - 9
int main()
{
    float x0, x1, x2, fx1, fx0, aerr;
    int itr = 0, flag = 0;

    
        printf("Enter the initial guess a: ");
        scanf("%f", &x0);
    

    do
    {
        printf("Enter the initial guess b: ");
        scanf("%f", &x1);
        fx1= f(x1);
        fx0= f(x0);
    } while (fx1*fx0 < 0);

    printf("\nEnter the allowed error: ");
    scanf("%f", &aerr);

    do
    {
        itr++;
        fx0 = f(x0);
        fx1 = f(x1);

        x2 = ((x0 * fx1) - (x1 * fx0)) / (fx1 - fx0);
        printf("\n iteration %d | value of x: %f | value of f(x): %f", itr, x2, f(x2));
        if (fabs(f(x2)) < aerr)
        {
            printf("\n the root is: %f after %d iteration\n", x2, itr);
            flag = 1;
        }
        x0=x1;
        x1=x2;
    } while (flag == 0);
}