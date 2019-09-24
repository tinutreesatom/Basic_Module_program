	 package casestudy7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registration {
//	public static String name[]=new String[20];
 String name;
	String address;
	 String contactNumber;
	 String email;
	String proofType;
	 String proofId;
	  int id;
	 Date date;
	static //public static int id[]=new int[20];
	//public static Date date[]=new Date[20];
	
	//public static int roomno=0;
	//static int regId=0;
	 public Registration reg[]=new Registration[10];
	/*Registration (String name,String address,String contactNumber,String email,String proofType,int id,Date date)
	{
		System.out.println("constructor");
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofId=proofId;
		this.id=id;
		this.date=date;
		
	}*/
	public static void register()  throws IOException, ParseException {
	String ch;
	String day;
	String regch;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	do
	{
		int i=Customer.regId;
		reg[i]=new Registration();
	System.out.println("");
	//UpdateEmail customer1=new UpdateEmail(name,address,contactNumber,email,proofType,proofId);
	
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Registration");
	System.out.println("i="+i);
	
	System.out.println("Enter your name:");
	reg[i].name=br.readLine();
	System.out.println("Enter your address:");
	reg[i].address=br.readLine();
	System.out.println("Enter your contact number:");
	reg[i].contactNumber=br.readLine();
	System.out.println("Enter your email:");
	reg[i].email=br.readLine();
	System.out.println("Enter your proof type:");
	reg[i].proofType=br.readLine();
	System.out.println("Enter your proof id:");
	reg[i].proofId=br.readLine();
	System.out.println("Enter the date of booking");
	day=br.readLine();
	reg[i].id=Customer.regId+1;
	SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
	Date bookDate=formatter1.parse(day);
	reg[i].date=bookDate;
	//id=regId+1;
	
	//reg=new Registration(name,address,contactNumber,email,proofType,id,date);
	//i++;
	System.out.println("Thank you for registering. Your id is "+ (Customer.regId+1)+"..Do you want to continue registration (y/n)?");
	regch=br.readLine();
	Customer.regId++;
	}
	while(regch.equalsIgnoreCase("y"));
//	System.out.println(reg.name);
	
}
	public static void display()
	{
		System.out.print(Customer.regId);
		for(int k=0;k<Customer.regId;k++)
		{
		//System.out.println("ooooo");
		System.out.println("Name: "+reg[k].name);
		System.out.println("id: "+reg[k].id);
		System.out.println("Date: "+reg[k].date+"\n");
		}
		
	}

}