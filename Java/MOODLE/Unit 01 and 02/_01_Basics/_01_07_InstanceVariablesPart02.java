class Demo
{
	final int i=9;
	final double j;
	{
		j=9.67;
	}
	void m()
	{
		System.out.println("Value of i is:" + i);
		System.out.println("Value of j is:" + j);
	}
}

class _01_07_InstanceVariablesPart02
{
	public static void main(String[] args){
		Demo obj = new Demo();
		System.out.println("No Default Values ** final modifier **: ");
		obj.m();
		
	}
}