#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct node
{
    int data;
    struct node*next;
};

int isEmpty(struct node*top)
{
    if(top==NULL)
       return 1;
    else
       return 0;
}

int isFull(struct node *top)
{
    struct node*p=(struct node*)malloc(sizeof(struct node));
    if (p == NULL)
        return 1;
    else
        return 0;
}

struct node* push(struct node*top, int num)
{
    if(isFull(top))
    {
        printf("Stack Overflow !!!!\n");
        return top;
    }

    else
    {
        struct node* n = (struct node*)malloc(sizeof(struct node));
        n->data=num;
        n->next=top;
        top=n;
        return top;
    }
}

int pop(struct node **top)
{
    if (isEmpty(*top))
    {
        printf("Stack Underflow !!!!  :  ");
        return -1;
    }

    else
    {
        struct node *n = *top;
        *top=(*top)->next;
        int num= n->data;
        free(n);
        printf("Element popped:  ");
        return num;
    }
}

int main()
{
    struct node*top=NULL;

    char str[10] = "yes";
    do
    {
        int choice;
        printf("\n1.Push\n2.Pop\n3.Display\n4.Peek\n5.isEmpty\n6.isFull\n7.Exit\n\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {

        case 1:
            int num;
            printf("Enter the value to insert: ");
            scanf("%d", &num);
            top = push(top, num);
            break;

        case 2:
            int val;
            val = pop(&top);
            printf("%d\n", val);
            break;

        case 5:
            if (isEmpty(top))
                printf("The stack is empty.\n");
            else
                printf("The stack is not empty.\n");
            break;

        case 6:
            if (isFull(top))
                printf("The stack is full.\n");
            else
                printf("The stack is not full.\n");
            break;

        case 7:
            printf("The program is terminating !!!!\n");
            exit(1);
            break;

        default:
            printf("Wrong Choice !!!\n");
            break;
        }

        printf("\nDo you want to continue(yes/no):  ");
        fflush(stdin);
        gets(str);
    } while (strcmp(str, "yes") == 0);

    return 0;
}