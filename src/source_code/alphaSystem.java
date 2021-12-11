package source_code;

public class alphaSystem {

	private superAdmin SA_USER;
	private customers CUS_USER;
	
	public alphaSystem()
	{
	
	}
	
	public boolean superAdminCreateAccount(String cnic,String name, int age, String email,String address,long pNum,String username, String password)
	{
		superAdmin obj=new superAdmin();
		if(obj.createAccount(cnic, name, age, email, address, pNum, username, password))
			return true;
		else
			return false;
		
	}
	
	public boolean superAdminLogIn(String uname, String pass)
	{
		superAdmin obj=new superAdmin();
		//obj.createAccount("61101-0175757-5","Usman Malik",21,"usmanmalik740@gmail.com","H#489 ST#34 I-8/2 Islamabad",19228058L,"usmanmalik740","Pakistan123");
		if(obj.logIn(uname,pass))
			return true;
		else
			return false;
		
		
		//obj.addSystemUser("85521-4532467-8", "Abeeha Fatima", 23, "abeehafatima123@hotmail.com", "H#56 ST#90 ASKARI 14 RAWALPINDI", 18335647L, "abeeha123@systemuser", "abeeha786");
			
		//obj.deleteSystemUser("abeeha123@systemuser");
		
		
		
	}
	
	
	
	public boolean superAdminAddSystemUser(String cnic, String name, int age, String email, String address, long pNum, String username, String password)
	{
		superAdmin obj=new superAdmin();
		if(obj.addSystemUser(cnic, name, age, email, address, pNum, username, password))
			return true;
		else
			return false;
		
		
	}
	
	
	public boolean superAdminDeleteSystemUser(String username)
	{
		superAdmin obj=new superAdmin();
		if(obj.deleteSystemUser(username))
			return true;
		else
			return false;
	}
	
	
	public boolean systmerUserLogIn(String uname, String pass)
	{
		systemUser obj=new systemUser();
		//obj.createAccount("61101-0175757-5","Usman Malik",21,"usmanmalik740@gmail.com","H#489 ST#34 I-8/2 Islamabad",19228058L,"usmanmalik740","Pakistan123");
		if(obj.logIn(uname,pass))
			return true;
		else
			return false;
		
		
		
	}
	
	
	public boolean systemUserAddStationMaster(String cnic, String name, int age, String email, String address, long pNum, String username, String password)
	{
		systemUser obj = new systemUser();
		if(obj.addStationMaster(cnic, name, age, email, address, pNum, username, password))
			return true;
		else
			return false;
		
		
	}
	
	public boolean systemUserDeleteStationMaster(String username)
	{
		systemUser obj = new systemUser();
		if(obj.deleteStationMaster(username))
			return true;
		else
			return false;
	}
	
	
	public boolean systemUserAddStation(int ID,String name, String loc, String ssmcnic)
	{
		systemUser obj = new systemUser();
		if(obj.addStation(ID, name, loc, ssmcnic))
			return true;
		else
			return false;
		
		
	}
	
	public boolean systemUserDelStation(int ID)
	{
		systemUser obj = new systemUser();
		if(obj.deleteStation(ID))
			return true;
		else
			return false;
		
		
	}
	
	
	public boolean stationMasterLogIn(String uname, String pass)
	{
		stationMaster obj = new stationMaster();
		if(obj.logIn(uname,pass))
			return true;
		else
			return false;
		
		
		
	}
	
	
	
	public boolean customersLogIn(String uname, String pass)
	{
		customers obj= new customers();
		if(obj.logIn(uname,pass))
			return true;
		else
			return false;
		
		
		
	}
	
	
	public boolean addCustomer(String cnic, String name, int age, String email, String address, long pNum, String username, String password)
	{
		customers obj= new customers();
		if(obj.createAccount(cnic, name, age, email, address, pNum, username, password))
			return true;
		else
			return false;
		
		
	}
}
