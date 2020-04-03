import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PS3 
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
                
                //Prepared Statement to create Database of name "Students" as mentioned here
                stmt= con.prepareStatement("DELETE FROM Students WHERE StudentID=(?)");
                stmt=con.prepareStatement("SELECT RollNumber, StudentName, Standard  FROM Students AND INSERT INTO Students VALUES(?,?,?,?,?) WHERE StudentDB.Students.StudentId= (?)");
    	        
                System.out.print("Enter Student Roll No");
    	        int i1 = sc.nextInt();
    	        stmt.setInt(6, i1);
    	        
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
