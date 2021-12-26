class Demo
{
	byte x= -127; // ** -128 to 127 **
	// otherwise compile time exception
	int z= 789;
	int m= 12345678;
	short y= 32767;	
	char ch= 97;
	boolean b;	
}

class _01_04_DataTypesPart02
{
	public static void main(String args[]){
		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.m);
		System.out.println((char)obj.ch);
		System.out.println(obj.b);
	}
}
