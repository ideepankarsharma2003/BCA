class _01_10_CommandLineArguments
{
	// hello World one two three "Hello World" 5 6
	public static void main(String [] args)
	{
		System.out.println("The second argument is: "+ args[1]);
		
		// Printing all the arguments
		System.out.println("\nAll arguments are: ");
		for(int i=0; i<args.length; i++)System.out.print(args[i]+'\t');
		
		// Concatenation
		System.out.println("\n\n\nThe 'Concatenation' of 7 & 8 argument is: "+ args[6]+args[7]);
		
		// Addition
		int a= Integer.parseInt(args[6]);
		int b= Integer.parseInt(args[7]);
		System.out.println("\nThe 'Addition' of 7 & 8 argument is: "+ (a+b));
	}
}