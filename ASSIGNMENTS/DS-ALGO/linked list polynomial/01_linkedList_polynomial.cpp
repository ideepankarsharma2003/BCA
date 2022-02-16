#include <stdio.h>
#include <stdlib.h>

struct node
{
    int exp;
    float coef;
    struct node *next;
};

// funtion append
// appends ptr1 to ptr2
void append(struct node *ptr1, struct node *ptr2)
{
    struct node *ptr = ptr2;
    while (ptr->next != NULL)
        ptr = ptr->next;
    ptr->next = ptr1;
}

// function for traversal
void traversal(struct node *head)
{
    struct node *temp = head;
    while (temp->next != NULL)
    {
        printf("%4.1f(x)^%d + ", temp->coef, temp->exp);
        temp = temp->next;
    }
    printf("%4.1f(x)^%d\n\n", temp->coef, temp->exp);
}

// function for insertion
struct node *insertion(struct node *head, int ex, float cof)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    // printf("%4.2fx^%d\n", cof, ex);
    temp->coef = cof;
    temp->exp = ex;
    temp->next = NULL;
    // printf("%4.2fx^%d\n", temp->coef, temp->exp);
    if (head == NULL)
        head = temp;
    else
    {
        struct node *ptr = head;
        while (ptr->next != NULL)
            ptr = ptr->next;

        ptr->next = temp;
    }
    return head;
}

// function to add two polynomials
// pn1 + pn2 = pn3
struct node *addPoly(struct node *pn3, struct node *pn1, struct node *pn2)
{
    struct node *m1 = pn1;
    struct node *m2 = pn2;
    struct node *m3 = (struct node*)malloc(sizeof(struct node));

    while((m1!=NULL)||(m2!=NULL))
    {
        // when power of m1's term is higher than that of m2's
        while(m1->exp > m2->exp)
        {
            m3->exp = m1->exp;
            m3->coef = m1->coef;
            append(m3,pn3);
            m1 = m1->next;
        }

        // when power of m2's term is higher than that of m1's
        while (m1->exp < m2->exp)
        {
            m3->exp  = m2->exp;
            m3->coef = m2->coef;
            append(m3,pn3);
            m2 = m2->next;
        }

        // when power of m2's term is equal to that of m1's
        while (m1->exp == m2->exp)
        {
            m3->exp  = m2->exp;
            m3->coef = m2->coef + m1->coef;
            append(m3,pn3);
            m2 = m2->next;
            m1 = m1->next;
        }
    }

    // if list 2 exhausts, appending list 1 to pn3
    if(m1!=NULL)
        append(m1, pn3);

    // if list 1 exhausts, appending list 2 to pn3
    else
        append(m2, pn3);

    return pn3;
}

int main()
{
    char ch = 'y';
    struct node *pn1 = NULL, *pn2 = NULL, *pn3 = NULL;

    printf("Polynomial 1: \n");
    while (ch == 'y')
    {
        int ex;
        float cof;
        printf("Enter Coefficient : ");
        scanf("%f", &cof);
        printf("Enter Exponent : ");
        scanf("%d", &ex);
        pn1 = insertion(pn1, ex, cof);
        printf("Do you want to insert more terms(y/n): ");
        fflush(stdin);
        scanf("%c", &ch);
    }

    printf("The polynomial 1 is : ");
    traversal(pn1);

    ch = 'y'; // reinitialising y = 'y'

    printf("Polynomial 2: \n");
    while (ch == 'y')
    {
        int ex;
        float cof;
        printf("Enter Coefficient : ");
        scanf("%f", &cof);
        printf("Enter Exponent : ");
        scanf("%d", &ex);
        pn2 = insertion(pn2, ex, cof);
        printf("Do you want to insert more terms(y/n): ");
        fflush(stdin);
        scanf("%c", &ch);
    }

    printf("The polynomial 2 is : ");
    traversal(pn2);

    // append(pn1,pn2);  // append pn1 to pn2, just for test :)
    // traversal(pn2);

    // pn3 = addPoly(pn3, pn2, pn1);
    // traversal(pn3);

    return 0;
}