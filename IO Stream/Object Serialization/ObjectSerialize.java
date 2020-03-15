// Create a class called Employee with properties 
// name(String),dateOfBirth(java.util.Date),department(String),designation(String) and Salary(double).

import java.io.*;
import java.util.Scanner;


class Employee implements Serializable 
{
	private String name;
	private String dob;
	private String department;
	private String designation;
	private double salary;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getDob() 
	{
		return dob;
	}
	
	public void setDob(String dob) 
	{
		this.dob = dob;
	}
	
	public String getDepartment() 
	{
		return department;
	}
	
	public void setDepartment(String department) 
	{
		this.department = department;
	}
	
	public String getDesignation() 
	{
		return designation;
	}
	
	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	public String toString() 
	{
		return "Employee [name=" + name + ", dob=" + dob + ", department=" + department + ", designation=" + designation + ", salary=" + salary + "]";
	}
}

public class ObjectSerialize
{

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		try
		{
		System.out.print("Enter name: ");
		emp.setName(sc.nextLine());
		
		System.out.print("Enter D.O.B.: ");
		emp.setDob(sc.nextLine());
		
		System.out.print("Enter department: ");
		emp.setDepartment(sc.nextLine());
		
		System.out.print("Enter designation: ");
		emp.setDesignation(sc.nextLine());
		
		System.out.print("Enter salary: ");
		emp.setSalary(sc.nextDouble());
		
		sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream("OutObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("OutObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDob());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
			
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		
		}
		catch(IOException | ClassNotFoundException e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
