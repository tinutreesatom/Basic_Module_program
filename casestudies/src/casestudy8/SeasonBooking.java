package casestudy8;

public class SeasonBooking extends Booking{
	int persons;
	int total_Days;
	double tariff;
	String roomType;
	public void setRoomType(String roomType) {
		this.roomType=roomType;
	}
	public void setTariff(double tariff2) {
		this.tariff=tariff2;
		
	}
	public void setTotalDays(int totalDays) {
		this.total_Days=totalDays;
	}
	public void setPerson(int prsn) {
		this.persons=prsn;
		
	}
	public int getPerson() {
		return this.persons;
		
	}
	public int getTotalDays()
	{
		return this.total_Days;
	}
	public double getTariff() {
		return this.tariff;
	}
	public String getRoomType()
	{
		return this.roomType;
	}
}
