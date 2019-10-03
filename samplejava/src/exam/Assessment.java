package exam;

import java.util.Scanner;

public class Assessment {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//System.out.println("hello");
		double rem,sum=1,power,prod=1,c,a,b;
		while(num>0)
		{
			a=num%10;//9
			b=(num%100)/10;
			//c=b/10;//0
			power=Math.pow(b,a);
			sum=sum+power;
			num=num/10;
		}
		System.out.println((int)sum);
	}
}
