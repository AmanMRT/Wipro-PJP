import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcConnection2 
{
	public static void main(String[] bb)
	{
	    try
	    {
	    	// to provide connection with DriverManager
	    	//DriverManager.getConnect("url", "Username", "password");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
	    	
	        //Prepared Statement to create Database of name "WiproDB" as mentioned here
	        PreparedStatement stmt=con.prepareStatement("Create Database WiproDB");
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
