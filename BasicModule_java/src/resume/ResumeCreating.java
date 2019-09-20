package resume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResumeCreating {

	String name,age,degree,branch,contact_no;
	ResumeCreating(String name,String age,String degree,String branch,String contact_no)
	{
		this.name=name;
		this.age=age;
		this.degree=degree;
		this.branch=branch;
		this.contact_no=contact_no;
	}
	public static void main(String args[]) throws IOException
	{
		String name,age,degree,branch,contact_no;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		name=br.readLine();
		System.out.println("Enter your age");
		age=br.readLine();
		System.out.println("Enter your degree");
		degree=br.readLine();
		System.out.println("Enter your branch");
		branch=br.readLine();
		System.out.println("Enter your Contact No.");
		contact_no=br.readLine();
		
		ResumeCreating resumeObj=new ResumeCreating(name,age,degree,branch,contact_no);
		//resumeObj.getInput();
		resumeObj.setInput();
		
	}
	private void setInput() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("RESUME");
		System.out.println("");
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
		System.out.println("Degree :"+this.degree);
		System.out.println("Branch :"+this.branch);
		System.out.println("Contact No :"+this.contact_no);
	}
	
}
