#include <stdio.h>
#include <math.h>
int main()
{
    float tv, av, ea, er, ep;
    printf("enter true value: ", tv);
    scanf("%f", &tv);
    printf("enter approx value: ", av);
    scanf("%f", &av);
    ea = fabs(tv - av);
    er = ea / tv;
    ep = er * 100;
    printf("absolute error is = %.3f \n", ea);
    printf("relative error is = %.3f \n", er);
    printf("percentage error is = %.3f % \n", ep);
    return 0;
}