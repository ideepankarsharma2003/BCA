#include <stdio.h>
#include <math.h>
#define max 10
float arr[max][max] = {0};
float X[max] = {0};

void dispMatrix(int n)
{
    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < n + 1; j++)
        {

            printf("%f\t", arr[i][j]);
        }
        printf("\n");
    }
}
void dispMatrixSolution(int n)
{
    for (int i = 0; i < n; i++)
    {
        /* code */
        // for (int j = 0; j < n; j++)
        // {

        printf("X[%d]: %f", i, X[i]);
        // }
        printf("\n");
    }
}
int main()
{
    int n;
    printf("Enter the number of unknown variables: ");
    scanf("%d", &n);
    printf("Enter the elements of the matrix: \n");
    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < n + 1; j++)
        {
            printf("arr[%d][%d]: ", i, j);
            scanf("%f", &arr[i][j]);
        }
    }

    printf("The matrix is : \n");
    dispMatrix(n);
    // utm
    for (int i = 0; i < n ; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if(i!=j)
            {
                float p = arr[j][i] / arr[i][i];
                for (int k = 0; k < n + 1; k++)
                {
                    arr[j][k] -= p * arr[i][k];
                }
            }
        }
    }

    printf("The Diagonal Matrix is: \n");

    dispMatrix(n);

    // // backward substitution
    // for (int i = n - 1; i >= 0; i--)
    // {
    //     float sum = 0;
    //     for (int j = i + 1; j < n; j++)
    //     {
    //         sum += arr[i][j] * X[j];
    //     }
    //     X[i] = arr[i][n] - sum;
    //     X[i] /= arr[i][i];
    // }

    // solving the equations
    for(int i=0; i<n; i++){
        X[i]= arr[i][n]/arr[i][i];
    }
    printf("The solution matrix is: \n");
    dispMatrixSolution(n);

    return 0;
}