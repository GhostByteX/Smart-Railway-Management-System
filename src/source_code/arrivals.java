package source_code;

public class arrivals extends journey {
	
	
	PersHand obj = new MySQL();
	arrivals()
	{
		
	}
	
	
	arrivals(String ID, int tnum, String tname, String orig, String dest, int status, int totalSeats,int dur, float fare)
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
	
	public boolean add(int TID,String id, int trainNo, String trainName, String origin, String destination,int status, int totalSeats, int duration, float fare)
	{
		//DB CALL TO ADD
		if(obj.addArrivals(id, trainNo, trainName, origin, destination, status, totalSeats, duration, fare))
			return true;
		return false;
	}
	
	public boolean update(String JID,int status)
	{
		//UPDATE STATUS 
		
		if(obj.updateArrival(JID, status))
			return true;
		return false;
	}




	
	
	
	
}
