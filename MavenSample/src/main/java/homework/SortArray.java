package homework;

public class SortArray 
{

	public static void main(String[] args) 
	{
		int a[]= {200,500,300,400,100};
		int b;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=1;j<=(a.length-1)-i;j++)
			{
				if(a[j-1]>a[j])
				{
					b=a[j-1];
					a[j-1]=a[j];
					a[j]=b;
					System.out.println(a[j]);
					
				}
				
				else
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
