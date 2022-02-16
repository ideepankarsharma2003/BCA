#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct stack
{
    int size;
    int top;
    int *arr;
};

// to check if the stack is empty
int isEmpty(struct stack* st)
{
    if(st->top==-1)return 1;
    else return 0;
}

// to check if the stack is full
int isFull(struct stack *st)
{
    if (st->top == st->size-1)
        return 1;
    else
        return 0;
}

// to insert the element in the stack
void push(struct stack* st, int num)
{
    if(isFull(st))
    {
        printf("Stack Overflow!!!!");
    }

    else
    {
        st->top++;
        st->arr[st->top]=num;
    }
}

// to pop the element from the stack
int pop(struct stack *st)
{
    if(isEmpty(st))
    {
        printf("Stack underflow !!! :  ");
        return -1;
    }
    else
    {
        int val = st->arr[st->top];
        st->top--;
        printf("Element popped :  ");
        return val;
    }
}

int main()
{
    struct stack *st = (struct stack*)malloc(sizeof(struct stack));
    st->top=-1;
    printf("Enter the size of the stack: ");
    scanf("%d",&st->size);
    
    st->arr = (int *)malloc(st->size*sizeof(int));

    char str[10]="yes";
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
            push(st,num);
            break;

        case 2:
            int val ;
            val= pop(st);
            printf("%d\n", val);
            break;

        case 5:
            if(isEmpty(st))
                printf("The stack is empty.\n");
            else
                printf("The stack is not empty. The top is at %d.\n",st->top);
            break;

        case 6:
            if (isFull(st))
                printf("The stack is full.\n");
            else
                printf("The stack is not full.The top is at %d.\n", st->top);
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
    } while (strcmp(str, "yes")==0);
    
    

    return 0;
}