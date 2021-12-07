package source_code;

public class departures extends journey {
	
	departures()
	{
		
	}
	
	
	departures(String ID, int tnum, String tname, String orig, String dest, boolean status, int totalSeats,int dur, int fare)
	{
		this.setjID(ID);
		this.setTrainNumber(tnum);
		this.setTrainName(tname);
		this.setOrigin(orig);
		this.setDestination(dest);
		this.setStatus(status);
		this.setTotalSeats(totalSeats);
		this.setDuration(dur);
		this.setFare(fare);
		
	}
	
	public boolean add(String id, int trainNo, String trainName, String origin, String destination,boolean status, int totalSeats, int duration, int fare)
	{
		//DB CALL TO ADD
		return true;
	}
	
	public boolean update(boolean status)
	{
		//UPDATE STATUS 
		return true;
	}
}
