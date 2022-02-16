#include<stdio.h>
#define MAX 5

void printArr(int arr[MAX][MAX], int r, int c)
{
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%d\t",arr[i][j]);
        }
        printf("\n");
    }
}

void tpsArr(int arr[MAX][MAX], int r, int c)
{
    for (int i = 0; i < c; i++)
    {
        for (int j = 0; j < r; j++)
        {
            printf("%d\t", arr[j][i]);
        }
        printf("\n");
    }
}

int main()
{
    int r, c;
    printf("Enter the number of rows: ");
    scanf("%d", &r);
    printf("Enter the number of columns: ");
    scanf("%d", &c);
    int arr[MAX][MAX];
    for(int i=0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            printf("Enter the element[%d][%d]: ", i+1, j+1);
            scanf("%d", &arr[i][j]);
        }
    }

    printf("\n\n\nThe original matrix is : \n");
    printArr(arr, r, c);
    printf("\n\n\nThe transpose of the matrix is : \n");
    tpsArr(arr, r, c);

    return 0;
}