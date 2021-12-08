package application;
import java.io.IOException;
import java.time.Duration;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import source_code.alphaSystem;

public class UI_Call_Handler {
	
	
	alphaSystem alphaobj = new alphaSystem();
	
	@FXML
	private TextField SAusername;
	
	@FXML
	private TextField SApassword;
	
	@FXML
	private TextField sucnic;
	
	@FXML
	private TextField suname;
	
	@FXML
	private TextField suage;
	
	@FXML
	private TextField suemail;
	
	@FXML
	private TextField suaddress;
	
	@FXML
	private TextField suphone;
	
	@FXML
	private TextField suusername;
	
	@FXML
	private TextField supassword;
	
	
	@FXML
	private TextField sudelusername;
	
	
	
	@FXML
	public void superAdminHomePage(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdmin_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("SUPER ADMIN");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	@FXML
	public void systemUserHomePage(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("systemUser_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("SYSTEM USER");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void stationMasterHomePage(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("stationMaster_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("STATION MASTER");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void customersHomePage(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("customers_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("CUSTOMERS");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void ExitHomePage(ActionEvent Event)
	{
		System.exit(0);
	}
	
	
	
	@FXML
	public void superAdminLogIn(ActionEvent Event)
	{
		
		try
		{
			String username=SAusername.getText();
			String password=SApassword.getText();
			
			if(alphaobj.superAdminLogIn(username,password))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminMenu_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Logged In");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("unsuccessfullogin_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Cannot Log In");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	@FXML
	public void superAdminSignUp(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSignUp_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("CREATE AN ACCOUNT");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	@FXML
	public void superAdminAddSysUser(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserAdd_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("CREATE A SYSTEM USER ACCOUNT");
			stage.setScene(new Scene(root_one));
			stage.show();
			//
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void superAdminDelSysUser(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserDel_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("DELETE A SYSTEM USER");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void superAdminLogOut(ActionEvent Event)
	{
		System.exit(0);
	}
	
	
	@FXML
	public void superAdminAddedSystemUser(ActionEvent Event)
	{
		
		String cnic,name,email,address,username,password,ageString,pNumString;
		int age=0;
		long pNum;
		
		cnic=sucnic.getText();
		name=suname.getText();
		ageString=suage.getText();
		age=Integer.parseInt(ageString);
		email=suemail.getText();
		address=suaddress.getText();
		pNumString=suphone.getText();
		pNum=Long.parseLong(pNumString);
		username=suusername.getText();
		password=supassword.getText();
		
		
		
		try
		{
			
			if(alphaobj.superAdminAddSystemUser(cnic, name, age, email, address, pNum, username, password))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("System User Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("System User Not Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void superAdminDeletedSystemUser(ActionEvent Event)
	{
		
		String username;
		username=sudelusername.getText();
		
		
		try
		{
			
			if(alphaobj.superAdminDeleteSystemUser(username))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserDeleted_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("System User Deleted");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotDeleted_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("System User Not Deleted");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void superAdminCreateAccount(ActionEvent Event)
	{
		
		String cnic,name,email,address,username,password,ageString,pNumString;
		int age=0;
		long pNum;
		
		cnic=sucnic.getText();
		name=suname.getText();
		ageString=suage.getText();
		age=Integer.parseInt(ageString);
		email=suemail.getText();
		address=suaddress.getText();
		pNumString=suphone.getText();
		pNum=Long.parseLong(pNumString);
		username=suusername.getText();
		password=supassword.getText();
		
		
		
		try
		{
			
			if(alphaobj.superAdminCreateAccount(cnic, name, age, email, address, pNum, username, password))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminCreated_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Super Admin Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminNotCreated_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Super Admin Not Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
