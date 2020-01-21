package casestudy8;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
	static int i=-1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int prsn;
	int totalDays;
	double tariff;
	String roomType;
	
	String ch;
	Scanner sc=new Scanner(System.in);
	SeasonBooking bk[]=new SeasonBooking[10];
	do
	{
	//SeasonBooking bk=new SeasonBooking();
		i++;
		bk[i]=new SeasonBooking();
		System.out.println("Enter the number of persons");
		prsn=Integer.parseInt(br.readLine());
		bk[i].setPersons(prsn);
		System.out.println("Enter the number of days");
		totalDays=Integer.parseInt(br.readLine());
		bk[i].setTotal_Days(totalDays);
		System.out.println("Enter the room type");
		roomType=br.readLine();
		bk[i].setRoomType(roomType);
		System.out.println("Enter the tariff for single person");
		tariff=Integer.parseInt(br.readLine());
		bk[i].setTariff(tariff);
		prsn=bk[i].getPersons();
		totalDays=bk[i].getTotal_Days();
		tariff=bk[i].getTariff();
		roomType=bk[i].getRoomType();
		System.out.println("Total tariff="+bk[i].roomBooking(prsn, totalDays, tariff, roomType));
		System.out.println("Do you want to continue");
		ch=sc.nextLine();
	}
		while(ch.equalsIgnoreCase("y"));
	for(int j=0;j<=i;j++)
	{
		System.out.println("Your details as follows:");
		
		System.out.println("The number of persons :"+bk[j].persons);
		System.out.println("The number of days :"+bk[j].tariff);
		System.out.println("The room type: "+bk[j].roomType);
		//System.out.println("Total tariff :"+bk[j].email);
	}
	}
}
