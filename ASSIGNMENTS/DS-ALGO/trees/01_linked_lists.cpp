#include <stdio.h>
#include<stdlib.h>
int main()
{
    // definition 
    struct node
    {
        int data;
        struct node *next;
    };

    struct node *start=NULL;
    struct node *temp=NULL;
    struct node *temp1=NULL;

    int ch=1;
    while(ch)
    {
        struct node *link =(struct node *)malloc(sizeof(struct node));
        printf("enter the data\n");
        scanf("%d", &link->data);
        link->next=NULL;
        if(start==NULL)
            start=link;
        else
        {
            temp1=start;
            while(temp1->next!=NULL)
            {
                temp1=temp1->next;            
            }
            temp1->next=link;
        }

        // 0 to hault loop
        printf("do you want to continue\n");
        scanf("%d",&ch);        
    }

    // check if linked list is empty
    if(start==NULL)
    printf("list is empty");

    else
    {
        temp=start;
        printf("list is\n");
        while(temp!=NULL)
        {
            printf("%d\n", temp->data);
            temp=temp->next;
        }
        printf("\n");
    }
    
    return 0;
}