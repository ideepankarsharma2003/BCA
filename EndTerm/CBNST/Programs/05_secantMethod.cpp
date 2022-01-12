#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#define f(x) x *x *x - 2 * x + 1

int main()
{
    int iter = 1;
    float a, b, c, allerr;
    printf("Enter the initial guess a: ");
    scanf(" %f", &a);

    printf("Enter the initial guess b: ");
    scanf(" %f", &b);

    printf("Enter the allowed error: ");
    scanf(" %f", &allerr);
    printf("\n\na\t\tb\t\tf(a)\t\tf(b)\tc= a- f(a)(b-a)/(f(a)-f(b)\n\n");

    do
    {
        /* code */
        float fa = f(a);
        float fb = f(b);
        c = a -fa*(b-a)/(fb-fa);

        // printf("\n\na\t\tb\t\tf(a)\t\tf(b)\tc=a- f(a)(b-a)/f(b)-f(a)\tf(c)\n\n");
        printf("%f\t%f\t%f\t%f\t%f\n", a, b, f(a), f(b), c);
        a = b;
        b = c;

        iter++;
        // } while (iter<2);
    } while (fabs(f(c)) > allerr);

    printf("The root of the equation is %f\n", c);

    return 0;
}