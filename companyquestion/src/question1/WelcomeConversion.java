package question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WelcomeConversion {
	public static void main(String [] args) throws IOException
	{
		String str;
		char ch;
		int count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		str=br.readLine();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			{
				count++;
				//System.out.print(count);
				for(int j=0;j<count;j++)
				{
					System.out.print("*");
				}
				System.out.print(ch);
				for(int j=0;j<count;j++)
				{
					System.out.print("*");
				}
				
			}
			else
			{
				System.out.print(ch);
			}

		}
	}
}
