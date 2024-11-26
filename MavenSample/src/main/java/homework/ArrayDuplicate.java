package homework;

public class ArrayDuplicate 
{

	public static void main(String[] args)
	{
		int a[]= {100,200,300,100,400,100};
		int b=100;
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==b)
			{
				count++;
			}

		}
		System.out.println(count);


	}

}
