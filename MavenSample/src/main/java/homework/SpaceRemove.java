package homework;

import java.util.Scanner;

public class SpaceRemove {

	public static void main(String[] args) 
	{
		int count=0;
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter the string");
		//String text=s.next();
		String text="we l co me";
		char[] s=text.toCharArray();
		System.out.println(text.replace(" ", ""));
		for(int i=0;i<=s.length-1;i++)
		{
			for(int j=i+1;j<=s.length-1-i;j++)
				if(s[i]==s[j])
			count=count+1;
			
		}
		System.out.println(count);
	}

}

