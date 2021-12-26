#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter the number of unknown variables: ";
    cin >> n;
    double arr[n][n + 1];
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
            cout << arr[i][j] << "\t";
        }
        printf("\n");
    }

    printf("\n\n");

    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            double p = arr[j][i] / arr[i][i];
            // printf("%lf\n", p);

            for (int k = 0; k < n + 1; k++)
            {
                arr[j][k] = arr[j][k] - p * arr[i][k];
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
}
