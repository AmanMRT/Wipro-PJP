package List;

import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	int empId;
	String empName;
	String empEmail;
	String empGender;
	float empSalary;
	
	// Setter and Getter for Employee id
	public void setEmpId(int EmpId) 
	{
		empId = EmpId;
	}
	
	public int getEmpId() 
	{
		return empId;
	}
	
	// Setter and Getter for Employee Name
	public void setEmpName(String EmpName) 
	{
		empName = EmpName;
	}
	
	public String getEmpName() 
	{
		return empName;
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
	
	// Setter and Getter for Employee Gender
	public void setEmpGender(String EmpGender)
	{
		empGender = EmpGender;
	}
	
	public String getEmpGender() {
		return empGender;
	}
	
	// Setter and Getter for Employee Salary
	public void setEmpSalary(float EmpSalary) 
	{
		empSalary = EmpSalary;
	}
	
	public float getEmpSalary()
	{
		return empSalary;
	}

	// prints employee details 
	void GetEmployeeDetails()
	{
		System.out.println("Employee Id:" + getEmpId());
		System.out.println("Employee Name:" + getEmpName());
		System.out.println("Employee Email:" + getEmpEmail());
		System.out.println("Employee Gender:" + getEmpGender());
		System.out.println("Employee Salary:" + getEmpSalary());
	}
}
// 
public class EmployeeManagment 
{
	static Employee emp = new Employee();
	static ArrayList<Employee> list = new ArrayList<Employee>();
	
	// function to add employee details directly through employee object
	boolean addEmployee(Employee e)
	{
		return list.add(e);
	}
	
	// function to delete employee of respective employee Id
	boolean deleteEmployee(int empId)
	{
		// member variable
		boolean status = false;
		
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext())
		{
			Employee emp = itr.next();
			// check whether the given empId belongs to the list 
			if(emp.getEmpId() == empId)
			{
				status = true;
				itr.remove();
			}
		}
		return status;
	}
	
	// function to display payslip of respective employee id
	String showPaySlip(int empId)
	{
		String PaySlip = "Invalid Employee Id. ";
		
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext())
		{
			Employee emp = itr.next();
			// check whether the given empId belongs to the list 
			if(emp.getEmpId() == empId)
			{
				PaySlip = "Pay Slip for Employee Id " + empId + " is " + emp.getEmpSalary();
			}
		}
		return PaySlip;
	}
	
	// function to display all the employee's details
	public Employee[] listAll() 
	{
		Employee[] empArray = new Employee[list.size()];
		for (int i = 0; i < list.size(); i++)
			empArray[i] = list.get(i);
		return empArray;
	}
	
	// Driver function
	public static void main(String[] args) 
	{
		// empmgmt as a object refrence variable
		EmployeeManagment empmgmt = new EmployeeManagment();
		
		// employee emp1 details 
		Employee emp1 = new Employee();
		emp1.setEmpId(102);
		emp1.setEmpName("POR");
		emp1.setEmpEmail("POR@gmail.com");
		emp1.setEmpGender("FeMmle");
		emp1.setEmpSalary(14898);
		
		// emp1 details is add directly with this function
		empmgmt.addEmployee(emp1);
		System.out.println();
		
		Employee emp2 = new Employee();
		// employee emp2 details 
		emp2.setEmpId(101);
		emp2.setEmpName("ABBC");
		emp2.setEmpEmail("abc@gmail.com");
		emp2.setEmpGender("Male");
		emp2.setEmpSalary(284999);
		
		// emp2 details is add directly with this function
		empmgmt.addEmployee(emp2);
		System.out.println();
		
		// Display all employees details before operations
		for (Employee emp : empmgmt.listAll())
			emp.GetEmployeeDetails();
			System.out.println();
			
		
		System.out.println();
		System.out.println(empmgmt.showPaySlip(101));
		System.out.println(empmgmt.showPaySlip(102));
		System.out.println(empmgmt.showPaySlip(103));
		
		empmgmt.deleteEmployee(101);

		// Display all employees details after operations
		for (Employee emp : empmgmt.listAll())
			emp.GetEmployeeDetails();
			System.out.println();
	}
	
}
