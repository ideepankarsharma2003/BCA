#include<stdio.h>
#include<stdlib.h>


void show(int *arr, int n){

    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");   
}

void delt(int *La, int n, int k)
{
    for (int i = k; i < n-1; i++)
    {
        La[i] = La[i + 1];
    }  
}


int main()
{
    int * arr = (int*) malloc(100*sizeof(int));
    arr[0] = 6;
    arr[1] = 56;
    arr[2] = 45; 
    arr[3] = 5; 
    arr[4] = 234; 
    arr[5] = 55; 
    int size = 5, index = 5;
    show(arr, size);
    delt(arr, size, index);
    size -= 1;
    show(arr, size);
    return 0;
}