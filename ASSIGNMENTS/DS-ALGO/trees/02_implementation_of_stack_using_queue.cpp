#include <stdio.h>
#include <stdlib.h>
#define MAX 50

void push1(int);
void push2(int);
int pop1();
int pop2();
void enqueue();
void dequeue();
void display();

int s1[MAX], s2[MAX];
int top1 = -1, top2 = -1;
int count = 0;

int main()
{
    int ch;

    while (ch != 4)
    {
        printf("\nEnter 1 - Enqueue element into queue\n");
        printf("Enter 2 - Dequeue element from queue\n");
        printf("Enter 3 - Display the queue\n");
        printf("Enter 4 - Exit\n");
        printf("\nEnter choice\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            enqueue();
            break;

        case 2:
            dequeue();
            break;

        case 3:
            display();
            break;

        case 4:
            exit(0);
            break;

        default:
            printf("Wrong choice");
        }
    }
}

//Function to push the element in the stack one
void push1(int data)
{
    if (top1 == MAX - 1)
        printf("Queue Overflows\n");
    else
    {
        top1++;
        s1[top1] = data;
    }
}

//Function to push an element in the stack two
void push2(int data)
{
    top2++;
    s2[top2] = data;
}

//Function to pop the element from the stack one
int pop1()
{
    if(top1!=-1)
        return (s1[top1--]);
}

//Function to pop an element from the stack two
int pop2()
{
    if (top2 != -1)
        return (s2[top2--]);
}

//Function to add an element into the queue using stack
void enqueue()
{
    int data, i;

    printf("Enter data into queue: ");
    scanf("%d", &data);

    push1(data);
    count++;
}

//Function to delete an element from the queue using stack
void dequeue()
{
    int i, a, b;
    if (top1 == -1 && top2 == -1)
        printf("Queue underflows\n");
    else
    {
        for (i = 0; i < count; i++)
        {
            a = pop1(); // Pop elements from stack one
            // printf("a=%d\n",a);
            push2(a);   //push them to stack two
            // printf("top2=%d\n",top2);
            // printf("[top2]=%d\n\n",s2[top2]);
        }
        b = pop2(); // Pop the element from stack two which is the element to be dequeued
        printf("Dequeued element is %d\n", b);
        count--;
        for (i = 0; i < count; i++)
        {
            a = pop2();
            push1(a); // Push back all the elements from stack two to stack one
        }
    }
}

//Function to display the elements of queue using stack
void display()
{
    if(count==0)
    {
        printf("QUEUE IS EMPTY !!!\n");
    }
    else
    {
        int i;
        for (i = 0; i <= top1; i++)
        {
            printf(" %d ", s1[i]);
        }
        printf("\n");
    }
}