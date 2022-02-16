#include <stdio.h>
#include <stdlib.h>


struct node
{
    int ex;
    int co;
    struct node *next;
};


// append the nodes in the linked lists
struct node *alloc(struct node *head, struct node *newe)
{
    struct node *temp;
    temp = head;
    if (head == NULL)
    {
        head = newe; // head was NULL, so appended newe directly
        return head;
    }


    else if (newe->ex > head->ex)
    {
        newe->next = head; // because newe->ex > head->ex -----> therefore appended head in newe
        return newe; 
    }

    else
    {
        while (temp->next != NULL && newe->ex < temp->next->ex)
        {
            temp = temp->next;
        }
        if (temp->next == NULL)
        {
            temp->next = newe; // append newe to head list
            return head;
        }
        else
        {
            newe->next = temp->next;
            temp->next = newe;
            return head;
        }
    }
}

// function to create Linked Lists
struct node *create(struct node *head)
{
    struct node *newe;
    newe = (struct node *)malloc(sizeof(struct node));
    printf("enter cofient\n");
    scanf("%d", &newe->co);
    printf("enter exopnent\n");
    scanf("%d", &newe->ex);
    newe->next = NULL;
    head = alloc(head, newe);
    return head;
}

// function to traverse through the linked list
void traverse(struct node *head)
{
    struct node *temp;
    temp = head;
    while (temp != NULL)
    {
        printf("%d", temp->co);
        printf("x");
        printf("%d", temp->ex);
        if (temp->next != NULL)
            printf(" + ");
        temp = temp->next;
    }
}
struct node *sum(struct node *head, struct node *head2)
{
    struct node *newe;
    struct node *newe1;
    newe1 = (struct node *)malloc(sizeof(struct node));
    newe = NULL;
    struct node *temp;
    struct node *temp2;
    temp = head;
    temp2 = head2;
    while (temp != NULL && temp2 != NULL)
    {
        if (temp->ex == temp2->ex)
        {
            newe1->co = temp->co + temp2->co;
            newe1->ex = temp->ex;
            if (newe == NULL)
                newe1->next = NULL;
            else
                newe1->next = newe;
            temp = temp->next;
            temp2 = temp2->next;
            newe = newe1;
        }
        else if (temp->ex > temp2->ex)
        {
            newe1->co = temp->co;
            newe1->ex = temp->ex;
            if (newe == NULL)
                newe1->next = NULL;
            else
                newe1->next = newe;
            temp = temp->next;
            newe = newe1;
        }
        else if (temp->ex < temp2->ex)
        {
            newe1->co = temp2->co;
            newe1->ex = temp2->ex;
            if (newe == NULL)
                newe1->next = NULL;
            else
                newe1->next = newe;
            temp2 = temp2->next;
            newe = newe1;
        }
    }
    while (temp != NULL)
    {
        newe1->co = temp->co;
        newe1->ex = temp->ex;
        if (newe == NULL)
            newe1->next = NULL;
        else
            newe1->next = newe;
        temp = temp->next;
        newe = newe1;
    }
    while (temp2 != NULL)
    {
        newe1->co = temp2->co;
        newe1->ex = temp2->ex;
        if (newe == NULL)
            newe1->next = NULL;
        else
            newe1->next = newe;
        temp2 = temp2->next;
        newe = newe1;
    }
    return newe;
}
int main()
{
    int n, n2;
    printf("enter the number of node\n");
    scanf("%d", &n);
    struct node *head;
    head = NULL;
    struct node *head2;
    head2 = NULL;
    for (int i = 0; i < n; i++)
    {
        head = create(head);
    }
    traverse(head);

    printf("\n");
    printf("enter the number of node\n");
    scanf("%d", &n2);
    for (int i = 0; i < n2; i++)
    {
        head2 = create(head2);
    }
    traverse(head2);
    struct node *add;
    add = NULL;
    add = sum(head, head2);
    printf("\nadd\n");
    traverse(add);
}