#include <stdio.h>
#include <math.h>

#define MAX 10
float arr[MAX][MAX], x[MAX], ratio;

void displayMatrixSolution(int n){
    for (int i = 1; i <= n; i++)
    {
        printf("x[%d] = %0.3f\n", i, x[i]);
    }
    printf("\n\n");
}

void displayMatrix(int n){
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n + 1; j++)
        {
            printf("%f\t", arr[i][j]);
        }
        printf("\n");
    }
    printf("\n\n");
}

int main()
{
    int i, j, k, n;

    printf("Enter number of unknowns: ");
    scanf("%d", &n);
    printf("Enter coefficients of Augmented Matrix:\n");
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n + 1; j++)
        {
            printf("a[%d][%d] = ", i, j);
            scanf("%f", &arr[i][j]);
        }
    }

    printf("The augmented matrix is: \n");
    displayMatrix(n);

    // Diagonal Matrix
    for (i = 1; i <= n; i++)
    {
        if (arr[i][i] == 0.0)
        {
            printf("Mathematical Error!");
            exit(0);
        }
        for (j = 1; j <= n; j++)
        {
            if (i != j)
            {
                ratio = arr[j][i] / arr[i][i];
                for (k = 1; k <= n + 1; k++)
                {
                    arr[j][k] = arr[j][k] - ratio * arr[i][k];
                }
            }
        }
    }
    
    
    printf("The augmented diagonal matrix is: \n");
    displayMatrix(n);

    // solving variables
    for (i = 1; i <= n; i++)
    {
        x[i] = arr[i][n + 1] / arr[i][i];
    }


    printf("\nSolution:\n");
    displayMatrixSolution(n);
    
    return (0);
}