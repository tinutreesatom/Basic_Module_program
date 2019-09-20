package face;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;
	static int regId=0;
	public Customer(String name2, String address2, String contactNumber2, String email2, String proofType2,
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
	public static void main(String[] args) throws IOException
	{
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofId;
		/*Scanner sc =new  Scanner(System.in);
		name=sc.nextLine();
		address=sc.nextLine();
		contactNumber=sc.nextLine();
		email=sc.nextLine();
		proofType=sc.nextLine();
		proofId=sc.nextLine();*/
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name=br.readLine();
		address=br.readLine();
		contactNumber=br.readLine();
		email=br.readLine();
		proofType=br.readLine();
		proofId=br.readLine();
	}
	
	void register(String name,String address,String contactNumber,String email,String proofType,String proofId)
	{
		System.out.println("Register Id :"+regId);
		System.out.println("Name :"+this.name);
		System.out.println("Address :"+this.address);
		System.out.println("ContactNo: "+this.contactNumber);
		System.out.println("Email :"+this.email);
		System.out.println("Proof type :"+this.proofType);
		System.out.println("Proof Id:"+this.proofId);
		
	}



}
