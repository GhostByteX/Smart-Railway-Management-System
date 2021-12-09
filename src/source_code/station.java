package source_code;

public class station {

	private int id_ST;
	private String name_ST;
	private String location_ST;
	private String stationMasterCNIC;
	PersHand obj= new MySQL();
	
	station()
	{
		this.id_ST=0;
		this.name_ST="";
		this.location_ST="";
		this.stationMasterCNIC="";
	}
	
	station(int id, String name, String location,String SM)
	{
		this.id_ST=id;
		this.name_ST=name;
		this.location_ST=location;
		this.stationMasterCNIC=SM;
	}
	
	
	//	SETTERS
	
	public void setID(int ID)
	{
		this.id_ST=ID;
	}
	
	public void setName(String name)
	{
		this.name_ST=name;
	}
	
	public void setLocation(String location)
	{
		this.location_ST=location;
	}
	
	
	//	GETTERS
	
	public int getID()
	{
		return this.id_ST;
	}
	
	public String getName()
	{
		return this.name_ST;
	}
	
	public String getLocation()
	{
		return this.location_ST;
	}
	
	
	//	FUNCTIONALITY
	
	
	public boolean add(int ID, String name, String location,String SM)
	{
		//DB CALL TO ADD A STATION
		
		if(obj.addStation(ID, name, location, SM))
			return true;
		return false;
	}
	
	public boolean delete(int ID)
	{
		//DB CALL TO DELETE A STATION
		if(obj.deleteStation(ID))
			return true;
		return false;
	}
}
