package amstrong;

import java.util.Scanner;
import java.lang.Math; 
public class ArmstrongNumber {
	public static void main(String args[])
	{
		int num,rem,sum=0,temp,count=0;
		float power;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		int n=num;
		while(num!=0)
		{
			 num=num/10;
			 count++;
		}

		while(n!=0)
		{
			 rem = n%10;
			 power=(int) Math.pow(rem,count);
			 sum=(int) (sum+power);
			 n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("The given number is armstrong");
		}
		else
		{
			System.out.println("The given number is not armstrong");
		}
	}

}
