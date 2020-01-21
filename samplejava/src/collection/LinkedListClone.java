package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListClone {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> list1=new LinkedList<String>();
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		System.out.println("Enter the words");
		for(int i=0;i<n;i++)
		{
			list1.add(sc.next());
		}
		Iterator itr=list1.iterator();
		System.out.println("Actual array");
		while(itr.hasNext())
		{
			//int val=(int)itr.next();
			System.out.println(itr.next());
			
		}
		System.out.println("Cloned array");
		LinkedList<String> cloneList=(LinkedList)list1.clone();
		Iterator itr1=cloneList.iterator();
		while(itr1.hasNext())
		{
			//int val=(int)itr.next();
			System.out.println(itr1.next());
			
		}
	}
}
