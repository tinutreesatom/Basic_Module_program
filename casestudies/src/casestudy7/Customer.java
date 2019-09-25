package casestudy7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import caseStudy3.UpdateEmail.java;
public class Customer extends Registration{

			/*public static String name;
			public static String address;
			public static String contactNumber;
			public static String email;
			public static String proofType;
			public static String proofId;
			public static Date date;
			public static int roomno=0;*/
			public static int regId=0;
			public static Customer cust[]=new Customer[10];
			//public static Registration reg[]=new Registration[10];
			//public static int[] booked=new int[25];
			public static void main(String[] args) throws IOException,NullPointerException, ParseException
			{
				int ch;
			//	String regch;
			
				//int i=0;
				 
				Registration reg=new Registration();
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				do {
				System.out.println("   MENU");
				System.out.println("1. Register.\n2. Book.\n3. Check Status.\n4. Email. \n5. All Bookings.\n6. All Customers.\n7. Exit");
				System.out.println("Choose your option ");
				ch=Integer.parseInt(br.readLine());
				switch(ch) {
				case 1:
						Registration.register();
						break;
				case 2:
						System.out.println("regId="+regId);
						//Registration.display();
						Booking.booking();
						break;
				case 3:Booking.checkStatus();
						break;
				case 4:System.out.println("Enter customer Id");
						int cusId=Integer.parseInt(br.readLine());
						System.out.println("Enter new email Id");
						String email=br.readLine();
						int i;
						
						for(i=0;i<regId;i++)
						{
							if(reg.id==cusId)
							{
								reg.email=email;
								System.out.println("Email updated");
							}
						}
						
						break;
				case 5:allBooking();break;
				case 6:allCustomers();break;
				case 7:System.out.println("Bye");break;
							}
				}
				while(ch!=7);
			}
		public static void allCustomers() {
				// TODO Auto-generated method stub
			
			for(int k=0;k<=regId;k++)
			{	System.out.println(reg[k].id+"\t"+reg[k].name);
					
			}
		}
		//	public static Customer customer=new Customer();
public static void allBooking() throws IOException, ParseException ,NullPointerException{
	//Registration reg[]=new Registration[10];

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
				System.out.println("The bookings made from "+ sDate+" to "+ eDate+" are");
				System.out.println("Room No. \t Customer name");
				int flag=0;
				for(int k=0;k<=regId;k++)
				{
					//if(reg[k].date!=NULL)
					d=reg[k].date;
					//System.out.println("start date "+d.after(startDate));
					//System.out.println("end date "+d.after(endDate));
					if(d.after(startDate)&&(d.before(endDate)))
						{
							System.out.println(reg[k].id+"\t"+reg[k].name);
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
			
}


