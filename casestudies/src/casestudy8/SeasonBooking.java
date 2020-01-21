package casestudy8;

public class SeasonBooking extends Booking{
	int persons;
	int total_Days;
	double tariff;
	String roomType;
	
	public int getPersons() {
		return persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
	}

	public int getTotal_Days() {
		return total_Days;
	}

	public void setTotal_Days(int total_Days) {
		this.total_Days = total_Days;
	}

	public double getTariff() {
		return tariff;
	}

	public void setTariff(double tariff) {
		this.tariff = tariff;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	double roomBooking(int persons, int total_Days, double tariff, String roomType)
	{
		double tot_tariff=super.roomBooking(persons, total_Days, tariff, roomType);
		return tot_tariff;
	}
	
	
	
}
