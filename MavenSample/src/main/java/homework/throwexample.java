package homework;

public class throwexample 
{

	void method(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		throw new ArithmeticException();
	}
	public static void main(String[] args) 
	{
		throwexample t=new throwexample();
		try
		{
			t.method(3, 6);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception");
		}
	}

}
