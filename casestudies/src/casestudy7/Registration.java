package casestudy7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registration extends Customer{
	public static String name;
	public static String address;
	public static String contactNumber;
	public static String email;
	public static String proofType;
	public static String proofId;
	public static int id;
	public static Date date;
	//public static int roomno=0;
	//static int regId=0;
	//public static Registration reg[]=new Registration[10];
	Registration (String name,String address,String contactNumber,String email,String proofType,int id,Date date)
	{
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofId=proofId;
		this.id=id;
		this.date=date;
		
	}
	
/*	public static void registration()  throws IOException, ParseException {
		String name;
		String address;
		 String contactNumber;
		 String email;
		 String proofType;
		 String proofId;
		 int id;
		 Date date;
	String ch;
	
	String day;
	String regch;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i=customer.regId;
	do
	{
	
	System.out.println("");
	//UpdateEmail customer1=new UpdateEmail(name,address,contactNumber,email,proofType,proofId);
	
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Registration");
	System.out.println("Enter your name:");
	name=br.readLine();
	System.out.println("Enter your address:");
	address=br.readLine();
	System.out.println("Enter your contact number:");
	contactNumber=br.readLine();
	System.out.println("Enter your email:");
	email=br.readLine();
	System.out.println("Enter your proof type:");
	proofType=br.readLine();
	System.out.println("Enter your proof id:");
	proofId=br.readLine();
	System.out.println("Enter the date of booking");
	day=br.readLine();
	SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
	Date bookDate=formatter1.parse(day);
	date=bookDate;
	id=customer.regId+1;
	Registration reg[]=new Registration[10];
	reg[i]=new Registration(name,address,contactNumber,email,proofType,id,date);
	System.out.println("Thank you for registering. Your id is "+ customer.regId+"..Do you want to continue registration (y/n)?");
	regch=br.readLine();
	customer.regId++;
	}
	while(regch.equalsIgnoreCase("y"));
	System.out.println(customer.regId);
	for(int k=0;k<customer.regId;k++)
	{
		//System.out.println("ooooo");
		System.out.println(reg[k].name);
		System.out.println(reg[k].address);
		System.out.println(reg[k].contactNumber);
		System.out.println(reg[k].email);
		System.out.println(reg[k].proofType);
		System.out.println(reg[k].proofId);
		System.out.println(reg[k].id);
	}
}*/
}
