import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PS2 
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
	            
                //this statement execute only once
                PreparedStatement stmt=con.prepareStatement("Create Database StudentDB");
                stmt.executeUpdate();
                
                // uses StudentDB for further usage
                stmt=con.prepareStatement("Use StudentDB");
                stmt.executeUpdate();
                
                //cerate table students in StudentDB
                stmt=con.prepareStatement("CREATE TABLE Students(Roll Number INT(4) PRIMARY KEY,StudentName VARCHAR(30) NOT NULL,Standard VARCHAR(2) NOT NULL,DOB DATE, FEE NUMBER(9,2);");
                stmt.executeUpdate();
                
              //Prepared Statement to create Database of name "Students" as mentioned here
    	        stmt=con.prepareStatement("INSERT INTO Students VALUES(?,?,?,?,?)");
    	        
    	        System.out.print("Enter Student Roll No");
    	        int i1 = sc.nextInt();
    	        
    	        System.out.print("Enter Student Name");
    	        sc.nextLine();
    	        String s1 = sc.nextLine();
    	        
    	        System.out.print("Enter Standard");
    	        sc.nextLine();
    	        String s2 = sc.nextLine();
    	        
    	        System.out.print("Enter Student DOB('dd-mm-yyyy')");
    	        String s3=sc.nextLine();
    	        
    	        System.out.print("Enter Student Fee");
    	        int s4 = sc.nextInt();
    	       
    	
    	        //assign these enterd values to there respective places
    	        stmt.setInt(1,i1);
    	        stmt.setString(2, s1);
    	        stmt.setString(3, s2);
    	        stmt.setString(4, s3);
    	        stmt.setInt(5, s4);
    	        
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
