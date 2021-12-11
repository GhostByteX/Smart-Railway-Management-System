package source_code;

public abstract class PersHand {

	
	public abstract boolean addSuperAdmin(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password);
	public abstract boolean logInSuperAdmin(String username, String password);
	public abstract boolean addSystemUser(String cnic,String name,int age, String email, String address, long pNum, String username, String password);
	public abstract boolean deleteSystemUser(String username);
	public abstract boolean logInSystemUser(String username, String password);
	public abstract boolean addStationMaster(String cnic,String name,int age, String email, String address, long pNum, String username, String password);
	public abstract boolean deleteStationMaster(String username);
	public abstract boolean addStation(int ID, String name, String loc, String ssmcnic);
	public abstract boolean deleteStation(int ID);
	public abstract boolean logInStationMaster(String username, String password);
	public abstract boolean addCustomer(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password);
	public abstract boolean logInCustomers(String username, String password);
	
}

