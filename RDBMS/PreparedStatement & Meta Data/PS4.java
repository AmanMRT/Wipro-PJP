import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PS4 
{
	public static void main(String[] bb)
    {
		Scanner sc = new Scanner(System.in);

        try{
	        	//provide class from the DB connector
		    	Class.forName("com.mysql.jdbc.Driver");
		    	
		    	// to provide connection with DriverManager
		    	//DriverManager.getConnect("url", "Username", "password");
	            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
	            
	            // uses StudentDB for further usage
                PreparedStatement stmt=con.prepareStatement("Use StudentDB");
                stmt.executeUpdate();
                
                // statement to modify values of respective value
	            stmt= con.prepareStatement("UPDATE `employee` SET `Salary`=(?) WHERE EID= (?);");
    			
    			System.out.print("Enter Student Roll No");
    	        int i1 = sc.nextInt();
    	        stmt.setInt(1, i1);
    	        System.out.print("ENter Student Fee");
    	        double s2 = sc.nextDouble();
    	        
    	        stmt.setInt(2, i1);
    	        stmt.setDouble(1, s2);
    	        
    	        //execute the statement
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
        sc.close();
	}
}
