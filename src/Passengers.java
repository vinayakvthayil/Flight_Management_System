
public class Passengers {
	
	private String name;
	final String cnic;
	private String username;	
	private String password;
	private String passport;
	private boolean visaValid;
	private boolean isBooked;
	
	Passengers(String name,String cnic,String username,String password, String passport)
	{
		this.name=name;
		this.cnic=cnic;
		this.username=username;
		this.password=password;
		this.passport=passport;
	}
	
	void setPassport(String passport)
	{
		this.passport=passport;
	}
	
	void setVisaValid(boolean visaValid)
	{
		this.visaValid=visaValid;
	}
	
	String getPassport()
	{
		return passport;
	}
	
	boolean getVisaValid()
	{
		return visaValid;
	}
	
	void setPassword(String pass)
	{
		this.password=pass;
	}
	
	void setBooked(boolean isBooked)
	{
		this.isBooked=isBooked;
	}
	
	boolean getBooked()
	{
		return isBooked;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCnic() {
		return cnic;
	}

	public String getPassword() {
		return password;
	}

	public boolean isBooked() {
		return isBooked;
	}
}
