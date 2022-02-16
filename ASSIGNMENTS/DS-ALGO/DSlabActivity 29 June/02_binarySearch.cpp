#include <stdio.h>

int binarySearch(int *arr, int num)
{
    int beg=0, end=9;
    int mid;
    while (beg<=end)
    {
        mid=(beg+end)/2;
        if(arr[mid]==num)
        {
            printf("Number found at position %d", mid+1);
            return 1;
        }
        else if (num>arr[mid])
        {
            /* code */
            beg=mid+1;
        }
        else if (num<arr[mid])
        {
            /* code */
            end=mid-1;
        }
        
    }

    printf("Element not found !!!");
    return -1;    
}

int main()
{
    int arr[] = {1, 3, 5, 7, 8, 22, 45, 65, 66, 90};
    int i;
    int num;
    printf("Enter the element to be found: ");
    scanf("%d", &num);
    binarySearch(arr, num);    
    return 0;
}