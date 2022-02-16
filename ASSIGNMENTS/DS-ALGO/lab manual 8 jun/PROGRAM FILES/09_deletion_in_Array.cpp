#include <stdio.h>

void show(int arr[], int n)
{

    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void delt(int *La, int n, int k)
{
    for (int i = k; i < n - 1; i++)
    {
        La[i] = La[i + 1];
    }
}

int main()
{
    int arr[100] = {7, 8, 12, 27, 88};
    int size = 5, index = 0;
    show(arr, size);
    delt(arr, size, index);
    size -= 1;
    show(arr, size);
    return 0;
}