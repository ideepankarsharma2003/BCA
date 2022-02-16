#include<stdio.h>

int main()
{
    int n;
    printf("Enter the size of the array : ");
    scanf("%d", &n);
    printf("\n Enter the elements of the array : \n");
    int arr[100];

    for(int i=0; i<n; i++)
    scanf("%d", &arr[i]);

    for(int i=0; i<n/2; i++)
    {
        int t=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=t;
    }

    printf("\n The elements of the array are : \n");
    for(int i=0; i<n; i++)
    printf("%d\n", arr[i]);

    return 0;
}