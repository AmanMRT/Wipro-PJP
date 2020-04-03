import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcConnection 
{
	public static void main(String[] bb)
	{
	    try
	    {
	    	//provide class from the DB connector
	    	Class.forName("com.mysql.jdbc.Driver");
	    	
	    	// to provide connection with DriverManager
	    	//DriverManager.getConnect("url", "Username", "password");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
	        
	        //Prepared Statement to create Database of name "WiproDB" as mentioned here
	        PreparedStatement stmt=con.prepareStatement("Create Database WiproDB");
	        
	        //executeUpdate() is used to update the relative statement here is stmt.
	        stmt.executeUpdate();
	     
	        System.out.println("Connection Established");
	        
	        // close statement object
	        stmt.close();
	        // close connection object
	        con.close();
	    }
	    catch(Exception ee)
	    {
	    	System.out.println("Connection could  not be established" + ee);
	    }
	}
}
