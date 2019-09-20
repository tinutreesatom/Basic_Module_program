package number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberConversion {
	
		public static void main(String[] args) throws NumberFormatException, IOException
		{
		int n,count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ");
		n=Integer.parseInt(br.readLine());
		//System.out.println("Enter the fare collected for each vehicles");
		while(n!=0)
		{
			if(n<10)
			{
				switch(n)
				{
				case 1:
				case 2:
				case 10:
				case 6:count=count+3;break;
					//System.out.println("3");break;
				case 0:
				case 4:
				case 9:
				case 5:count=count+4;break;//System.out.println("4");break;
				case 3:
				case 7:
				case 8:count=count+5;break;//System.out.println("5");break;
				case 11:
				case 12:count=count+6;break;//System.out.println("6");break;
				case 15:
				case 16:count=count+7;break;//System.out.println("7");break;
				case 13:
				case 18:
				case 19:count=count+8;break;//System.out.println("8");break;
				case 17:
				case 14:count=count+9;break;
				}
			}
			if(n>=20 && n<=99)
			{
				int r=(n/10)*10;
				System.out.println(r);
				switch(r)
				{
				case 20:
				case 30:
				case 80:
				count=count+6;break;
				case 40:
				case 50:
				case 90:
				case 60:count=count+5;break;
				case 70:count=count+7;break;
			
					
				}
				
				
			}
			if(n>=100 && n<=999)
			{
				int r=(n/10)*10;
				System.out.println(r);
				switch(r)
				{
				case 200:
				case 30:
				case 80:
				case 90:count=count+6;break;
				case 40:
				case 50:
				case 60:count=count+5;break;
				case 70:count=count+7;break;
			
					
				}
				//n=n/10;
				
			}
			n=n/10;
			
		}
			
		System.out.println("count= "+count);
		
	}

}
