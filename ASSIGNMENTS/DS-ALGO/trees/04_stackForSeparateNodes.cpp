#include <stdio.h>
#include<stdlib.h>
#define MAX 10

void display();
void create_list(int del);
void push(int st[], int a);
int pop(int st[]);

int n, a, i, del;
int top = -1;
int st[MAX];

struct node
{
    int data;
    struct node *next;
};
struct node *start = NULL;
struct node *temp = NULL;
int main()
{
    printf("enter number\n");
    scanf("%d", &n);
    while (n != 0)
    {
        a = n % 10;
        push(st, a);
        n = n / 10;
    }
    while (top != -1)
    {
        del = pop(st);
        create_list(del);
    }
    display();
}

void push(int st[], int a)
{
    if (top == (MAX - 1))
        printf("overflow\n");
    else
    {
        top++;
        st[top] = a;
    }
}

int pop(int st[])
{
    int dv;
    if (top == -1)
        printf("underflow\n");
    else
    {
        dv = st[top];
        top--;
        return (dv);
    }
}

void create_list(int del)
{

    struct node *link = (struct node *)malloc(sizeof(struct node));
    link->data = del;
    link->next = NULL;
    if (start == NULL)
        start = temp = link;
    else
    {
        temp->next = link;
        temp = link;
    }
}

void display()
{
    if (start == NULL)
        printf("list is empty");
    temp = start;
    printf("list is\n");
    while (temp != NULL)
    {
        printf("%d", temp->data);
        temp = temp->next;
    }
    printf("\n");
}