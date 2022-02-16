// #include<iostream>
#include<stdio.h>
#define max 100
// using namespace std;

char stack[max]={0};
int top=-1;

// insertion
void insertion(char num)
{
    if (top == max - 1)
    {
        // printf("\nStack is full !!!!\n\n");
        return;
    }
    else
    {
        top = top + 1;
        // cout << top;
        stack[top] = num;
    }
}

// deletion
char deletion()
{
    if (top == -1)
    {
        // printf("\nStack is already empty !!!!\n");
        return -1;
    }
    else
    {
        char temp = stack[top];
        top = top - 1;
        // printf("\nElement deleted is %d\n", temp);
        return temp;
    }
}

int main()
{
    char arr[max];
    int n;
    // cin>>n;
    scanf("%d", &n);
    fflush(stdin);
    fgets(arr, 100, stdin);
   
    // cout<<arr;
    for(int i=0; arr[i]!='\0'; i++)
    {
        // 48 – 57
        if (arr[i] >= 48 && arr[i]<=57)
        insertion(arr[i]);
        
    }

    if(top==-1)
    printf("Next time");


    
    else
    while(top > -1)
    {
        char ch =deletion();
        printf("%c", ch);
    }



}
