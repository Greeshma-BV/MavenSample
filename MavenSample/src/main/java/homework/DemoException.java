package homework;

import java.util.Scanner;

public class DemoException {

	public static void main(String[] args)
	{
		System.out.println("Program is started");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		double f;
		char a[]=new char[2];
		a[0]='A';
		a[1]='C';
		
		try
		{
			System.out.println( f=100/num);
			System.out.println(a[3]);

		}
		catch(ArithmeticException e)
		{
			System.out.println("exception occure");
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException exception occure");
		}*/
		finally
		{
		System.out.println("exiculte the rest of the code");
		}
		
	}

}
