package casestudy2;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class RoomStatus {
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	public static int[] booked=new int[25];
	//protected static int i=0;
	public static void main(String [] args) throws IOException
	{
		//int bookingFlag;
		//int[] booked=new int[25];
	//	int ch;
		char option;
	//	int roomId;
		for(int i=0;i<25;i++)
			{
				booked[i]=0;
			}
		
		do 
		{
			
		System.out.println("\n1.Book");
		System.out.println("2.Check Status");
		System.out.println("3.Exit");
		System.out.println("Choose Your option");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 option=(char)br.read();
		switch(option) 
		{
		case '1': booking();
		/*if(bookingFlag==1)
		{
			booked[i]=
		}*/
				break;
		case '2':
				checkStatus(); break;
		case '3':System.exit(0);break;
		
		}
		//System.out.println("Do you want to continue?(1/0)");
		// ch=Integer.parseInt(br.readLine());
		}while(option!='3');
	}
	private static void checkStatus() throws IOException {
		// TODO Auto-generated method stub
		/*int roomNo;
		System.out.println("Enter your room No.");
		
		roomNo=Integer.parseInt(br.readLine());
	//	roomNo=Integer.parseInt(br.readLine());
		System.out.println(roomNo);*/
		System.out.print("Enter your Room Id:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int roomId=Integer.parseInt(br.readLine());
	//	for(int j=0;j<=25;j++)
		//{
			if(booked[roomId-1]>0)
			{
				System.out.println("Room number "+roomId+" is booked.");
			//	break;
			}
			else
			{
				System.out.println("Room number "+roomId+" is available.");
				//break;
			}
				
		
		
		
	}
	private static void booking() throws IOException {
		// TODO Auto-generated method stub
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		int total=0;
		int flag=0;
		int roomno=0;
		System.out.println("\nBooking");
		System.out.println("Please choose the services required.");
		System.out.println("AC/non-AC(AC/nAC)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ac=br.readLine();
		System.out.println("Cot(Single/Double)");
		cot=br.readLine();
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=br.readLine();
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=br.readLine();
		System.out.println("Laundry service needed or not(L/nL)");
		laundry=br.readLine();
		
		if(ac.equalsIgnoreCase("AC"))
			total=total+500;
		else if(ac.equalsIgnoreCase("nAC"))
			total=total+250;
		else
			ac="NULL";
		
		if(cot.equalsIgnoreCase("Single"))
			total=total+200;
		else if(cot.equalsIgnoreCase("Double"))
			total=total+450;
		else
			cot="NULL";
		
		if(cable.equalsIgnoreCase("C"))
			total=total+400;
		else if(cable.equalsIgnoreCase("nC"))
			total=total+350;
		else
			cable="NULL";
		
		if(wifi.equalsIgnoreCase("W"))
			total=total+400;
		else if(wifi.equalsIgnoreCase("nW"))
			total=total+350;
		else
			wifi="NULL";
		
		if(laundry.equalsIgnoreCase("L"))
			total=total+400;
		else if(laundry.equalsIgnoreCase("nL"))
			total=total+350;
		else
			laundry="NULL";
		
		System.out.println("The Total charge is Rs."+total);
		System.out.println("The services chosen are");
		System.out.println(cot +" cot "+ac+" room");
		//System.out.println(cot);
		if(cable.equalsIgnoreCase("c"))
			System.out.println("Cable connection enabled");
		else
			System.out.println("Cable connection disabled");
		if(wifi.equalsIgnoreCase("w"))
			System.out.println("wifi enabled");
		else
			System.out.println("wifi disabled");
		if(laundry.equalsIgnoreCase("l"))
			System.out.println("with laundry service");
		else
			System.out.println("without laundry service");
		System.out.println("Do you want to proceed?(yes/no)");
		String proceed=br.readLine();
		if(total>0 &&(proceed.equalsIgnoreCase("yes")))
		{
			for(int i=0;i<25;i++)
			{
				if(booked[i]==0)
				{
					booked[i]=total;
					roomno=i+1;
					flag=1;
					break;
					//i++;
				}
			}
			if(flag==1)
			System.out.println("Thank you for booking. Your room number is "+roomno+ ".");
			
			//Thank you for booking. Your room number is 2.
		}
		
			
	}

}
