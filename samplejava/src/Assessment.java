import java.util.Scanner;

public class Assessment {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		long rem,sum=0,pow,prod=1;
		while(num!=0)
		{
			rem=num%10;//9
			pow=num%100;
			pow=num/10;//0
			int i=1;
			while(i<9) {
				prod=pow*pow;
				i++;
			}
			sum=sum+prod;
		}
		System.out.println(sum);
	}
}
