package Examples;

public class Variables {
	int a=5;
	static int c=8;
	static
	{
			System.out.println("Hello Java");
			System.out.println(c);
	}
	public void display1()
	{
		int b=10;
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
	}
	public static void display()
	{
		int b=10;
		//System.out.println(a);
		
		System.out.println(b);
		
		
		
		
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		new Variables().display1();
		Variables.display();
	}

}
