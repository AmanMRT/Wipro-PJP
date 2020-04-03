import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Assignment1 
{
	public static void main(String[] bb)
	{
	    try
	    {
	    	// to provide connection with DriverManager
	    	//DriverManager.getConnect("url", "Username", "password");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
	    	
	        //Prepared Statement to create Database of name"emp" as mentioned here
	        PreparedStatement stmt=con.prepareStatement("SELECT * FROM emp");
	        stmt.executeUpdate();
	        
	        // close statement object
	        stmt.close();
	        // close connection object
	        con.close();
	    }
	    catch(Exception ee)
	    {
	    	System.out.println( ee);
	    }
	}
}
