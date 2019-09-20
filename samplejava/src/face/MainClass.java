package face;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
public class MainClass {
/*	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;
	static int regId=0;
	public MainClass(String name2, String address2, String contactNumber2, String email2, String proofType2,
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

	/*MainClass(String name,String address,String contactNumber,String email,String proofType,String proofId)
	{
		
	}*/
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
		
		Customer customer=new Customer(name,address,contactNumber,email,proofType,proofId);
		customer.register(name, address, contactNumber, email, proofType, proofId);
		System.out.println("");
		Customer customer1=new Customer(name,address,contactNumber,email,proofType,proofId);
		customer1.register(name, address, contactNumber, email, proofType, proofId);
	}
	
	
}
 