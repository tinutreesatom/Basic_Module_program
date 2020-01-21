package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayListCollection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter the values:");
		for(int  i=0;i<n;i++)
		{
			String val=sc.next();
			list.add(val);
		}
		System.out.println("The values stored are:");
		list.remove(4);
		list.add(2, "welcome");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
