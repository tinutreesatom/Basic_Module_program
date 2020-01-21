package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class InstallApplication {
	public static void main(String args[])
	{
		ArrayList<String> set1=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{ 
			System.out.println("1.Display installed applications\r\n" + 
					"2.Install an application\r\n" + 
					"3.Uninstall an application\r\n" + 
					"4.Quit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:if(set1.isEmpty())
						{
							System.out.println("There is no application installed.");
						}
						else
						{
							System.out.println("The installed application are.");
							Iterator itr=set1.iterator();
							int i=1;
							while(itr.hasNext())
							{
								System.out.println(i+")"+itr.next());
								i++;
							}
						}
				break;
				case 2:sc.nextLine();
					System.out.println("Enter name");
						set1.add(sc.nextLine());
				break;
				case 3:Iterator itr=set1.iterator();
				System.out.println("The installed application are.");
				int i=1;
					while(itr.hasNext())
					{
						System.out.println(i+")"+itr.next());
						i++;
					}
					
					if(set1.isEmpty())
					{
						System.out.println("No application found");
					}
					else
					{
						System.out.println("Enter the application No.");
						int n=sc.nextInt();
						n=n-1;
						set1.remove(n);
						System.out.println("Application uninstalled successfully");
						
					}
					break;
			}
		}while(ch!=4);
		
		
	}
}
