#include<stdio.h>

int linearSearch(int *arr, int num)
{
    int i;
    for (i = 0; i < 10; i++)
    {
        if (arr[i] == num)
        {
            printf("Number found at index %d", i + 1);
            return 1;
        }
    }

    printf("Number not found !!!");
    return 0;
}

int main()
{
    int arr[] = {1, 3, 5, 7, 8, 22, 65, 66, 45, 90};
    int num;
    printf("Enter the element to be found: ");
    scanf("%d", &num);
    linearSearch(arr, num);
    return 0;    
}