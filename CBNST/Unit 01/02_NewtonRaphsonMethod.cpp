#include <stdio.h>
#include <math.h>
#include <stdlib.h>

#define phi(x) (pow(2.718282, -1*x)-sin(x))
// #define phi(x) tan(x)-x
// #define phi(x) (x * x * x - (3 * x) - 5)

double differential(double x0)
{
    const double delta = 1.0e-10;
    double x1= x0-delta;
    double x2= x0+delta;

    double y1=phi(x1);
    double y2=phi(x2);

    // printf("gradient= %f\n", grad);
    return (y2-y1)/(x2-x1);
    // return (pow(-2.718282, -1*x)-cos(x));
}


// double differential(double x)
// {
//     return (3 * x * x - 3);
// }

int main()
{
    int k = 0;
    double x1, x0 ,f0, f1, g0;
    int step = 1, N;
    double allErr;
    printf("Enter the allowed Error: ");
    scanf(" %lf", &allErr);
    int i1, i2;
    printf("Enter the interval lower limit: ");
    scanf(" %d", &i1);
    printf("Enter the interval upper limit: ");
    scanf(" %d", &i2);

    printf("\nEnter the initial guess x0: ");
    scanf("%lf", &x0);
    printf("Enter maximum iteration:\n");
    scanf("%d", &N);
    {
        if (x0 <= i2 && x0 >= i1)
        {
            printf("\nStep\t\tx0\t\tf(x0)\t\tf'(x0)\t\tx1\t\tf(x1)\n");
            do
            {
                g0 = differential(x0);
                f0 = phi(x0);
                if (g0 == 0.0)
                {
                    printf("Mathematical Error.");
                    exit(0);
                }

                x1 = x0 - (f0 / g0);

                printf("%d\t\t%f\t%f\t%f\t%f\t%f\n", step, x0, f0, g0, x1, f1);
                x0 = x1;

                step = step + 1;

                if (step > N)
                {
                    printf("Not Convergent.");
                    exit(0);
                }

                f1 = phi(x1);

            } while (fabs(f1) > allErr);

            printf("\nRoot is: %f\n", x1);
        }
        else
        {
            printf("You entered wrong initial guess, needed something between %d and %d !!!", i1, i2);
        }
    }
}