import java.util.Scanner;

public class TestEmployee extends Employee
{
	//Driver Function
	public static void main(String[] args)
	{
        // Following statement would create an object emp of Employee class
		Employee emp= new Employee();
		Scanner sc = new Scanner(System.in);
        
		//Initialization
        // Input Employee details 
		System.out.println("Employee's name");
        String perName = sc.nextLine();
		
	    System.out.println("Annual Salary");
	    double empSalary = sc.nextDouble();
	     
	    System.out.println("Year of Joining");
        int empYear = sc.nextInt();
        
        System.out.println("Employee's National Insurance number");
        String empNo = sc.nextLine();
        
        //set Details
		emp.setName(perName);		
	    emp.setAnnualSalary(empSalary);
        emp.setYearJoin(empYear);
        emp.setInsuranceNo(empNo);

        //Output Details
		System.out.println("Employee Details");
		System.out.println();
		
		System.out.println(" Name:\t"+emp.getName());
		System.out.println("Annual Salary\t"+ emp.getAnnualSalary());
		System.out.println("Joining Year:\t"+ emp.getyearJoin());
		System.out.println("National Insurance number:\t"+ emp.getInsuranceNo());
		
		sc.close();
	}
}
