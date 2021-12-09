package source_code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL extends PersHand {

	String DriverClass="com.mysql.cj.jdbc.Driver";
	String Path_DB="jdbc:mysql://localhost:3306/SRMS";
	String USERNAME_DB="root";
	String PASSWORD_DB="usmanmalik740";
	
	
	public boolean addSuperAdmin(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password)
	{
		
		try {
			
				Class.forName(DriverClass);
				Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
				String sql="INSERT INTO superadmin(cnic,Name,Age,Email_Address,Address,PhoneNumber,Username,Password) VALUES(?,?,?,?,?,?,?,?)";
				PreparedStatement statement=con.prepareStatement(sql);
				statement.setString(1,cnic);
				statement.setString(2,name);
				statement.setInt(3, age);
				statement.setString(4,email);
				statement.setString(5,address);
				statement.setLong(6, phoneNumber);
				statement.setString(7,username);
				statement.setString(8,password);
				
				int rowsInserted=statement.executeUpdate();
				if(rowsInserted>0)
				{
					
					return true;
				}
		
		
			}
		
		catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	public boolean logInSuperAdmin (String username, String password)
	{
		
		try {
		
				Class.forName(DriverClass);
				Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select username,password from superAdmin");
				
				String userName="";
				String passWord="";
				
				while(rs.next())
				{
					userName=rs.getString(1);
					passWord=rs.getString(2);
					if(username.equals(userName) && password.equals(passWord))
					{
						return true;
					}
				}
				
				
				
				
		
			}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}	
		
		return false;
	}
	
	
	
	public boolean addSystemUser(String cnic,String name,int age, String email, String address, long phoneNumber, String username, String password)
	{
		
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO systemUser(cnic,Name,Age,Email_Address,Address,PhoneNumber,Username,Password) VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,cnic);
			statement.setString(2,name);
			statement.setInt(3, age);
			statement.setString(4,email);
			statement.setString(5,address);
			statement.setLong(6, phoneNumber);
			statement.setString(7,username);
			statement.setString(8,password);
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
	}
	
	
	
	public boolean deleteSystemUser(String username)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			Statement stmt=con.createStatement();
			String query="delete from systemUser where username='"+username+"'";
			int result=stmt.executeUpdate(query);
			
			
			if(result==0)
			{
					return false;
			}
			else
			{
				return true;
			}
			
				
			
		}
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}	

		return false;
	}
	
	
	public boolean logInSystemUser (String username, String password)
	{
		
		try {
		
				Class.forName(DriverClass);
				Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select username,password from systemUser");
				
				String userName="";
				String passWord="";
				
				while(rs.next())
				{
					userName=rs.getString(1);
					passWord=rs.getString(2);
					if(username.equals(userName) && password.equals(passWord))
					{
						return true;
					}
				}
				
				
				
				
		
			}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}	
		
		return false;
	}
	
	
	public boolean addStationMaster(String cnic,String name,int age, String email, String address, long phoneNumber, String username, String password)
	{
		
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO stationMaster(cnic,Name,Age,Email_Address,Address,PhoneNumber,Username,Password) VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,cnic);
			statement.setString(2,name);
			statement.setInt(3, age);
			statement.setString(4,email);
			statement.setString(5,address);
			statement.setLong(6, phoneNumber);
			statement.setString(7,username);
			statement.setString(8,password);
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
	}
	
	
	
	public boolean deleteStationMaster(String username)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			Statement stmt=con.createStatement();
			String query="delete from stationmaster where username='"+username+"'";
			int result=stmt.executeUpdate(query);
			
			
			if(result==0)
			{
					return false;
			}
			else
			{
				return true;
			}
			
				
			
		}
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}	

		return false;
	}
	
	
	public boolean addStation(int ID, String name, String loc, String ssmcnic)
	{
		
		
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO station(Station_ID,Station_Name,Location,Station_Master_CNIC) VALUES(?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1, ID);
			statement.setString(2,name);
			statement.setString(3, loc);
			statement.setString(4,ssmcnic);
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
		
		
	}
	
	
	public boolean deleteStation(int iD)
	{
		
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			Statement stmt=con.createStatement();
			String query="delete from station where Station_ID='"+iD+"'";
			int result=stmt.executeUpdate(query);
			
			
			if(result==0)
			{
					return false;
			}
			else
			{
				return true;
			}
			
				
			
		}
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}	

		return false;
		
	}
}
