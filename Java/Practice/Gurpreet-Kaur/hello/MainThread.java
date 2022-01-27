class ChildThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ " is executing !!!");
		int a=0,sum=0;
		try
		{
			for(int i=100;i<=200;i++)
			{
				int num=i;
				while(num!=0)
				{
					a=num%10;
					sum=sum+(a*a*a);
					num=num/10;
				}
				if(sum==i)
				{
					System.out.print(i+" ");
					Thread.sleep(1000);
				}
				sum=0;
			}
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("Child thread Interrupted "+e);
		}
	}
}

public class MainThread
{
	public static void main(String [] args)
	{
		int temp=0;
		ChildThread t1=new ChildThread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		try
		{
			System.out.println(Thread.currentThread().getName() + " is executing !!!");

			for(int i=1;i<=100;i++)
			{
				temp=i;
				if(temp%2==0)
				{
					System.out.print(i+" ");
					Thread.sleep(1000);
				}
			}
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("Main thread Interrupted "+ e);
		}
	}
}
