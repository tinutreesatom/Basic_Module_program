package casestudy8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booking {
	
	double roomBooking(int persons, int total_Days, double tariff, String roomType)
	{
		double tot_tariff;
		tot_tariff=persons*total_Days*tariff;
		return tot_tariff;
		
	}
	

}
