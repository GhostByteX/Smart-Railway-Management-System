package source_code;

import java.util.Date;
import java.util.LinkedList;

public class stationMaster {
	
	private String CNIC_SM;
	private String name_SM;
	private int age_SM;
	private String emailAddress_SM;
	private String address_SM;
	private long phoneNumber_SM;
	private String username_SM;
	private String password_SM;
	private LinkedList<timetable> trainSchedule;
	
	stationMaster()
	{
		this.CNIC_SM="";
		this.name_SM="";
		this.age_SM=18;
		this.emailAddress_SM="";
		this.address_SM="";
		this.phoneNumber_SM=0;
		this.username_SM="";
		this.password_SM="";
		this.trainSchedule = new LinkedList<timetable>();
	}
	
	stationMaster(String cnic,String name, int age, String email, String address, long pNum, String username, String password)
	{
		this.CNIC_SM=cnic;
		this.name_SM=name;
		this.age_SM=age;
		this.emailAddress_SM=email;
		this.address_SM=address;
		this.phoneNumber_SM=pNum;
		this.username_SM=username;
		this.password_SM=password;
		this.trainSchedule = new LinkedList<timetable>();
	}
	
	
	
	//	SETTERS
	
	
	public void setCNIC(String cnic)
	{
		this.CNIC_SM=cnic;
	}
	
	public void setName(String name)
	{
		this.name_SM=name;
	}
	
	public void setAge(int age)
	{
		this.age_SM=age;
	}
	
	public void setEmail(String email)
	{
		this.emailAddress_SM=email;
	}
	
	public void setAddress(String address)
	{
		this.address_SM=address;
	}
	
	public void setPhoneNumber(long pNum)
	{
		this.phoneNumber_SM=pNum;
	}
	
	
	
	//	GETTERS
	
	
	public String getCNIC()
	{
		return this.CNIC_SM;
	}
	
	public String getName()
	{
		return this.name_SM;
	}
	
	public int getAge()
	{
		return this.age_SM;
	}
	
	public String getEmail()
	{
		return this.emailAddress_SM;
	}
	
	public String getAddress()
	{
		return this.address_SM;
	}
	
	public long getPhoneNumber()
	{
		return this.phoneNumber_SM;
	}
	
	public String getUsername()
	{
		return this.username_SM;
	}
	
	public String getPassword()
	{
		return this.password_SM;
	}
	
	public timetable getTimeTable(int i)
	{
		return this.trainSchedule.get(i);
	}
	
	public LinkedList<timetable> getTimeTable()
	{
		return this.trainSchedule;
	}
	
	
	//	FUNCTIONALITY
	
	
	public boolean logIn(String username, String password)
	{
		// DB CALL TO AUTENTHICATE USER
		return true;
	}
	
	public boolean logOut()
	{
		//CALL TO DB TO LOG OUT
		return true;
	}
	
	public boolean add(String cnic, String name, int age, String email, String address, long pNum, String username, String password)
	{
		//DB CALL TO ADD
		return true;
	}
	
	public boolean delete(String username)
	{
		//DB CALL TO DELETE
		return true;
	}
	
	public boolean addTimeTable(int ID, Date dateOfTimeTable)
	{
		timetable obj = new timetable(ID,dateOfTimeTable);
		for(int i=0;i<trainSchedule.size();i++)
		{
			if(trainSchedule.get(i).getTimeTableID()==ID)
			{
				trainSchedule.add(obj);
				trainSchedule.get(i).addTimeTable(ID,dateOfTimeTable);
				return true;
			}
		}
		return false;
	}
	
	public boolean addArrival(int JID,String ID, int tnum, String tname, String origin, String dest, boolean status,int totalSeats, int duration, int fare)
	{
		for (int i=0;i<trainSchedule.size();i++)
		{
			if(trainSchedule.get(i).getTimeTableID()==JID)
			{
				trainSchedule.get(i).addArrival(ID,tnum,tname, origin, dest, status, totalSeats, duration, fare);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean addDepartures(int JID, String ID, int tnum, String tname, String origin, String dest, boolean status, int totalSeats,int duration, int fare)
	{
		for (int i=0;i<trainSchedule.size();i++)
		{
			if(trainSchedule.get(i).getTimeTableID()==JID)
			{
				trainSchedule.get(i).addDeparture(ID,tnum,tname, origin, dest, status, totalSeats, duration, fare);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateArrival(int JID,boolean status)
	{
		for (int i=0;i<trainSchedule.size();i++)
		{
			if(trainSchedule.get(i).getTimeTableID()==JID)
			{
				trainSchedule.get(i).updateArrival(status);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateDeparture(int JID,boolean status)
	{
		for (int i=0;i<trainSchedule.size();i++)
		{
			if(trainSchedule.get(i).getTimeTableID()==JID)
			{
				trainSchedule.get(i).updateDeparture(status);
				return true;
			}
		}
		return false;
	}
	

}
