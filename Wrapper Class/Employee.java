// Create an employee class with properties of your choice.
// Example for cloneable method

class Emp implements Cloneable
{
	int empNo;
	String empName;
	double empSalary;
	String empDept;
	
	 protected Emp clone()
	{
		try
		{
			return (Emp) super.clone();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return this;
	}
}
public class Employee 
{
	public static void main(String[] args)
	{
		 Emp emp=new Emp();
		 Emp emp2;
		 
		emp.empNo = 1001;
		emp.empName = "Aman";
		emp.empSalary = 1000000;
		emp.empDept = "Developer";
		
		// Orignals and copy the refrences of same object
		emp2 = emp.clone();		//cloning emp
		
		//Before cloning
		System.out.println("Before Cloning");
		System.out.println(emp.empNo);
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(emp.empDept);
		
		System.out.println();

		System.out.println(emp2.empNo);
		System.out.println(emp2.empName);
		System.out.println(emp2.empSalary);
		System.out.println(emp2.empDept);
		
		System.out.println();
		// After cloning
		System.out.println("After Cloning");
		emp.empNo = 1002;
		emp.empName = "Priya";
		emp.empSalary = 2000000;
		emp.empDept = "Research";
		
		System.out.println();
		
		System.out.println(emp.empNo);
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(emp.empDept);
		
		System.out.println();

		System.out.println(emp2.empNo);
		System.out.println(emp2.empName);
		System.out.println(emp2.empSalary);
		System.out.println(emp2.empDept);
	}
}
