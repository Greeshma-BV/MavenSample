package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sample
{
	
	
	public static void main(String[] args) 
	{
		ArrayList <String>arr=new ArrayList();
		arr.add(null);
		arr.add("rose");
		arr.add(null);
		arr.add("jasmin");
		arr.add("Zennia");
		arr.add("sunflower");
		arr.add("Lotus");
		arr.add("lilly");
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(3));
		System.out.println(arr.remove(0));
		ArrayList <String>arr1=new ArrayList();

		arr1.add(null);
		arr1.add("lavender");
		arr1.add("nikkyrose");
		arr1.add("lilly");
		System.out.println(arr.contains(arr1));
		System.out.println(arr1.equals(arr));
		Iterator it=arr.iterator();
		while(it.hasNext())
		{
			System.out.println( it.next());
		}
		for(String x: arr)
		{
			System.out.println(x);
		}
		System.out.println(arr.get(3));
		System.out.println(arr.equals(arr1));


	}

}
