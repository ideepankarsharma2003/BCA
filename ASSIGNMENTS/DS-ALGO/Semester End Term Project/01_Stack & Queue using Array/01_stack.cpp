#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int stack[50];
int top=-1;

// insertion
void insertion(int num)
{
    if(top==49)
    {
        printf("\nStack is full !!!!\n\n");
        return;
    }
    else
    {
        top=top+1;
        stack[top]=num;
    }
}

// deletion
void deletion()
{
    if (top == -1)
    {
        printf("\nStack is already empty !!!!\n");
        return;
    }
    else
    {
        int temp=stack[top];
        top = top - 1;
        printf("\nElement deleted is %d\n", temp);
    }
}

// display
void display()
{
    if (top == -1)
    {
        printf("\nStack is empty !!!!\n");
        return;
    }
    else
    {
        for(int i=0; i<=top; i++)
        {
            printf("\n%d", stack[i]);
        }
    printf("\n");
    }
}

// peek
void peek()
{
    if (top == -1)
    {
        printf("\nStack is empty !!!!\n");
        return;
    }
    else
    {
        printf("\n%d\n", stack[top]);
    }
}

int main()
{
    char ch[5]="yes";
    do
    {
        int choice;
        printf("\nSelect your choice:\n1.Insertion\n2.Deletion\n3.Display\n4.Peek\n5.exit\n");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            int num;
            printf("Enter the number to insert: ");
            scanf("%d", &num);
            insertion(num);
            break;
        
        case 2:
            deletion();
            break;
        
        case 3: 
            display();
            break;

        case 4:
            peek();
            break;

        case 5:
            printf("\nTerminating the program !!!");
            exit(1);
            break;

        default:
            printf("Wrong choice !!!!!!!!!\n");

        }

        printf("\n\nDo you want to continue(yes/no):   ");
        fflush(stdin);
        gets(ch);

    } while (strcmp(ch,"yes")==0);
    
    return 0;
}