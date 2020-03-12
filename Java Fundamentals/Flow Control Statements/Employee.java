
public class Employee 
{
	//Driver Function
	public static void main(String[] args)
    {	
		//Data members
		int i=0, j, DA=0, Salary;
		String Designation="" ;
		
		//Input data into Array
		//Emp_No =  Employee Id
		int[] Emp_No = {1001, 1002, 1003, 1004, 1005, 1006, 1007}; 	
		
		//Emp_Name = Employee Name
		String[] Emp_Name = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
		
		String[] Joining_Date = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"};
		
		char[] Designation_Code = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
		
		String[] Department_Name = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
		
		int[] Basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
		
		int[] HRA = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
		
		int[] IT = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
		
		//input from CommandLine
		int id= Integer.parseInt(args[0]);		

		for(j=0;j<Emp_No.length;j++)
		{
			if(id == Emp_No[j])
			{
				 i=j;
				 break;
			}
		}//end for
		
		switch(Designation_Code[i])
		{
			//DA= Dearness Allowance
			case 'e':
			{
				 DA = 20000;
				 Designation = "Engineer";
				 break;
			}
			case 'c':
			{
				 DA = 30000;
				 Designation = "Consultant";
				 break; 
			}
			case 'k':
			{
				 DA = 12000;
				 Designation = "Clerk";
				 break;
			}
			case 'r':
			{
				 DA = 15000;
				 Designation = "Receptionist";
				 break;
			}
			case 'm':
			{
				 DA = 40000;
				 Designation = "Manager";
				 break;
			}
			default:
			{
				 System.out.println("Invalid");
				 break;
			}
		}//end switch
		
		 // calculate salary of employee
		 Salary= DA + Basic[i] + HRA[i] - IT[i]; 	
		 
		 //Final Output print
		 System.out.print("Emp No. "+ "Emp Name "+ " Department " + "Designation "+ "Salary ");
		 System.out.println();
		 System.out.print(Emp_No[i]+"\t" + Emp_Name[i]+"\t  " + Department_Name[i] + "\t     " + Designation + "\t " + Salary  );
    }		    
}