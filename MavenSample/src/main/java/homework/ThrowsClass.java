package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsClass {
	void calculate()throws ArithmeticException
	{
	int a=10,b=20;
	 int sum=a+b;
	 if(sum<45)
	 {
		 System.out.println("num is less");
	 }
	 
	}

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
		System.out.println("Start program");
		System.out.println("program ongoing");
		Thread.sleep(5000);
		//FileInputStream file=new FileInputStream("c://TEXT.text");
			
		System.out.println("at the final stage");
		System.out.println("program ended");
		ThrowsClass tc=new ThrowsClass();
		
		tc.calculate();
	}

}
