package foulplayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoulPlayer {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,count=0;
		int scores[]=new int[20];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of fouls made by each player");
		for(int i=0;i<n;i++)
		{
			scores[i]=(Integer.parseInt(br.readLine()));
			
		}
		int min=scores[0];
		for(int i=0;i<n;i++)
		{
			if(min>scores[i])
			{
				min=scores[i];
				count=i+1;
			}
			
			
		}
		System.out.println("The eligible player is player no: " + count +" ( " +scores[count-1]+ " fouls)");
		
	}

}
