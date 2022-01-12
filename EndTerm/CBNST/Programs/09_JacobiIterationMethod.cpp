#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#define MAX 10
float arr[3][4],x[3];
int n;
/*
    CBNST Page No.454
    8x-3y+2z=20
    4x+11y-z=33 
    6x+3y+12z=35 
*/
#define x(y0, z0) (20 - 2 * z0 + 3 * y0) / 8
#define y(x0, z0) (33 + z0 - 4 * x0) / 11
#define z(y0, x0) (35 - 6 * x0 - 3 * y0) / 12

void checkValidity(){
    for (int i = 0; i < n; i++)
    {
        float sum=0;
        for(int j=0; j<n; j++){
            if(i!=j){
                sum+=fabs(arr[i][j]);
            }
        }
        if((fabs(arr[i][i])-sum)<0){
            printf("Can't apply iteration method !!!!\n\n");
            exit(1);
        }
    }
    printf("Can apply iteration method !!!!\n\n");
}

int main()
{
    printf("Enter the number of unknown variables: ");
    scanf("%d", &n);
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
        fabx = fabs(x(y0, z0));
        deltaX = fabs(x0 - fabx);
        faby = fabs(y(x0, z0));
        deltaY = fabs(y0 - faby);
        fabz = fabs(z(y0, x0));
        deltaZ = fabs(z0 - fabz);
        printf("%d\t\t\t%f\t%f\t%f\t\t%f\t%f\t%f\n", iter, x0, y0, z0, fabx, faby, fabz);
        x0 = fabx;
        y0 = faby;
        z0 = fabz;
        iter++;

        // } while (iter<15);
    } while ((deltaX > allErr) && (deltaY > allErr) && (deltaZ > allErr));

    printf("\n\nThe roots are: \n");
    printf("x= %f\n", fabx);
    printf("y= %f\n", faby);
    printf("z= %f\n", fabz);
    return 0;
}