package average;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageMarks {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,sum=0;
		float avg;
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
			
					sum=sum+arr[i];
				
			
		}
	avg=sum/n;
	System.out.println("The average is "+avg);
		
	}

}
