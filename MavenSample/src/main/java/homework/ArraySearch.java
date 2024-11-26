package homework;

public class ArraySearch {

	public static void main(String[] args) 
	{
		int a[]= {100,300,600,400,200};
		int b=600;
		boolean val=false;
		for(int i=0;i<=a.length-1;i++)
		
		{
				if(a[i]==b)
				{
					val=true;
					System.out.println(a[i]+" present");
					break;

				}
				else
				{
					System.out.println("not present");
				}
				
						
		}
		
	}

}

