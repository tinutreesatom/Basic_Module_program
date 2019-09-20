package idol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SculpritIdol {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,rem;
		int fare[]=new int[20];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of kilograms of gold");
		n=Integer.parseInt(br.readLine());
		//System.out.println("Enter the fare collected for each vehicles");
		rem=n;
			while(n!=0)
			{
				//if(n>5)
				rem=rem+(n/5);
				n=n/5;
			}
		
		System.out.println(rem);
		
	}

}
