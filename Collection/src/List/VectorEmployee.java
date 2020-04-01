package List;

import java.util.Iterator;
import java.util.Vector;

class Employe
{
	int empId;
	String empName;
	String empAddress;
	float empSalary;
	
	public Employe(int id, String name, String address, Float salary) 
	{
		empId = id;
		empName = name;
		empAddress = address;
		empSalary = salary;
	}	

	// prints employee details 
	public String toString()
	{
		return "Employee [id=" + empId + ", name=" + empName + ", address=" + empAddress + ", salary=" + empSalary + "]";
	}
}

public class VectorEmployee 
{
	// Driver function
	public static void main(String[] args) 
	{
		
		Vector<Employe> list = new Vector<>();
		
		list.add(new Employe(101, "ABBC", "dewcev, South", 14898f));
		list.add(new Employe(102, "POR", "cwcwddv, North", 284999f));
		
		Iterator<Employe> itr = list.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}
