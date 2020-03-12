
public class Employee extends Person
{
	double annualSalary;
	int yearJoin;
	String insuranceNo;
	
	public void setAnnualSalary(double newSalary)
	{
	      if(newSalary >= 0.0) 
	      {
	    	  annualSalary= newSalary;
	      }
	}
	
	public void setYearJoin(int newYear)
	{
		yearJoin= newYear;
	}
	
	public void setInsuranceNo(String newNumber)
	{
		insuranceNo= newNumber;
	}
	
	public double getAnnualSalary()
	{
		return annualSalary;
	}
	
	public int getyearJoin()
	{
		return yearJoin;
	}
	public String getInsuranceNo()
	{
		return insuranceNo;
	}

}
