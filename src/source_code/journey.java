package source_code;

import java.util.LinkedList;

public abstract class journey {

	private String journeyID;
	private int trainNumber;
	private String trainName;
	private LinkedList<customers> PassengersList ;
	private String origin;
	private String destination;
	private boolean status;
	private int totalSeats;
	private int duration;
	private double fare;
	private LinkedList<Integer> seatsAvailability;
	
	journey()
	{
		
		this.journeyID="";
		this.trainNumber=0;
		this.trainName="";
		this.PassengersList=new LinkedList<customers>();
		this.origin="";
		this.destination="";
		this.status=false;
		this.totalSeats=0;
		this.duration=0;
		this.fare=0;
		this.seatsAvailability=new LinkedList<Integer>();
		
	}
	
	journey(String jID, int tnum, String tname, String orig, String dest, boolean status, int totalseats, int duration, double fare)
	{
		this.journeyID=jID;
		this.trainNumber=tnum;
		this.trainName=tname;
		this.origin=orig;
		this.destination=dest;
		this.status=status;
		this.totalSeats=totalseats;
		this.duration=duration;
		this.fare=fare;
		
	}
	
	
	public void setjID(String jID)
	{
		this.journeyID=jID;
	}
	
	public void setTrainNumber(int tnum)
	{
		this.trainNumber=tnum;
	}
	
	public void setTrainName(String tname)
	{
		this.trainName=tname;
	}
	
	public boolean addPassenger(customers c)
	{
		if(this.PassengersList.add(c))
			return true;
		return false;
	}
	
	public void setOrigin(String orig)
	{
		this.origin=orig;
	}
	
	public void setDestination(String dest)
	{
		this.destination=dest;
	}
	
	public void setStatus(boolean status)
	{
		this.status=status;
	}
	
	public void setTotalSeats(int tseats)
	{
		this.totalSeats=tseats;
	}
	
	public void setDuration(int duration)
	{
		this.duration=duration;
	}
	
	public void setFare(double fare)
	{
		this.fare=fare;
	}
	
	public boolean seatsAvailability(int val)
	{
		if(this.seatsAvailability.add(val))
			return true;
		return false;
	}
	

	
	//	GETTERS
	
	
	
	public String getJourneyID()
	{
		return this.journeyID;
	}
	
	public int getTrainNumber()
	{
		return this.trainNumber;
	}
	
	public String getTrainName()
	{
		return this.trainName;
	}
	
	public customers getPassenger(int i)
	{
		return this.PassengersList.get(i);
	}
	
	public LinkedList<customers> getPassengers()
	{
		return this.PassengersList;
	}
	
	public String getOrigin()
	{
		return this.origin;
	}
	
	public String getDestination()
	{
		return this.destination;
	}
	
	public boolean getStatus()
	{
		return this.status;
	}
	
	public int getTotalSeats()
	{
		return this.totalSeats;
	}
	
	public int getDuration()
	{
		return this.duration;
	}
	
	public double getFare()
	{
		return this.fare;
	}
	
	public int getSeatAvailability(int i)
	{
		return this.seatsAvailability.get(i);
	}
	
	public LinkedList<Integer> getSeatAvailability()
	{
		return this.seatsAvailability;
	}
	
	public boolean bookTicket(String origin, String destination, int noOfSeats, customers C)
	{
		return true;
	}
	
	abstract public boolean add(String ID, int tnum, String tname, String orig, String dest, boolean status, int totalSeats,int dur, int fare);
	abstract public boolean update(boolean status);
	
}
