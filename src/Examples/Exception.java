package Examples;

public class Exception {

	public static void main(String[] args) {
		int a=30,b=0;
		try {
			if(a/b==0)
			{
				System.out.println("Divisible by zero");
			}
		
		}

		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
