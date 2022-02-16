#include <stdio.h>
int main()
{
    int a;
    int first=0, second=1, next=0;
    printf("Enter the range for the series: ");
    scanf("%d", &a);
    printf("The series upto %d terms is: \n", a);
    while(a--)
    {
        printf("%d\n", next);
        first=second;
        second=next;
        next=first+second;
    }
    
    return 0;
}