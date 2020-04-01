package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employeee
{
	String empFirstName;
	String empLastName;
	String empEmail;
	String empAddress;
	long empNumber;
	
	
	// Setter and Getter for Employee FirstName
	public void setEmpFirstName(String EmpFirstName) 
	{
		empFirstName = EmpFirstName;
	}
	
	public String getEmpFirstName() 
	{
		return empFirstName;
	}
	
	// Setter and Getter for Employee LastName
	public void setEmpLastName(String EmpLastName) 
	{
		empLastName = EmpLastName;
	}
	
	public String getEmpLastName() 
	{
		return empLastName;
	}

	// Setter and Getter for Employee Email
	public void setEmpEmail(String EmpEmail) 
	{
		empEmail = EmpEmail;
	}
	
	public String getEmpEmail() 
	{
		return empEmail;
	}
	
	// Setter and Getter for Employee Address
	public void setEmpAddress(String EmpAddress)
	{
		empAddress = EmpAddress;
	}
	
	public String getEmpAddress()
	{
		return empAddress;
	}
	
	// Setter and Getter for Employee Salary
	public void setEmpNumber(long EmpNumber) 
	{
		empNumber = EmpNumber;
	}
	
	public float getEmpNumber()
	{
		return empNumber;
	}
}

public class ManageEmployee 
{
	static ArrayList<Employeee> list = new ArrayList<Employeee>();

	// function to add employee details directly through employee object
	boolean addEmployee(Employeee e)
	{
		return list.add(e);
	}
	
	// function to print employee present in the arrayList
	public void printAll(ArrayList<Employeee> al)
	{
		Iterator<Employeee> it = list.iterator();
        while (it.hasNext())
        {
            Employeee emp = it.next();
            System.out.format("%-15s %-15s %-15s %-15s %-15s\n", emp.getEmpFirstName(), emp.getEmpFirstName(), emp.getEmpNumber(), emp.getEmpEmail(), emp.getEmpAddress());
        }
	}
	
	// Driver function
	public static void main(String[] args) 
	{
		// me here is the reference variable here
		ManageEmployee me = new ManageEmployee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Employees you want to add: ");
		int num = sc.nextInt();
		
		for(int i = 0;  i<num ; i++)
		{
			// Everytime creates an object of employee class to add values without confict
			Employeee emp = new Employeee();
			
			System.out.print("Enter First Name:  ");
			sc.nextLine();
			emp.setEmpFirstName(sc.nextLine());
			
			System.out.print("Enter Last Name:  ");
			emp.setEmpLastName(sc.nextLine());
			
			System.out.print("Enter Email:  ");
			emp.setEmpEmail(sc.nextLine());
			
			System.out.print("Enter Address:  ");
			emp.setEmpAddress(sc.nextLine());
			
			System.out.print("Enter Number:  ");
			emp.setEmpNumber(sc.nextLong());
			      
			System.out.println();		//new line
			me.addEmployee(emp);		//add employee details
			
			sc.close();
		}
		
		System.out.format("%-15s %-15s %-15s %-15s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
		// function invoked 
		me.printAll(list);
	}
}
