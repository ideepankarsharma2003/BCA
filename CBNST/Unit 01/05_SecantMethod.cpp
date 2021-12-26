#include <stdio.h>
#include <math.h>
#include <stdlib.h>

#define phi(x) (x * x + 4 * sin(x))

double differential(double x0)
{
    const double delta = 1.0e-10;
    double x1 = x0 - delta;
    double x2 = x0 + delta;

    double y1 = phi(x1);
    double y2 = phi(x2);

    // printf("gradient= %f\n", grad);
    return (y2 - y1) / (x2 - x1);
    // return (pow(-2.718282, -1*x)-cos(x));
}

int main()
{
    int k = 0;
    double x0, x1, x2, f0, f1, f2, g0;
    int step = 1, N;
    double allErr;
    printf("Enter the allowed Error: ");
    scanf(" %lf", &allErr);
    printf("Enter the interval lower limit: ");
    scanf(" %lf", &x0);
    printf("Enter the interval upper limit: ");
    scanf(" %lf", &x1);

    printf("Enter maximum iteration:  ");
    scanf("%d", &N);
    {
        {
            printf("\nStep\t\tx0\t\tx1\t\tf(x0)\t\tf(x1)\t\tx2=(x0f1-x1f0)/(f1-f0)\t\tf(x2)\n");
            do
            {
                f0 = phi(x0);
                f1 = phi(x1);
                if (f0 == f1)
                {
                    printf("Mathematical Error.");
                    exit(0);
                }

                x2 = x1 - (x1 - x0) * f1 / (f1 - f0);
                f2 = phi(x2);

                printf("%d\t\t%f\t%f\t%f\t%f\t%f\t\t\t\t%f\n", step, x0, x1, f0, f1, x2, f2);

                x0 = x1;
                f0 = f1;
                x1 = x2;
                f1 = f2;

                step = step + 1;

                if (step > N)
                {
                    printf("Not Convergent.");
                    exit(0);
                }
            } while (fabs(f2) > allErr);

            printf("\nRoot is: %f\n", x1);
        }
    }
}