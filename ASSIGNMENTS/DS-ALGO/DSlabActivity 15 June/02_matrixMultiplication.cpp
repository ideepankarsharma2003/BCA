#include <stdio.h>
#include<stdlib.h>
#define MAX 5

void printArr(int arr[MAX][MAX], int r, int c)
{
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%d\t", arr[i][j]);
        }
        printf("\n");
    }
    printf("\n\n");
}

void prodMat(int prod[MAX][MAX], int arr1[MAX][MAX], int r1, int c1, int arr2[MAX][MAX], int r2, int c2)
{
    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c2; j++)
        {
            for(int k=0; k<c1; k++)
            {
                prod[i][j]+=arr1[i][k]*arr2[k][j];
            }
        }
    }
}

// void tpsArr(int arr[MAX][MAX], int r, int c)
// {
//     for (int i = 0; i < c; i++)
//     {
//         for (int j = 0; j < r; j++)
//         {
//             printf("%d\t", arr[j][i]);
//         }
//         printf("\n");
//     }
// }

int main()
{
    int r1, c1;
    printf("Enter the number of rows in matrix 1: ");
    scanf("%d", &r1);
    printf("Enter the number of columns in matrix 1: ");
    scanf("%d", &c1);
    int arr1[MAX][MAX];
    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            printf("Enter the element[%d][%d] of matrix 1: ", i + 1, j + 1);
            scanf("%d", &arr1[i][j]);
        }
    }

    printf("\n\n\nThe original matrix 1 is : \n");
    printArr(arr1, r1, c1);

    
    int r2, c2;
    printf("Enter the number of rows in matrix 2: ");
    scanf("%d", &r2);
    if(r2!=c1)
    {
        printf("Can't multiply  :(  ");
        exit(0);
    }
    printf("Enter the number of columns in matrix 2: ");
    scanf("%d", &c2);
    int arr2[MAX][MAX];
    for (int i = 0; i < r2; i++)
    {
        for (int j = 0; j < c2; j++)
        {
            printf("Enter the element[%d][%d] of matrix 2: ", i + 1, j + 1);
            scanf("%d", &arr2[i][j]);
        }
    }

    printf("\n\n\nThe original matrix 2 is : \n");
    printArr(arr2, r2, c2);
    

    int prod[MAX][MAX] = {0};
    prodMat(prod, arr1, r1, c1, arr2, r2, c2 );
    
    printf("\n\n\nThe product of two matrices is : \n");
    printArr(prod, r1, c2);
    return 0;
}