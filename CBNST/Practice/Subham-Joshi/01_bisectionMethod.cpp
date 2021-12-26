#include <stdio.h>
#include <math.h>
#define F(x) (x * x * x - 9 * x + 1)

int main()
{
    int z;
    int itr = 1;
    float a, b, i, f, err;
    printf("enter the initial guess a(positive): ");  // a= 0
    scanf("%f", &a);
    printf("enter the initial guess b(negative): ");  // b= 1
    scanf("%f", &b);
    printf("enter the err: "); // err= 0.00001
    scanf("%f", &err);
    // printf("enter the number of iterations: ");
    // scanf("%d", &z);
    do
    {
        // a ---> positive
        // b ---> negative
        i = (a + b) / 2;
        f = F(i);
        printf("\n itr=%d\t\ta=%f\t\tf(a)=%f\t\tb=%f\t\tf(b)=%f\t\ti=%f\t\tF(i)=%f\n", itr, a, F(a),b, F(b), i, f);
        if (f< 0)
        {
            b = i;
        }
        else
        {
            a = i;
        }
        itr++;

    } while (fabs(F(i))>err);
    // } while (z--);
    printf("\n approximate root =%.4f", i);
    return 0;
}