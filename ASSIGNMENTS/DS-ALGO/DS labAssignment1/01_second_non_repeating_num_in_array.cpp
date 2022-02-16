#include<stdio.h>
int main()
{
    int a[10],b[2],freq=0, count=0;
    printf("Enter the elements of the array : \n");
    for(int i=0; i<10; i++)
    scanf("%d",&a[i]);

    for(int i=0; i<10; i++)
    {
        freq=1;
        for(int j=0; j<10; j++)
        {
            if(a[i]==a[j]&& i!=j)
            {
                freq++;
                
            }
        }

        if(freq==1)
        {
            b[count]=a[i];
            count++;
        }  
        if(count==2)break;

    }

        // printf("\n\nThe first non repeating number is %d\n",b[0]);
        printf("\n\nThe second non repeating number is %d",b[1]);
    return 0;
}

