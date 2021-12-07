package source_code;

public abstract class PersHand {

	
	public abstract boolean addSuperAdmin(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password);
	public abstract boolean logInSuperAdmin(String username, String password);
	public abstract boolean addSystemUser(String cnic,String name,int age, String email, String address, long pNum, String username, String password);
	public abstract boolean deleteSystemUser(String username);
}
