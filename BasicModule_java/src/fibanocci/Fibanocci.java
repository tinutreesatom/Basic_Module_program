package fibanocci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibanocci {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,sum=0,a=0,b=1;
		//float avg;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		n=Integer.parseInt(br.readLine());
		//System.out.println("Enter the Marks of students");
		System.out.println("");
		System.out.print("The fibonacci series is 0 1");
		for(int i=1;i<n+2;i++)
		{
			 sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}*/
	
		
	
		
	}

}
