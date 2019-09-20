package tollgate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TollGate {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,heavy_count=0,least_count=0;
		int fare[]=new int[20];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of vehicles");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter the fare collected for each vehicles");
		for(int i=0;i<n;i++)
		{
			fare[i]=(Integer.parseInt(br.readLine()));
			
		}
		//int min=scores[0];
		for(int i=0;i<n;i++)
		{
			if(fare[i]>=50)
			{
				heavy_count++;
			}
			if(fare[i]<50 && fare[i]>0)
			{
				least_count++;
			}
			
			
		}
		System.out.println("Number of heavy vehicles "+heavy_count+" and the number of light weight vehicles is "+least_count);
		
	}

}
