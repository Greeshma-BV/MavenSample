package homework;

public class Prime 
{

	public static void main(String[] args) 
	{
		int n=153;
		String s=Integer.toString(n);
		int length=s.length();
		for(int i=0;i<=length;i++)
		{
			int digit=Integer.parseInt(s);
			double arm= Math.pow(digit, 3);
		}
		
		
	}

}
