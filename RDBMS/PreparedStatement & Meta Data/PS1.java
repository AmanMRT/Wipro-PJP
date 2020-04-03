import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PS1 
{
	public static void main(String[] bb)
	{
		int ch;
		Scanner sc = new Scanner(System.in);

	    try
	    {
	    	// to provide connection with DriverManager
	    	//DriverManager.getConnect("url", "Username", "password");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
	    	
	    	//this will make database to use Specific database WiproDB
	    	PreparedStatement stmt=con.prepareStatement("Use wiprodb");
            stmt.executeUpdate();
	        
	        try
			{
				do 
		        {
		    		System.out.println();
		            System.out.println("MAIN MENU");
		        	System.out.println("=========");
		        	System.out.println("1. Insert");
		        	System.out.println("2. Delete");
		        	System.out.println("3. Modify");
		        	System.out.println("4. Display");
		        	System.out.println("5. Exit :");
		        	System.out.print("Enter Your Choice... (1...5) :");
		   
					ch = sc.hasNextInt() ? sc.nextInt() : 5;
		
		        	switch(ch)
		        	{
		        	// insert respective details into employee table
		        		case 1:
			        	{
			        		//Prepared Statement to create Database of name"emp" as mentioned here
			    	        stmt=con.prepareStatement("INSERT INTO employee VALUES(?,?,?,?,?)");
			    	        
			    	        System.out.print("Enter Student Roll No");
			    	        int i1 = sc.nextInt();
			    	        
			    	        System.out.print("Enter Student Name");
			    	        sc.nextLine();
			    	        String s1 = sc.nextLine();
			    	        
			    	        System.out.print("ENter Student Fee");
			    	        double s2 = sc.nextDouble();
			    	        
			    	        System.out.print("Enter Student Admission ID");
			    	        sc.nextLine();
			    	        String s3 = sc.nextLine();
			    	        
			    	        System.out.print("Enter Student Admission Date('dd-mm-yyyy')");
			    	        String s4=sc.nextLine();
			    	
			    	        //assign these enterd values to there respectuve places
			    	        stmt.setInt(1,i1);
			    	        stmt.setString(2, s1);
			    	        stmt.setDouble(3, s2);
			    	        stmt.setString(4, s3);
			    	        stmt.setString(5, s4);
			    	        
			    	        //execute the statement
			    	        stmt.executeUpdate();
			    	        break;
			        	}
			        	// delete the record of respective student
		        		case 2:
		        		{
			        		stmt= con.prepareStatement("DELETE FROM employee WHERE EID=(?) ");
			        		
			        		 System.out.print("Enter Student Roll No");
				    	        int i1 = sc.nextInt();
				    	        stmt.setInt(1, i1);
				    	        
				    	        //execute the statement
				    	        stmt.executeUpdate();
				    	        break;
		        		}
		        		// Modify the content of respective student
		        		case 3:
		        		{
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
			    	        break;
		        		}
		        		// display name respective to the Id 
		        		case 4:
		        		{
		        			stmt= con.prepareStatement("SELECT  `ENAME` FROM `employee` WHERE EID=(?);");
		        			
		        			System.out.print("Enter Student Roll No");
			    	        int i1 = sc.nextInt();
			    	        stmt.setInt(1, i1);
			    	        
			    	        //execute the statement
			    	        stmt.executeQuery();
			    	        break;

		        		}
		        		case 5:
			       		{
			        			System.out.println("Exiting the System.");
			        			break;
			        	}
			       		default:
			       		{
			       			System.out.println("Invalid Entry.");
			       		}
		        	}
		        }while(ch != 5);
			}//end try block
			catch(Exception e)
			{
				System.out.println(e);
			}
	        
	        // close statement object
	        stmt.close();
	        // close connection object
	        con.close();

	    }// end try block
	    catch(Exception ee)
	    {
	    	System.out.println( ee);
	    }
	    sc.close();
	    
	}
}
