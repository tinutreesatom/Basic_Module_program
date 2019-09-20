package marks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarksSorting {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n;
		int arr[]=new int[20];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter the Marks of students");
		for(int i=0;i<n;i++)
		{
			arr[i]=(Integer.parseInt(br.readLine()));
			//arr[i]=(float)Math.round(num);
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}*/
	
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<=arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("The priority of mark is");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
