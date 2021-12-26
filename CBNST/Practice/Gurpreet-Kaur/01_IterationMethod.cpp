#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float func(float x)
{
    return (x * x * x - (3 * x) - 5); //FUNCTION TO BE SOLVED
}
float func1(float x)
{
    return (3 * x * x - 3); //differentiation of a Function
}

int main()
{

    int i = 0, pos = 0, n = 0;
    float x1, x0;
    // float f0, f1;
    // float df0;

    while (1)
    {
        if (func(i) == 0)
            printf("Exact Root Found %d !!!", i);
        if (func(i) * func(i + 1) < 0)
        {
            pos++;
            break;
        }
        i++;
    }
    // end of while

    if (pos)
    {
        x0 = i;
        x1 = i + 1;
        printf("Range of given function is from %.0f to %.0f\n", x0, x1); //RANGE OF FUNCTION COMES OUT
    }

    else
    {
        printf("SORRY!! Range of the given function NOT FOUND.");
    }


    if (pos)
    {
        printf("The Calculation Table of Newton Raphson Method:-\n");
        printf("ITERATION \t xi \t\t f(xi) \t\t f'(xi)\n");
        x1 = ((float)x0 - (func(x0) / func1(x0)));
        printf("\n%d \t\t %.4f \t %.4f \t %.4f\n", i - 1, x0, func(x0), func1(x0));
        x0 = x1;
        do
        {
            x1 = ((float)x0 - (func(x0) / func1(x0)));
            printf("\n%d \t\t %.4f \t %.4f \t %.4f\n", i + 1, x0, func(x0), func1(x0));
            x0 = x1;
        } while ((func(x0)) >= .0001f);
        printf("\n%d \t\t %.4f \t %.4f \t %.4f\n", i + 1, x0, func(x0), func1(x0));
    }
    printf("ROOT OF THE GIVEN EQUATION IS: %.4f\n", x0);
    return 0;
}