package cricket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CricketBowlers {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,count=0;
		//float avg;
		int balls[]=new int[20];
		int[] runs=new int[20];
		float[] res=new float[20];
		float sum=0,avg;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of bowlers");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter the runs conceded by the bowlers");
		for(int i=0;i<n;i++)
		{
			balls[i]=(Integer.parseInt(br.readLine()));
			
		}
		System.out.println("Enter the number of balls for each bowler");
		for(int i=0;i<n;i++)
		{
			runs[i]=(Integer.parseInt(br.readLine()));
			
		}
		System.out.println("Economy of the bowlers is");
		for(int i=0;i<n;i++)
		{
			res[i]=(float)balls[i]/(runs[i]/6);
			System.out.println(res[i]);
			
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+res[i];
			if(res[i]<6)
				count++;
		}
		avg=sum/n;
		System.out.println("The overall economy of the team is " +avg);		
		System.out.println("The number of bowlers eligible are " +count);	
	}
}
