package casestudy8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int prsn;
	int totalDays;
	double tariff;
	String roomType;
	//SeasonBooking bk[]=new SeasonBooking[10];
	SeasonBooking bk=new SeasonBooking();
		bk=new SeasonBooking();
		System.out.println("Enter the number of persons");
		prsn=Integer.parseInt(br.readLine());
		bk.setPerson(prsn);
		System.out.println("Enter the number of days");
		totalDays=Integer.parseInt(br.readLine());
		bk.setTotalDays(totalDays);
		System.out.println("Enter the room type");
		roomType=br.readLine();
		bk.setRoomType(roomType);
		System.out.println("Enter the tariff for single person");
		tariff=Integer.parseInt(br.readLine());
		bk.setTariff(tariff);
		prsn=bk.getPerson();
		totalDays=bk.getTotalDays();
		tariff=bk.getTariff();
		roomType=bk.getRoomType();
		System.out.println("Total tariff="+bk.roomBooking(prsn, totalDays, tariff, roomType));
	}
}
