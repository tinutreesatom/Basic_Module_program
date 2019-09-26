package casestudy9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int prsn;
		int totalDays;
		double tariff;
		String roomType;
		int month ;
		int disount;
		int pk_charge;
		LeanSeason ls=new LeanSeason();
		PeakSeason ps=new PeakSeason();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of persons");
		prsn=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of days");
		totalDays=Integer.parseInt(br.readLine());
		System.out.println("Enter the room type");
		roomType=br.readLine();
		System.out.println("Enter the tariff for single person");
		tariff=Integer.parseInt(br.readLine());
		System.out.println("Enter the month");
		month=Integer.parseInt(br.readLine());
	double total_Charges=1;
	switch(month)
	{
	
	case 4:
	case 5:
	case 6:
	case 9:
	case 11:
	case 12:System.out.println("Enter the peak charge");
	pk_charge=Integer.parseInt(br.readLine());
	ps.setPersons(prsn);
	ps.setTotal_Days(totalDays);
	ps.setTariff(tariff);
	ps.setRoomType(roomType);
	ps.setMonth(month);
	ps.setPeakCharges(pk_charge);
	
	prsn=ps.getPersons();
	totalDays=ps.getTotal_Days();
	tariff=ps.getTariff();
	roomType=ps.getRoomType();
	month=ps.getMonth();
	pk_charge=ps.getPeakCharges();
	total_Charges=ps.roomBooking(prsn, totalDays, tariff, roomType,month, pk_charge);
		break;
	case 1:
	case 2:
	case 3:
	case 7:
	case 8:
	case 10:System.out.println("Enter the discount");
	disount=Integer.parseInt(br.readLine());
		ls.setPersons(prsn);
		ls.setTotal_Days(totalDays);
		ls.setTariff(tariff);
		ls.setRoomType(roomType);
		ls.setMonth(month);
		ls.setDisount(disount);
		
		prsn=ls.getPersons();
		totalDays=ls.getTotal_Days();
		tariff=ls.getTariff();
		roomType=ls.getRoomType();
		month=ls.getMonth();
		disount=ls.getDisount();
		total_Charges=ls.roomBooking(prsn, totalDays, tariff, roomType,month, disount);
			break;
	}
	System.out.println("Total charge= "+total_Charges);
	}
}
