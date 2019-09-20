package perfectnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,sum=0;
		//float avg;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		n=Integer.parseInt(br.readLine());
		//System.out.println("Enter the Marks of students");
		System.out.print("The divisors of the number are ");
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				System.out.print(" "+i);
			}
		}
		System.out.println("");
		System.out.println("The sum of the divisors are "+sum);
		if(sum==n)
	System.out.println("It is a perfect number");
		else
			System.out.println("It is not a perfect number");
			
		
	}
}
