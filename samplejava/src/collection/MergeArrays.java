package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class MergeArrays {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		System.out.println("Enter the limit");
		int n1=sc.nextInt();
		System.out.println("Enter the array 1 elements");
		for(int i=0;i<n1;i++)
		{
			list1.add(sc.nextInt());
		}
		ArrayList<Integer> list2=new ArrayList<Integer>();
		System.out.println("Enter the limit");
		int n2=sc.nextInt();
		System.out.println("Enter the array 2 elements");
		for(int i=0;i<n2;i++)
		{
			list2.add(sc.nextInt());
		}
		list1.addAll(list2);
		//ArrayList<Integer> list3=new ArrayList<Integer>();
		Iterator itr=list1.iterator();
		while(itr.hasNext())
		{
			//int val=(int)itr.next();
			System.out.println(itr.next());
			
		}
		}

}
