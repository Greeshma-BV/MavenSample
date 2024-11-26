package homework;

import java.util.Scanner;

public class Revnum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String rev="";
		/*for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
		if(s==rev)
		{
			System.out.println("String is palindrom");
			
		}
		else
		{
			System.out.println("not palindrom");
		}

		

	}

}
