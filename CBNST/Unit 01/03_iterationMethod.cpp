#include <stdio.h>
#include <math.h>
#include <stdlib.h>

#define phi(x) (7 + log10(x)) / (2)

// double differential(float x0)
// {
//     double grad = phi(x0 + 0.0000001 * x0) - phi(x0);
//     grad /= (0.0000001 * x0);

    // printf("gradient= %f\n", grad);
    // if (grad < 0)
    // {
    //     grad = grad - 2 * grad;
    // }
    // printf("|gradient|= %f\n", grad);

    // return grad;
// }

double differential(double x0)
{
    const double delta = 1.0e-10;
    double x1 = x0 - delta;
    double x2 = x0 + delta;

    double y1 = phi(x1);
    double y2 = phi(x2);

    double grad= (y2 - y1) / (x2 - x1);
    printf("gradient= %f\n", grad);
    if (grad < 0)
    {
        grad = grad - 2 * grad;
    }
    printf("|gradient|= %f\n", grad);

    return grad;
}

int main()
{
    int k = 0;
    double x1, x0;
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
    {
        if (x0 <= i2 && x0 >= i1)
        {
            double grad = differential(x0);

            if (grad <= 1)
            {
                x1 = x0;
                do
                {
                    k++;
                    x0 = x1;
                    x1 = phi(x0);
                    printf("x after iteration %d is: %lf\n", k, x1);
                } while (fabs(x1 - x0) > allErr);
            }

            else
            {
                printf("|gradient|=%f is not less than 1, Hence cannot apply Iteration Method !!!!\n", grad);

                exit(0);
            }

            printf("\n\nOne root is %lf obtained at %d th iteration \n", x1, k);
        }
        else
        {
            printf("You entered wrong initial guess, needed something between %d and %d !!!", i1, i2);
        }
    }
}