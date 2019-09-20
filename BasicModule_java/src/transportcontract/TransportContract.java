package transportcontract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransportContract {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,count=0;
		int amt[]=new int[20];float sum=0,avg;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of applications");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter the amount(in crores)");
		for(int i=0;i<n;i++)
		{
			amt[i]=(Integer.parseInt(br.readLine()));
			
		}
		int max=amt[0];
		for(int i=0;i<n;i++)
		{
			if(max<amt[i])
				max=amt[i];
			
			
		}
		System.out.println("The winning bid is "+max+ " crores");
		
	}
}
