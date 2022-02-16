#include<stdio.h>
#include<stdlib.h>


void show(int *arr, int n){

    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");   
}

int ins(int *La, int n, int item, int k)
{
    if(n>=100)
    {
        printf("The array is full Already !!!!!");
        return -1;
    }
    int j =n-1;
    while(j>=k)
    {
        La[j+1] = La[j];
        j = j-1;
    }
    La[k] = item;
    return 1; 
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

    int size = 5, element = 45, index=1;
    show(arr, size); 
    ins(arr, size, element, index);
    size +=1;
    show(arr, size);
    return 0;
}