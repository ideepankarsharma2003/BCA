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
    int x, count=0;
    printf("Enter the number whose occurance you wanna find :  ");
    scanf("%d",&x);
    for(int i=0; i<n; i++)
       if(arr1[i]==x)
          count++;
    printf("The number %d occurs %d times in the array !!!!", x, count);
    return 0;
}