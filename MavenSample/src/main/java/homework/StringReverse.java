package homework;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) 
	{
		String rev="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string name");
		String text=scanner.next();
		for(int i=text.length()-1;i>=0;i--)
		{
			rev=rev+text.charAt(i);

		}
		System.out.println(rev);
		if(rev.equals(text))
		{
			System.out.println("String palindrom");
		}
		else
			System.out.println("not palindrom");
		/*char a[]=text.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
			System.out.println(rev);*/
		
		//StringBuffer f=new StringBuffer("hello");
		//System.out.println( f.reverse());
		//StringBuilder f=new StringBuilder("hello");
		//System.out.println( f.reverse());
		


	}

}
