#include <stdio.h>
// #include <iostream>
// using namespace std;

int main()
{
    int n;
    // cout<<"Enter the number of unknown variables: ";
    printf("Enter the number of unknown variables: ");
    // cin>>n;
    scanf(" %d", &n);

    double arr[n][n + 1];

    double X[n]; // variable array
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n + 1; j++)
        {
            printf("Enter arr[%d][%d]: ", i, j);
            scanf("%lf", &arr[i][j]);
        }
    }

    printf("\n\n");

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n + 1; j++)
        {
            printf("%.6lf\t", arr[i][j]);
        }
        printf("\n");
    }

    printf("\n\n");

    // diagonal matrix

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            double p = arr[j][i] / arr[i][i];
            // printf("%lf\n", p);
            if (i != j)
            {
                for (int k = 0; k < n + 1; k++)
                {
                    arr[j][k] = arr[j][k] - p * arr[i][k];
                }
            }
        }
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n + 1; j++)
        {
            printf("%.6lf\t", arr[i][j]);
        }
        printf("\n");
    }

    printf("\n\n");

    // solution

    for (int i = n - 1; i >= 0; i--)
    {

        X[i] = (arr[i][n]) / arr[i][i];
    }

    printf("The values of unknown variables is: \n");
    for (int i = 0; i < n; i++)
    {
        printf("X[%d]= %lf\n", i, X[i]);
    }
}