package casestudy6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import casestudy3.UpdateEmail;

public class CaseStudy6 {
	public static String name;
	public static String address;
	public static String contactNumber;
	public static String email;
	public static String proofType;
	public static String proofId;
	static int regId=0;
	public static UpdateEmail customer[]=new UpdateEmail[10];
	public static void main(String[] args) throws IOException,NullPointerException
	{
		String ch;
		int i=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("");
		//UpdateEmail customer1=new UpdateEmail(name,address,contactNumber,email,proofType,proofId);
		do
		{	i++;
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
		regId++;
		
		System.out.println("Do you want to continue registration (y/n)?");
			ch=br.readLine();
		}
		while(ch.equalsIgnoreCase("y"));
		/*System.out.println("Do you want to update the email id?(y/n):");
		//do
		//{
		//System.out.println("Do you want to continue registration (y/n)?");
		ch=br.readLine();
		//}
		//while(ch=='y' ||ch=='Y');
		if(ch.equalsIgnoreCase("y"))
		{	
			System.out.println("Update Email\nEnter new email id:");
			customer[i].email=br.readLine();
			System.out.println("Email updated");
			
		}
*/
		System.out.println("Customers list\nThe registered customers are");
		System.out.println("Customer ID \t Customer name");
		for(int j=0;j<regId;j++)
		{
			display(j);
		
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

}
