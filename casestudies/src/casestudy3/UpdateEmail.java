package casestudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class UpdateEmail {
	public static String name;
	public static String address;
	public static String contactNumber;
	public static String email;
	public static String proofType;
	public static String proofId;
	static int regId=0;
	/*public UpdateEmail(String name2, String address2, String contactNumber2, String email2, String proofType2,
			String proofId2) {
		// TODO Auto-generated constructor stub
		this.name=name2;
		this.address=address2;
		this.contactNumber=contactNumber2;
		this.email=email2;
		this.proofType=proofType2;
		this.proofId=proofId2;
		regId++;
	}
	public String getName() {
	    return this.name;
	  }
	public String setName(String name) {
	     this.name=name;
	  }*/
	public static void main(String[] args) throws IOException,NullPointerException
	{
		String ch;
		int i=0;
		
		/*Scanner sc =new  Scanner(System.in);
		name=sc.nextLine();
		address=sc.nextLine();
		contactNumber=sc.nextLine();
		email=sc.nextLine();
		proofType=sc.nextLine();
		proofId=sc.nextLine();*/
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		UpdateEmail customer[]=new UpdateEmail[10];
		System.out.println("");
		//UpdateEmail customer1=new UpdateEmail(name,address,contactNumber,email,proofType,proofId);
		do
		{	i++;
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
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
			customer[i].email=br.readLine();
			System.out.println("Email updated");
		}

		System.out.println("Your details as follows:");
		System.out.println("Name :"+customer[i].name);
		System.out.println("Address :"+customer[i].address);
		System.out.println("ContactNo: "+customer[i].contactNumber);
		System.out.println("Email :"+customer[i].email);
		System.out.println("Proof type :"+customer[i].proofType);
		System.out.println("Proof Id:"+customer[i].proofId);
		System.out.println("Thank you for registering.Your id is :"+regId);
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
