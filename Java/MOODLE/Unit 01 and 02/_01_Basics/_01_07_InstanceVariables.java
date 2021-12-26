class Demo
{
	int i;
	double j;
	void m()
	{
		System.out.println("Value of i is:" + i);
		System.out.println("Value of j is:" + j);
	}
}

class _01_07_InstanceVariables
{
	public static void main(String[] args){
		Demo obj = new Demo();
		System.out.println("Default Values: ");
		obj.m();
		// Initializing the values
		obj.i=10;
		obj.j=1.2;
		System.out.println("After Initializing Values: ");
		obj.m();
		
		
	}
}