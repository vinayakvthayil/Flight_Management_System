
public class Flight {
	
	private String flightID,timeInterval,date,departDestination,landDestination,economySeats,businessSeats,distance;
	boolean isBooked;
	
	Flight(String flightID,String timeInterval,String date,String departDestination,String landDestination,String economySeats,String businessSeats,String distance)
	{
		this.flightID=flightID;
		this.timeInterval=timeInterval;
		this.date=date;
		this.departDestination=departDestination;
		this.landDestination=landDestination;
		this.economySeats=economySeats;
		this.businessSeats=businessSeats;
		this.distance=distance;
	}
	
	void setFlightID(String flightID)
	{
		this.flightID=flightID;
	}
	
	String getFlightID()
	{
		return flightID;
	}
	
	void setDepartTime(String timeInterval)
	{
		this.timeInterval=timeInterval;
	}
	
	void setLandTime(String date)
	{
		this.date=date;
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
		return timeInterval;
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
