#include<stdio.h>
void mat_elem(int a[10][10], int r, int c)
{
    for(int i =0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            printf("Element [%d][%d] :   ", i+1, j+1);
            scanf("%d", &a[i][j] );

        }
    }
}


void show_elem(int a[10][10], int r, int c)
{
    for(int i =0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            printf("%d\t ", a[i][j]);
            
        }
            printf("\n");

    }
}

void tps_mat(int a[10][10], int r, int c)
{
    printf("\n\nThe transpose of the matrix is : \n");
    for(int i =0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            printf("%d\t ", a[j][i]);
            
        }
            printf("\n");

    }
}



int main()
{
    int a1[10][10], r1, c1;
    // int a2[10][10], r2, c2;
    // int a3[10][10];

    printf("Enter the number of elements in the row & column of matrix 1 : \n");
    scanf("%d",&r1);
    scanf("%d", &c1);

    // printf("Enter the number of elements in the row & column of matrix 2 : \n");
    // scanf("%d",&r2);
    // scanf("%d", &c2);

    // if(c1!=r2)
    // {
    //     printf("CAN'T MULTIPLY !!!!!!!!!!!!\n");
    //     return 1;
    // }

    printf("\n\nEnter the  elements  of matrix 1 : \n"); 
    mat_elem (a1  ,r1,c1);
    printf("\n\n\nThe matrix is : \n\n");
    show_elem(a1,r1,c1);
    tps_mat(a1,r1,c1);

    // printf("\n\nEnter the  elements  of matrix 2 : \n"); 
    // mat_elem(a2,r2,c2);
    // printf("\n\n\nThe matrix is : \n\n");
    // show_elem(a2,r2,c2);

    // for(int i=0; i<r1; i++)
    // {
    //     for(int j=0; j<c2; j++)
    //     {
    //         a3[i][j]=0;

    //         for(int k=0; k<c1;k++ )
    //             a3[i][j]+=a1[i][k]*a2[k][j];            
    //     }
    // }
    
    // printf("\n\n\nThe resultant matrix is : \n\n");
    // show_elem(a3,r1,c2);

}