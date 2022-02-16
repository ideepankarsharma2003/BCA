#include<stdio.h>

int main()
{
    int n;
    int arr1[100], arr2[100];
    printf("Enter the size of the array : ");
    scanf("%d", &n);
    
    printf("\n Enter the elements of the array1 : \n");
    for(int i=0; i<n; i++)
    scanf("%d", &arr1[i]);

    printf("\n Enter the elements of the array2 : \n");
    for(int i=0; i<n; i++)
    scanf("%d", &arr2[i]);


    printf("\n \nThe common elements of the array1 and array2 are : \n");


    for(int i=0; i<n; i++)
    {
       for(int j=0; j<n; j++)
       if(arr1[i]==arr2[j])
       printf("%d\n", arr1[i]);

    }

    return 0;
}