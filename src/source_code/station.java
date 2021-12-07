package source_code;

public class station {

	private int id_ST;
	private String name_ST;
	private String location_ST;
	private stationMaster stationMaster;
	
	
	station()
	{
		this.id_ST=0;
		this.name_ST="";
		this.location_ST="";
		this.stationMaster= new stationMaster();
	}
	
	station(int id, String name, String location,stationMaster SM)
	{
		this.id_ST=id;
		this.name_ST=name;
		this.location_ST=location;
		this.stationMaster=SM;
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
	
	
	public boolean add(int ID, String name, String location,stationMaster SM)
	{
		//DB CALL TO ADD A STATION
		return true;
	}
	
	public boolean delete(int ID, String name, String location, stationMaster SM)
	{
		//DB CALL TO DELETE A STATION
		return true;
	}
}
