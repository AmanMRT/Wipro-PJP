//Create a school application
import java.util.Scanner;

class PPerson
{
	//Member Variables
	String Name;
	String DOB;	
	
	// set PPersons Name
	public void setName(String newName)
	{
		Name = newName;
	}
	
	// set PPerson DoB
	public void setDOB(String newDOB)
	{
		DOB = newDOB;
	}
	// get PPersons Name
	public String getName() {
		return Name;
	}
	
	// get PPerson DoB
	public String getDOB() {
		return DOB;
	}
}

class Teacher extends PPerson
{
	//Member Variables
	double Salary;
	String Subject;
	
	// set Subject which teacher teaches
	public void setSubject(String newSubject)
	{
		Subject = newSubject;
	}
	
	// set teachers salary
	public void setSalary(double newSalary)
	{
	      if(newSalary >= 0.0) 
	      {
	    	  Salary = newSalary; 
	      }
	}
	
	// get Subject which teacher teaches
	public String getSubject() {
		return Subject;
	}
	
	// get teachers salary
	public double getSalary()
	{
		return Salary;
	}
}

class Student extends PPerson
{
	//Member Variable
	int stdId;
	
	// set Student Id
	public void setStudentId(int newId)
	{
		stdId = newId;  
	}
	
	// get Student Id
	public int getStudentId()
	{
		return stdId;
	}
}

class CollegeStudent extends Student
{
	//Member Variables
	String College;
	int yearOfStudy;
	
	// set College name
	public void setCollegeName(String newCollege)
	{
		College = newCollege;
	}
	
	// set Year of Study
	public void setYearOfStudy(int newYear)
	{
		yearOfStudy = newYear;  
	}
	
	// get College name
	public String getCollegeName() {
		return College;
	}
	
	// get Year of Study
	public int getYearOfStudy()
	{
		return yearOfStudy;
	}
}

public class SchoolApplication 
{
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        
        // Following statement would create an object prsn, tchr, stdnt, clgstd

		PPerson prsn= new PPerson();
		Teacher tchr= new Teacher();
		Student stdnt= new Student();
		CollegeStudent clgstd= new CollegeStudent();
		

        // Input Author details 
		System.out.println("Enter Person name");
        String pName = sc.nextLine();
        
        System.out.println("Enter Person DOB");
        String pDOB = sc.nextLine();
        
		System.out.println("Enter Teacher's Subject");
        String tsub = sc.nextLine();
        
        System.out.println("Enter Teacher's Salary (in rupees)");
        double tsalary = sc.nextDouble();
        
        System.out.println("Enter Student's Id");
        int sId = sc.nextInt();
		
        System.out.println("Enter College Name");
        String cName = sc.nextLine();
        
        System.out.println("Enter Year of Study");
        int cyear = sc.nextInt();
        
        //  Initialization
		prsn.setName(pName);
		prsn.setDOB(pDOB);
		
		tchr.setSubject(tsub);
		tchr.setSalary(tsalary);

		stdnt.setStudentId(sId);
		
		clgstd.setCollegeName(cName);
		clgstd.setYearOfStudy(cyear);
		
		// Output details
		System.out.println();
		System.out.println("Details");
		System.out.println();
		
		System.out.println(" Name:\t"+prsn.getName());
		System.out.println(" Date of Birth:\t"+prsn.getDOB());
		System.out.println(" Salary\t"+ tchr.getSalary());
		System.out.println(" Teacher Subject:\t"+ tchr.getSubject());
		System.out.println(" Student Id:\t"+ stdnt.getStudentId());
		System.out.println(" College:\t"+clgstd.getCollegeName());
		System.out.println(" Year Of Study:\t"+clgstd.getYearOfStudy());
		
		sc.close();
	}
}
