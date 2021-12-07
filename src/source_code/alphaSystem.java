package source_code;

public class alphaSystem {

	private superAdmin SA_USER;
	private customers CUS_USER;
	
	public alphaSystem()
	{
	
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
	
}
