#include <stdio.h>
#include <malloc.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

struct node *temp;
int num;

struct node *create(int num)
{

    temp = (struct node *)malloc(sizeof(struct node));
    if (temp == NULL)
        printf("not enough memory\n");
    else
    {
        temp->data = num;
        temp->left = NULL;
        temp->right = NULL;
    }
    return (temp);
}

struct node* insert(struct node *root, struct node *temp1)
{
    if (root ==NULL)return temp;

    if (temp1->data > root->data)
    {
        root->right=insert(root->right, temp);
    }
    else
    {
        root->left=insert(root->left, temp);
    }
    return root;
}

void preorder(struct node *root)
{
    if (root != NULL)
    {
        printf("%d\n", root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void inorder(struct node *root)
{
    if (root != NULL)
    {
        inorder(root->left);
        printf("%d\n", root->data);
        inorder(root->right);
    }
}

void postorder(struct node *root)
{
    if (root != NULL)
    {
        postorder(root->left);
        postorder(root->right);
        printf("%d\n", root->data);
    }
}

struct node *minValueNode(struct node *root)
{
    struct node *current = root;

    while (current && current->left != NULL)
        current = current->left;

    return current;
}

struct node *deleteNode(struct node *root, int a)
{
    if (root == NULL)
        return root;

    if (a < root->data)
        root->left = deleteNode(root->left, a);

    else if (a > root->data)
        root->right = deleteNode(root->right, a);

    else
    {
        // node with only one child or no child
        if (root->left == NULL)
        {
            temp = root->right;
            free(root);
            return temp;
        }
        else if (root->right == NULL)
        {
            temp = root->left;
            free(root);
            return temp;
        }

        // node with two children:
        // Get the inorder successor
        // (smallest in the right subtree)
        temp = minValueNode(root->right);

        // Copy the inorder
        // successor's content to this node
        root->data = temp->data;

        // Delete the inorder successor
        root->right = deleteNode(root->right, temp->data);
    }
    return root;
}

int totalNodes(struct node *root)
{
    int count = 0;

    if (root == NULL)
        return 0;

    else
    {
        count+=1;
        count += totalNodes(root->left);
        count += totalNodes(root->right);
        return count;
    }
}

void deleteTree(struct node *root)
{
    if (root == NULL)
        return;

    /* first delete both subtrees */
    deleteTree(root->left);
    deleteTree(root->right);

    /* then delete the node */
    printf("\n Deleting node: %d", root->data);
    free(root);
}




int main()
{
    
    int ch, val;
    struct node *root = NULL, *temp;

    do
    {
        printf("\n **MAIN MENU* \n");
        printf("1. create/Insert element\n");
        printf("2. Preorder Traversal\n");
        printf("3. Inorder Traversal\n");
        printf("4. Postorder Traversal\n");
        printf("5. Delete an element\n");
        printf("6. Count the total number of nodes\n");
        printf("7. Delete the tree\n");
        printf("8. Exit\n");
        printf("Enter your option :\n ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("Enter the element\n");
            scanf("%d", &num);
            temp = create(num);
            root=insert(root, temp);
            break;

        case 2:
            printf("\n The elements of the tree are : \n");
            preorder(root);
            break;

        case 3:
            printf("\n The elements of the tree are : \n");
            inorder(root);
            break;

        case 4:
            printf("\n The elements of the tree are : \n");
            postorder(root);
            break;

        case 5:
            printf("\n Enter the element to be deleted : ");
            scanf("%d", &val);
            root = deleteNode(root, val);
            break;

        case 6:
            printf("\n Total no. of nodes = %d", totalNodes(root));
            break;

        case 7:
            deleteTree(root);
            break;
        }
    } while (ch != 8);

    return 0;
}