
package leapyear;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int y;
		//float avg;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a year");
		y=Integer.parseInt(br.readLine());
		//System.out.println("");
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					System.out.println("It is a leap year");
				}
				else
				{
					System.out.println("It is not a leap year");
					
				}
			}
			else
			{
				System.out.println("It is a leap year");
				
			}
		}
		else
		{
			System.out.println("It is not a leap year");
			
		}
	}

}
