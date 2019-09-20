package additionfactorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionFactorial {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,sum=0;
		//float avg;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		n=Integer.parseInt(br.readLine());
		if(n<0)
		{
			System.out.println("Enter a number");
			n=Integer.parseInt(br.readLine());
		}
		for(int i=n;i>0;i--)
		{
			sum=sum+i;
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}*/
	
		
	System.out.println("The sum is "+sum);
		
	}

}
