package homework;

import java.util.Scanner;

public class fibonacci
{
public static void main(String args[])
{	
	int n=5;
	int fib[]=new int[n];
	fib[0]=0;
	fib[1]=1;
	for(int i=2;i<n;i++)
	{
		fib[i]=fib[i-1]+fib[i-2];
		
	}
	System.out.println("Fibonacci Series using For Loop:");

    for (int i = 0; i < n; i++) 
    {

        System.out.print(fib[i] + " ");
    }
}
}
