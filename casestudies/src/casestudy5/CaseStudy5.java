package casestudy5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar; 

import casestudy3.UpdateEmail;

public class CaseStudy5 {
		public static String name;
		public static String address;
		public static String contactNumber;
		public static String email;
		public static String proofType;
		public static String proofId;
		public static Date date;
		public static int roomno=0;
		static int regId=0;
		public static CaseStudy5 customer[]=new CaseStudy5[10];
		public static int[] booked=new int[25];
		public static void main(String[] args) throws IOException,NullPointerException, ParseException
		{
			String ch;
			String day;
			int i=0;
			do
			{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("");
			//UpdateEmail customer1=new UpdateEmail(name,address,contactNumber,email,proofType,proofId);
			
			//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Registration");
			System.out.println("Enter your name:");
			customer[i].name=br.readLine();
			System.out.println("Enter your address:");
			customer[i].address=br.readLine();
			System.out.println("Enter your contact number:");
			customer[i].contactNumber=br.readLine();
			System.out.println("Enter your email:");
			customer[i].email=br.readLine();
			System.out.println("Enter your proof type:");
			customer[i].proofType=br.readLine();
			System.out.println("Enter your proof id:");
			customer[i].proofId=br.readLine();
			System.out.println("Enter the date of booking");
			day=br.readLine();
			SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
			Date bookDate=formatter1.parse(day);
			customer[i].date=bookDate;
			//Date d=new SimpleDateFormat("dd/MM/yyyy").parse(date);
			 
			//Date date = new Date();
			//System.out.println(date.toString());
		//	GregorianCalendar date=new GregorianCalendar();
			/*SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
			day=sdf.format(date);
			System.out.println(day);
			System.out.println(date.getTime());
			//date.getDate();*/
			regId++;
			
			
			System.out.println("Thank you for registering Your id is "+regId);
			System.out.println("Do you want to book a room (y/n)?");
			ch=br.readLine();
			if(ch.equalsIgnoreCase("y"))
			{
				booking();
			}
			else
				System.out.println("Thank you!");
			System.out.println("Do you want to continue registration (y/n)?");
			ch=br.readLine();
			i++;
			}
			while(ch.equalsIgnoreCase("y"));
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
			//Date date1=formatter1.parse(day);
			//customer[i].date=date1;
			System.out.println("View all bookings:");
			System.out.println("Enter the starting date");
			String sDate=br.readLine();
			System.out.println("Enter the end date");
			String eDate=br.readLine();
			Date startDate=formatter1.parse(sDate);
			Date endDate=formatter1.parse(eDate);
			//Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(day); 
		//	Date d=new Date();
			Date d;
			System.out.println("Customers list\nThe registered customers are");
			System.out.println("Customer ID \t Customer name");
			for(int k=0;k<regId;k++)
			{
				d=customer[k].date;
				System.out.println(d);
				
			}
			int flag=0;
			for(int k=0;k<=regId;k++)
			{
				//if(reg[k].date!=NULL)
				d=customer[k].date;
				//System.out.println("start date "+d.after(startDate));
				//System.out.println("end date "+d.after(endDate));
				if(d.after(startDate)&&(d.before(endDate)))
					{
						System.out.println(regId+"\t"+customer[k].date);
					}
				else
				{
					//System.out.println("No bookings on these days");
					flag++;
				}
				
		}
			if(flag==regId)
			{
				System.out.println("No bookings on these days");
			}
		}
		private static void display(int j) {
			// TODO Auto-generated method stub
			System.out.println((j+1)+"\t\t\t"+customer[j].name);
		}
			
	/*	public void register() throws IOException {
			// TODO Auto-generated method stub
			String ch;
			String name;
			String address;
			String contactNumber;
			String email;
			String proofType;
			String proofId;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your name:");
			this.name=br.readLine();
			System.out.println("Enter your address:");
			this.address=br.readLine();
			System.out.println("Enter your contact number:");
			this.contactNumber=br.readLine();
			System.out.println("Enter your email:");
			this.email=br.readLine();
			System.out.println("Enter your proof type:");
			this.proofType=br.readLine();
			System.out.println("Enter your proof id:");
			this.proofId=br.readLine();
			regId++;
			System.out.println("Do you want to update the email id?(y/n):");
			//do
			//{
			//System.out.println("Do you want to continue registration (y/n)?");
			ch=br.readLine();
			//}
			//while(ch=='y' ||ch=='Y');
			if(ch.equalsIgnoreCase("y"))
			{	
				System.out.println("Update Email\nEnter new email id:");
				this.email=br.readLine();
				System.out.println("Email updated");
			}
			
		}
	*/

	
/*public void booking()

	public static int[] booked=new int[25];
		char option;
	//	int roomId;
		for(int i=0;i<25;i++)
			{
				booked[i]=0;
			}
		
		do 
		{
			//Runtime.getRuntime().exec("CLS");
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
		}
				break;
		case '2':
				checkStatus(); break;
		case '3':System.exit(0);break;
		
		}
		//System.out.println("Do you want to continue?(1/0)");
		// ch=Integer.parseInt(br.readLine());
		}while(option!='3');
	}*/
	/*private static void checkStatus() throws IOException {
		// TODO Auto-generated method stub
		/*int roomNo;
		System.out.println("Enter your room No.");
		
		roomNo=Integer.parseInt(br.readLine());
	//	roomNo=Integer.parseInt(br.readLine());
		System.out.println(roomNo);
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
				
		
		
		
	}*/
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
	//		customer[i]=roomno;
			if(flag==1)
			System.out.println("Thank you for booking. Your room number is "+roomno+ ".");
			
			//Thank you for booking. Your room number is 2.
		}
		
			
	}

}
