#include<stdio.h>

int main()
{
    int n;
    int arr1[100];
    printf("Enter the size of the array : ");
    scanf("%d", &n);
    
    printf("\n Enter the elements of the array : \n");
    for(int i=0; i<n; i++)
    scanf("%d", &arr1[i]);
    printf("\n\n\n The elements of the array : \n");
    for(int i=0; i<n; i++)
    printf("%d\n", arr1[i]);

    int *small=arr1, *large=arr1;

    for(int i=0; i<n; i++)
    {
        if(arr1[i]<*small)small=&arr1[i];
        if(arr1[i]>*large)large=&arr1[i];
    }

    int temp=*small;
    *small=*large;
    *large=temp;
    

    printf("\n\nAfter Interchanging !!!!\n");
    for(int i=0; i<n; i++)
    printf("%d\n", arr1[i]);

    return 0;
}