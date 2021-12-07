package source_code;

import java.util.Date;
import java.util.LinkedList;

public class timetable {

	private int timeTableID;
	private Date dateOfTimeTable;
	private LinkedList<journey> arrivals;
	private LinkedList<journey> departures;
	
	timetable()
	{
		this.timeTableID=0;
		this.dateOfTimeTable=null;
		this.arrivals = new LinkedList<journey>();
		this.departures = new LinkedList<journey>();
	}
	
	timetable(int ID, Date date)
	{
		this.timeTableID=ID;
		this.dateOfTimeTable=date;
		this.arrivals = new LinkedList<journey>();
		this.departures = new LinkedList<journey>();
	}
	
	
	//	SETTERS
	
	public void setTimeTableID(int ID)
	{
		this.timeTableID=ID;
	}
	
	public void setDate(Date date)
	{
		this.dateOfTimeTable=date;
	}
	
	
	
	//	GETTERS
	
	public int getTimeTableID()
	{
		return this.timeTableID;
	}
	
	public Date getDateOfTimeTable()
	{
		return this.dateOfTimeTable;
	}
	
	
	//	FUNCTIONALITY
	
	public boolean addTimeTable(int ID, Date date)
	{
		//DB CALL TO ADD TIMETABLE
		return true;
	}
	
	public boolean addArrival(String ID, int trainNo, String trainName, String origin, String Destination,boolean status,int totalSeats,int duration, int fare)
	{
		journey obj = new arrivals(ID,trainNo,trainName,origin,Destination,status,totalSeats,duration,fare);
		for (int i=0;i<arrivals.size();i++)
		{
			if(arrivals.get(i).getJourneyID().equals(ID))
			{
				arrivals.add(obj);
				obj.add(ID,trainNo,trainName,origin,Destination,status,totalSeats,duration,fare);
				
			}
		}
		return true;
	}
	
	public boolean addDeparture(String ID, int trainNo, String trainName, String origin, String Destination,boolean status,int totalSeats,int duration, int fare)
	{
		journey obj = new departures(ID,trainNo,trainName,origin,Destination,status,totalSeats,duration,fare);
		for (int i=0;i<departures.size();i++)
		{
			if(departures.get(i).getJourneyID().equals(ID))
			{
				departures.add(obj);
				obj.add(ID,trainNo,trainName,origin,Destination,status,totalSeats,duration,fare);
				
			}
		}
		return true;
	}
	
	
	public boolean updateArrival(boolean status)
	{
		journey obj = new arrivals();
		obj.update(status);
		return true;
	}
	
	public boolean updateDeparture(boolean status)
	{
		journey obj = new departures();
		obj.update(status);
		return true;
	}
	
	
}
