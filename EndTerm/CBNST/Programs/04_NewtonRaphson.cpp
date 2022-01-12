#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#define f(x) x *x *x - 2 * x + 1
#define f_dash(x) 3*x*x - 2

int main()
{
    int iter = 1;
    float a, b, c, allerr;
    printf("Enter the initial guess a: ");
    scanf(" %f", &a);
    
    

    printf("Enter the allowed error: ");
    scanf(" %f", &allerr);
    printf("\n\na\t\tf(a)\t\tf_dash(a)\tc= a- f(a)/f_dash(a)\n\n");

    do
    {
        /* code */
        float fa= f(a);
        float f_dasha= f_dash(a);
        c = a- fa/f_dasha;

        // printf("\n\na\t\tb\t\tf(a)\t\tf(b)\tc=a- f(a)(b-a)/f(b)-f(a)\tf(c)\n\n");
        printf("%f\t%f\t%f\t%f\n", a, f(a), f_dash(a), c);
        a = c;

        iter++;
        // } while (iter<2);
    } while (fabs(f(c)) > allerr);

    printf("The root of the equation is %f\n", c);

    return 0;
}