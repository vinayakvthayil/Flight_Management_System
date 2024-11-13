
public class internationalFlight {

	private String flightID,timeDuration,date,departDestination,landDestination,economySeats,businessSeats,distance;
	boolean isBooked;
	
	internationalFlight(String flightID,String departTime,String landTime,String departDestination,String landDestination,String economySeats,String businessSeats,String distance)
	{
		this.flightID=flightID;
		this.timeDuration=departTime;
		this.date=landTime;
		this.departDestination=departDestination;
		this.landDestination=landDestination;
		this.economySeats=economySeats;
		this.businessSeats=businessSeats;
		this.distance=distance;
	}
	
	public String getTimeDuration() {
		return timeDuration;
	}

	public void setTimeDuration(String timeDuration) {
		this.timeDuration = timeDuration;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isBooked() {
		return isBooked;
	}

	void setFlightID(String flightID)
	{
		this.flightID=flightID;
	}
	
	String getFlightID()
	{
		return flightID;
	}
	
	void setDepartTime(String departTime)
	{
		this.timeDuration=departTime;
	}
	
	void setLandTime(String landTime)
	{
		this.date=landTime;
	}
	
	void setDepartDestination(String departDestination)
	{
		this.departDestination=departDestination;
	}
	
	void setLandDestination(String landDestination)
	{
		this.landDestination=landDestination;
	}
	
	void setEconomySeats(String economySeats)
	{
		this.economySeats=economySeats;
	}
	
	void setBusinessSeats(String businessSeats)
	{
		this.businessSeats=businessSeats;
	}
	
	String getDepartTime()
	{
		return timeDuration;
	}
	
	String getLandTime()
	{
		return date;
	}
	
	String getDepartDestination()
	{
		return departDestination;
	}
	
	String getLandDestination()
	{
		return landDestination;
	}
	
	String getEconomySeats()
	{
		return economySeats;
	}
	
	String getBusinessSeats()
	{
		return businessSeats;
	}
	
	void setDistance(String distance)
	{
		this.distance=distance;
	}
	
	String getDistance()
	{
		return distance;
	}
	
	void setBooked(boolean isBooked)
	{
		this.isBooked=isBooked;
	}
	
	boolean getBooked()
	{
		return isBooked;
	}
}
