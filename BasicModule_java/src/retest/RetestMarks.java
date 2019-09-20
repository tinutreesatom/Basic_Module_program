package retest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetestMarks {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,count=0;
		//float avg;
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
			
				if(arr[i]<50)
				{
					count++;
					
				}
			
		}
	////avg=sum/n;
	System.out.println("Number of students appearing for retest is "+count);
		
	}

}
