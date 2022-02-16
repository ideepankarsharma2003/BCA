#include <stdio.h>
#include <stdlib.h>

struct node
{
    char data;
    struct node *next;
};

// void create(); // to create a node in the linked list

void printLL(struct node *head)
{
    struct node *ptr = head;
    while (ptr != NULL)
    {
        printf("%c\t", ptr->data);
        ptr = ptr->next;
    }

    printf("\n");
}

struct node* delete_at_first(struct node *head, char ch) // to delete the first occurance of the character
{
    if(head->data==ch)
    {
        struct node*temp=head;
        head = head->next;
        free(temp);
        return head;
    }

    else
    {
        struct node *ptr = head;
        while (ptr->next != NULL)
        {
            if (ptr->next->data == ch)
            {
                struct node *temp = ptr->next;
                ptr->next = temp->next;
                free(temp);
                return head;
            }
            ptr = ptr->next;
        }

        if(ptr->data=='ch')
        ptr=NULL;
    }

    return head;
}

struct node* delete_all(struct node *head, char ch) // to delete all the occurances of the character
{
    struct node*ptr=head;
    while(ptr!=NULL)
    {
        head=delete_at_first(head, 'a');
        ptr=ptr->next;
    }

    return head;
}

void delete_at_last(char ch); // to delete the last occurance of the character

int main()
{
    struct node *head = (struct node *)malloc(sizeof(struct node));
    head->data = 'a';

    struct node *ptr1 = (struct node *)malloc(sizeof(struct node));
    ptr1->data = 'b';

    struct node *ptr2 = (struct node *)malloc(sizeof(struct node));
    ptr2->data = 'a';

    struct node *ptr3 = (struct node *)malloc(sizeof(struct node));
    ptr3->data = 'c';
    ptr3->next = NULL;

    head->next = ptr1;
    ptr1->next = ptr2;
    ptr2->next = ptr3;

    printLL(head);

    // head = delete_at_first(head, 'a');
    // printLL(head);

    // head = delete_at_first(head, 'a');
    // printLL(head); 



    head = delete_all(head, 'a');
    printLL(head);

    return 0;
}
