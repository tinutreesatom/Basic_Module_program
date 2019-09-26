package casestudy9;

public class PeakSeason extends Booking{
	int month;
	int peakCharges;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getPeakCharges() {
		return peakCharges;
	}
	public void setPeakCharges(int peakCharges) {
		this.peakCharges = peakCharges;
	}
	double roomBooking(int persons, int total_Days, double tariff, String roomType, int month ,int peakCharges)
	{
		double total_Charges=1;
		tariff=tariff*peakCharges;
		total_Charges=super.roomBooking(persons, total_Days, tariff, roomType);
		return total_Charges;
	}

}
