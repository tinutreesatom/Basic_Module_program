package casestudy9;

public class LeanSeason extends Booking{
	int month;
	int disount;
	public int getDisount() {
		return disount;
	}
	public void setDisount(int disount) {
		this.disount = disount;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	double roomBooking(int persons, int total_Days, double tariff, String roomType,int month ,int disount)
	{
		double charges;
		double percent;double total_Charges;
		percent=tariff*((double)disount/100);
		charges=super.roomBooking(persons, total_Days, tariff, roomType);
		total_Charges=charges-(percent*persons*total_Days);
		return total_Charges;
	}

}
