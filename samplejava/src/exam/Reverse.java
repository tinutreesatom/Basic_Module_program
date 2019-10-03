package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int i=0;
		for(i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
