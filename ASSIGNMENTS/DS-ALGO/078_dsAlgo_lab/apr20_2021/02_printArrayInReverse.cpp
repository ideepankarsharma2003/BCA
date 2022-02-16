#include<stdio.h>

int main()
{
    int arr[20], lar, n;

    printf("Enter the number of elements : ");
    scanf("%d", &n);
    
    
    for(int i=0; i<n; i++)
    {
        printf("\nEnter the element [%d] : ", i+1);
        scanf("%d", &arr[i]);
    }

    printf("\nThe array is  : \n");
    for(int i=0; i<n; i++)
    {
        printf("%d\t", arr[i]);
    }

    printf("\nThe array in reverse is  : \n");
    for(int i=n-1; i>-1; i--)
    {
        printf("%d\t", arr[i]);
    }

    // lar=arr[0];

    // for(int i=0; i<n; i++)
    // {
    //     if(arr[i]>lar)
    //        lar=arr[i];        
    // }

    // printf("\n\n\n\nThe largest element in the array is  :  %d \n\n\n", lar);


    return 0;
}
