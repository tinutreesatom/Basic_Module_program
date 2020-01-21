package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemoryGame {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list1=new ArrayList<String>();
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		System.out.println("Enter the words");
		for(int i=0;i<n;i++)
		{
			list1.add(sc.next());
		}
		Iterator itr=list1.iterator();
		while(itr.hasNext())
		{
			//int val=(int)itr.next();
			System.out.println(itr.next());
			
		}
		}

}
