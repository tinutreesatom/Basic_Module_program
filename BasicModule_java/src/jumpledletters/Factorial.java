package jumpledletters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,prod=1;
		//float avg;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number alphabets in your name");
		n=Integer.parseInt(br.readLine());
		//System.out.println("Enter the Marks of students");
		for(int i=n;i>0;i--)
		{
			prod=prod*i;
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}*/
	
		
	System.out.println("The number of combination is "+prod);
		
	}

}
