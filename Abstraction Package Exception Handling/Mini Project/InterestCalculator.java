import java.util.Scanner;

// Mini Project - 03
// Interest Calculator for FD and savings account

class InvalidNumberException extends Exception
{  
	InvalidNumberException(String s)
	{  
	  super(s);  
	}  
}  

// abstract class account 
abstract class Account
{
	// Member Variable
	double interestRate;
	double amount;
	abstract double calculateInterest();
}

// class for FD Account
class FDAccount
{
	// Member Variable
	double interestRate;
	double amount;
	int noOfDays;
	int ageOfACHolder;
	double calculateInterest(double amount, int noOfDays, int ageOfACHolder)
	{
		double interest = 0.0;
		if(amount < 10000000)
		{
			// for general category
			if(noOfDays >= 7 && noOfDays <=14 && ageOfACHolder < 60)
			{ 
				interestRate = 0.045;
				interest = amount * interestRate;
			} // if senior citizen
			else if(noOfDays >= 7 && noOfDays <=14 && ageOfACHolder >= 60)
			{
				interestRate = 0.05;
				interest = amount * interestRate;
			}

			// for general category
			else if(noOfDays >= 15 && noOfDays <= 29 && ageOfACHolder < 60)
			{ 
				interestRate = 0.0475;
				interest = amount * interestRate;
			} // if senior citizen
			else if(noOfDays >= 15 && noOfDays <= 29 && ageOfACHolder >= 60)
			{
				interestRate = 0.0525;
				interest = amount * interestRate;
			}

			// for general category
			else if(noOfDays >= 30 && noOfDays <= 44 && ageOfACHolder < 60)
			{ 
				interestRate = 0.055;
				interest = amount * interestRate;
			} // if senior citizen
			else if(noOfDays >= 30 && noOfDays <= 44 && ageOfACHolder >= 60)
			{
				interestRate = 0.06;
				interest = amount * interestRate;
			}

			// for  general category
			else if(noOfDays >= 45 && noOfDays <= 60 && ageOfACHolder < 60)
			{ 
				interestRate = 0.07;
				interest = amount * interestRate;
			} // if senior citizen
			else if(noOfDays >= 45 && noOfDays <= 60 && ageOfACHolder >= 60)
			{
				interestRate = 0.075;
				interest = amount * interestRate;
			}

			// for  and general category
			else if(noOfDays >= 61 && noOfDays <= 184 && ageOfACHolder < 60)
			{ 
				interestRate = 0.075;
				interest = amount * interestRate;
			} // if senior citizen
			else if(noOfDays >= 61 && noOfDays <= 184 && ageOfACHolder >= 60)
			{
				interestRate = 0.08;
				interest = amount * interestRate;
			}

			// for  and general category
			else if(noOfDays >= 185 && noOfDays <= 366 && ageOfACHolder < 60)
			{ 
				interestRate = 0.08;
				interest = amount * interestRate;
			} // if senior citizen
			else if(noOfDays >= 185 && noOfDays <= 366 && ageOfACHolder >= 60)
			{
				interestRate = 0.085;
				interest = amount * interestRate;
			}
		}	
			// for amount more than 1 crore
			else
			{
				if(noOfDays >= 7 && noOfDays <= 14 )
				{ 
					interestRate = 0.065;
					interest = amount * interestRate;
				} 
				else if(noOfDays >= 15 && noOfDays <= 29)
				{
					interestRate = 0.0675;
					interest = amount * interestRate;
				}
				else if(noOfDays >= 30 && noOfDays <= 44)
				{
					interestRate = 0.0675;
					interest = amount * interestRate;
				}
				else if(noOfDays >= 45 && noOfDays <= 60)
				{
					interestRate = 0.08;
					interest = amount * interestRate;
				}
				else if(noOfDays >= 61 && noOfDays <= 184)
				{
					interestRate = 0.085;
					interest = amount * interestRate;
				}
				else if(noOfDays >= 185 && noOfDays <= 366)
				{
					interestRate = 0.1;
					interest = amount * interestRate;
				}
				else
				{
					System.out.println();	// escapes a line
					System.out.println("Enter Valid Details");
				}
		}
		System.out.println("Interest Gained : Rs. " + interest);
		return interest;
	}
}

//class for Savings Account
class SBAccount
{
	// Member Variable
	double interestRate = 0.04;
	double amount;
	 
	double calculateInterest(double amount)
	 {
		double interest = (amount * interestRate);
		System.out.println();	// escapes a line
		System.out.println("Interest Gained : Rs. " + interest);
		return interest;
	 }
}

//class for RD Account
class RDAccount
{
	// Member Variable
	double interestRate;
	double amount;
	int noOfMonths;
	double monthlyAmount;
	int ageOfACHolder;
	
	double calculateInterest(double amount, int noOfMonths, int ageOfACHolder)
	{
		//Member Variable
		double interest = 0.0;
		
		// for first 6 months and general category
		if(noOfMonths == 6 && ageOfACHolder<60)
		{ 
			interestRate = 0.075;
			interest = amount * interestRate;
		} // if senior citizen
		else if(noOfMonths == 6 && ageOfACHolder>=60)
		{
			interestRate = 0.08;
			interest = amount * interestRate;
		}
		
		// for first 9 months and general category
		if(noOfMonths == 9 && ageOfACHolder<60)
		{ 
			interestRate = 0.0775;
			interest = amount * interestRate;
		}// if senior citizen
		else if(noOfMonths == 9 && ageOfACHolder>=60)
		{
			interestRate = 0.0825;
			interest = amount * interestRate;
		}
		
		// for first 12 months and general category
		if(noOfMonths == 12 && ageOfACHolder<60)
		{ 
			interestRate = 0.08;
			interest = amount * interestRate;
		}// if senior citizen
		else if(noOfMonths == 12 && ageOfACHolder>=60)
		{
			interestRate = 0.085;
			interest = amount * interestRate;
		}
		
		// for first 15 months and general category
		if(noOfMonths == 15 && ageOfACHolder<60)
		{ 
			interestRate = 0.0825;
			interest = amount * interestRate;
		}// if senior citizen
		else if(noOfMonths == 15 && ageOfACHolder>=60)
		{
			interestRate = 0.0875;
			interest = amount * interestRate;
		}
		
		// for first 18 months and general category
		if(noOfMonths == 18 && ageOfACHolder<60)
		{ 
			interestRate = 0.085;
			interest = amount * interestRate;
		}// if senior citizen
		else if(noOfMonths == 18 && ageOfACHolder>=60)
		{
			interestRate = 0.09;
			interest = amount * interestRate;
		}
		
		// for first 21 months and general category
		if(noOfMonths == 21 && ageOfACHolder<60)
		{ 
			interestRate = 0.0875;
			interest = amount * interestRate;
		}// if senior citizen
		else if(noOfMonths == 21 && ageOfACHolder>=60)
		{
			interestRate = 0.0925;
			interest = amount * interestRate;
		}
		else
		{
			System.out.println();	// escapes a line
			System.out.println("Enter Valid Details");
		}
		
		System.out.println();	// escapes a line
		System.out.println("Interest Gained : Rs. " + interest);
		return interest;
	}
}
public class InterestCalculator 
{
	// custom Exception Initializatiion
	static void validateDays(int noOfDays)throws InvalidNumberException
	{  
	     if(noOfDays<=0)   
	      throw new InvalidNumberException("Invalid Number of days. Enter non-negative values ."); 
	}
	static void validateMonth(int noOfMonths)throws InvalidNumberException
	{  
	     if(noOfMonths<=0)   
	      throw new InvalidNumberException("Invalid Number of month. Enter non-negative values."); 
	}
	static void validateAge(int ageOfACHolder)throws InvalidNumberException
	{  
	     if(ageOfACHolder<=0)   
	      throw new InvalidNumberException("Age cannot be negative ."); 
	}
	//Driver Function
	public static void main(String[] args)
	{
		int ch = 0;
        Scanner sc = new Scanner(System.in);
        
        // Following will create the objects for sb, fd, rd 
        SBAccount sb = new SBAccount();
        FDAccount fd = new FDAccount();
        RDAccount rd = new RDAccount();
        
        do 
        {
    		System.out.println();
            System.out.println("MAIN MENU");
        	System.out.println("=========");
        	System.out.println("1. Interest Calculator - SB");
        	System.out.println("2. Interest Calculator - FD");
        	System.out.println("3. Interest Calculator - RD");
        	System.out.println("4. Exit :");
        	System.out.println("Enter Your Choice... (1...4) :");
        	System.out.println();
			ch = sc.hasNextInt() ? sc.nextInt() : 4;
		
			switch(ch)
        	{
        		// case for Savings account
        		case 1:
	        	{
		        	System.out.print("Enter the average amount in your account: ");
		        	double amount = sc.nextDouble();		//input amount
		        	
		        	// Function Declaration
		        	sb.calculateInterest(amount);
		        	
		    		break;
	        	}
	        	// case for FD Account
        		case 2:
	        	{
		        	System.out.print("Enter the FD amount : ");
		        	double amount = sc.nextDouble();		//input amount
		        	
		        	System.out.print("Enter the number of days : ");
		        	int noOfDays = sc.nextInt();			//input number of days
		        	//try catch block to validate days
		        	try 
		        	{
						validateDays(noOfDays);
					} catch (InvalidNumberException e) {
						System.out.println(e);
					}
		        	
		        	System.out.print("Enter your age : ");
		        	int ageOfACHolder = sc.nextInt();		//input your age
		        	
		        	//try catch block to validate age
		        	try {
						validateAge(ageOfACHolder);
					} catch (InvalidNumberException e) {
						System.out.println(e);
					}
		        	
		        	// Function Declaration
		        	fd.calculateInterest(amount, noOfDays, ageOfACHolder);
		        	
		    		break;
	        	}
	        	
	        	// case for RD Account
        		case 3:
	        	{
		        	System.out.print("Enter the RD amount : ");
		        	double amount = sc.nextDouble();		//input amount
		        	
		        	System.out.print("Enter the number months : ");
		        	int noOfMonths = sc.nextInt();			//input number of months
		        	
		        	////try catch block to validate month
		        	try {
						validateMonth(noOfMonths);
					} catch (InvalidNumberException e) {
						System.out.println(e);
					}
		        	
		        	System.out.print("Enter your age : ");
		        	int ageOfACHolder = sc.nextInt();		//input your age
		        	
		        	////try catch block to validate age
		        	try {
						validateAge(ageOfACHolder);
					} catch (InvalidNumberException e) {
						System.out.println(e);
					}
		        	
		        	// Function Declaration
		        	rd.calculateInterest(amount, noOfMonths, ageOfACHolder);
		        	
		    		break;
	        	}
        		default:
	        	{
					System.out.println("Exit.");
					break;
	        	}
        	}
	        	
        }while(ch!=4);
	}
}
