#include<stdio.h>

int queue[50];
int f=-1, r =-1;

void insert(int value)
{
	if(r==49)
	{
		printf("Queue is full !!!");
		return;
	}
	
//	queue is empty
	if(f==-1)
	{
		f++;
		
	}
	r++;
	queue[r] = value;
}

void del()
{
	int item = queue[f];
	if(f==-1)
	{
		printf("Underflow!!!");
		return;
	}
	
		
		
//		queue have only one element
		if(f==r)
		{
			f=-1;
			r=-1;
		}

		
		else
		    f++;
		
	
	
	printf("The item deleted is %d .", item);
}

void display()
{
	for(int i=f; i<=r; i++)
	printf("%d\n",queue[i]);
}



int main()
{
	int value;
	char choice = 'y';
	do
	  {
	  	int func;
	  	printf("\n\n\nSelect an operation : \n1.Insertion\n2.Deletion\n3.Display\n");
	  	scanf("%d",&func);
	  	
	  	switch(func)
	  	    {
	  	    	case 1: 
	  	    	    printf("Enter the value to insert :");
	  	    	    scanf("%d", &value);
	  	    	    insert(value);
	  	    	    break;
	  	    	
	  	    	case 2:
	  	    		del();
	  	    		break;
	  	    	
	  	    	case 3:
	  	    		display();
	  	    		break;
	  	    	
	  	    	default:
	  	    		printf("Wrong Selection !!!!!!");
					    	    	    
			}
	  	
	  	
	  	printf("\n\nEnter your choice to continue (y/n): ");
	  	fflush(stdin);
	  	scanf("%c", &choice);
	  	
	  }while(choice=='y');
	  
	return 0;
}


