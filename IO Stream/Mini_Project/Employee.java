package mini_project;

import java.io.IOException;
import java.util.Scanner;

// Mini  Project 
// Employee Managment System

// class to add employee
class addEmployee
{
	// Member Variables
	private String name;
	private String dob;
	private String id;
	private String designation;
	private double salary;
	
	// return name 
	public String getName() 
	{
		return name;
	}
	
	// input name of employee
	public void setName(String name) 
	{
		this.name = name;
	}
	
	// return date of birth
	public String getDob() 
	{
		return dob;
	}
	
	// input date of birth of employee
	public void setDob(String dob) 
	{
		this.dob = dob;
	}
	
	// return employee Id 
	public String getId() 
	{
		return id;
	}
	
	// input employee id
	public void setId(String id) 
	{
		this.id = id;
	}
	
	// return designation of the employee
	public String getDesignation() 
	{
		return designation;
	}
	
	// input designation of the employee
	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	
	// return salary 
	public double getSalary() 
	{
		return salary;
	}
	
	// input salary of employee
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
}

// Driver main class
public class Employee 
{
	public static void main(String[] args) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		// following will create an object reference with name emp
		addEmployee emp = new addEmployee();
		
		int ch;
		try
		{
			do 
	        {
	    		System.out.println();
	            System.out.println("MAIN MENU");
	        	System.out.println("=========");
	        	System.out.println("1. Add Employee");
	        	System.out.println("2. Display All");
	        	System.out.println("3. Exit :");
	        	System.out.print("Enter Your Choice... (1...3) :");
	   
				ch = sc.hasNextInt() ? sc.nextInt() : 3;

	        	switch(ch)
	        	{
	        		case 1:
		        	{
	        		
		        		System.out.print("Enter name: ");
		        		sc.nextLine();
		        		emp.setName(sc.nextLine());
		        		
		        		System.out.print("Enter D.O.B.: ");
		        		emp.setDob(sc.nextLine());
		        		
		        		System.out.print("Enter Id: ");
		        		emp.setId(sc.nextLine());
		        		
		        		System.out.print("Enter designation: ");
		        		emp.setDesignation(sc.nextLine());
		        		
		        		System.out.print("Enter salary: ");
		        		emp.setSalary(sc.nextDouble());
		        		      
		        		System.out.println();
		        		
		        		System.out.print("Employee " + emp.getName() + " added successfully." );
		        		System.out.println();
	        		
		        	}
	        		case 2:
	        		{
	        	        System.out.println();
	        			System.out.println("Emp Name: \t" + emp.getName());
	        			System.out.println("Emp Id: \t" + emp.getId());
	        			System.out.println("D.O.B.: \t" + emp.getDob());
	        			System.out.println("Designation: \t" + emp.getDesignation());
	        			System.out.println("Salary: \t" + emp.getSalary());
	        			System.out.println();
	        			break;
	        		}
	        		
	        		case 3:
		       		{
		        			System.out.println("Exiting the System.");
		        			break;
		        	}
	        		
	        	}
	        }while(ch != 3);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}
}
