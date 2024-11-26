package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList arr=new ArrayList();
		arr.add(1);
		arr.add("One");
		arr.add('A');
		arr.add(null);
		arr.add("one");
		arr.add("Two");
		System.out.println("display arralylist");
		System.out.println(arr);
		System.out.println("get value using index");
		System.out.println(arr.get(5));
		System.out.println("Removing the first value");
		System.out.println(arr.removeFirst());
		System.out.println(arr);
		System.out.println("Size of the array");
		System.out.println(arr.size());
		System.out.println("clone an array");
		System.out.println(arr.clone());
		System.out.println(arr.isEmpty());
		System.out.println(arr.contains("null"));
		System.out.println("for loop................");
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		System.out.println("substring");
		System.out.println(arr.subList(0, 2));
		System.out.println("Reverse string");
		System.out.println(arr.reversed());
		System.out.println(arr.retainAll(arr));
		ArrayList arr1=new ArrayList();
		arr1.add(2);
		arr1.add("Two");
		arr1.add('B');
		arr1.add(null);
		//System.out.println(arr.removeAll(arr1));
		//System.out.println(arr);
		for(Object x:arr)
		{
			System.out.println(x);

		}
		System.out.println("iterator method");
		Iterator it=arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
