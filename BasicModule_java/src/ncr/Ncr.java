package ncr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ncr {
	public static void main(String[] args) throws NumberFormatException, IOException,ArithmeticException
	{
		long n,r,fact,nr;
		long nfact=1,rfact=1,n_rfact=1;
		//float avg;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of r");
		r=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			nfact=(long)nfact*i;
		}
		//System.out.println(nfact);
		for(int i=1;i<=r;i++)
		{
			rfact=(long)rfact*i;
		}
		//System.out.println(rfact);
		nr=n-r;
		for(int i=1;i<=nr;i++)
		{
			n_rfact=(long)n_rfact*i;
		}
		//System.out.println(n_rfact);
		fact=(long)nfact/(n_rfact*rfact);
	System.out.println("The NCR factor for given values is "+fact);
		
	}

}
