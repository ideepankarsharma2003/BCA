#include <stdio.h>
#include <math.h>
#include <stdlib.h>

float arr[3][4], x[3];
int n = 3;
/*
    CBNST Page No.454
    8x-3y+2z=20
    4x+11y-z=33 
    6x+3y+12z=35 
*/
#define x(y0, z0) (arr[0][3] - (arr[0][2] * z0 + arr[0][1] * y0)) / arr[0][0]
#define y(x0, z0) (arr[1][3] - (arr[1][2] * z0 + arr[1][0] * x0)) / arr[1][1]
#define z(y0, x0) (arr[2][3] - (arr[2][0] * x0 + arr[2][1] * y0)) / arr[2][2]

void checkValidity()
{
    for (int i = 0; i < n; i++)
    {
        float sum = 0;
        for (int j = 0; j < n; j++)
        {
            if (i != j)
            {
                sum += fabs(arr[i][j]);
            }
        }
        if ((fabs(arr[i][i]) - sum) < 0)
        {
            printf("Can't apply iteration method !!!!\n\n");
            exit(1);
        }
    }
    printf("Can apply iteration method !!!!\n\n");
}

int main()
{

    printf("Enter coefficients of Augmented Matrix:\n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n + 1; j++)
        {
            printf("a[%d][%d] = ", i, j);
            scanf("%f", &arr[i][j]);
        }
    }
    checkValidity();

    int iter = 1;
    float allErr, fabx, faby, fabz, deltaX, deltaY, deltaZ;
    float x0 = 0.0, y0 = 0.0, z0 = 0.0;
    printf("Enter the allowed error: ");
    scanf(" %f", &allErr);

    printf("\n\nIteration\t\tx0\t\ty0\t\tz0\t\t\tx1\t\ty1\t\tz1\n\n");
    do
    {
        /* code */
        float xTemp = x0;
        float yTemp = y0;
        float zTemp = z0;
        fabx = fabs(x(y0, z0));
        deltaX = fabs(x0 - fabx);
        x0 = fabx; // Immediate Updation
        faby = fabs(y(x0, z0));
        deltaY = fabs(y0 - faby);
        y0 = faby; // Immediate Updation
        fabz = fabs(z(y0, x0));
        deltaZ = fabs(z0 - fabz);
        z0 = fabz; // Immediate Updation
        printf("%d\t\t\t%f\t%f\t%f\t\t%f\t%f\t%f\n", iter, xTemp, yTemp, zTemp, fabx, faby, fabz);
        iter++;

        // } while (iter<15);
    } while ((deltaX > allErr) || (deltaY > allErr) || (deltaZ > allErr));

    printf("\n\nThe roots are: \n");
    printf("x= %f\n", fabx);
    printf("y= %f\n", faby);
    printf("z= %f\n", fabz);

    return 0;
}