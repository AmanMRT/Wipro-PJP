// Write a program to accept name and age of a person from the command prompt
import java.util.Scanner;

// custom Exception declaration 
class InvalidAgeException extends Exception
{  
	InvalidAgeException(String s)
	{  
	  super(s);  
	}  
}  

public class properErrorMessages 
{
	// custom Exception Initializatiion
		static void validate(int age)throws InvalidAgeException
		{  
		     if(age >= 18 || age <= 60)   
		      throw new InvalidAgeException("Enter valid age.");  
		}  
		
		public static void main(String[] args) 
		{		
			// 1st element from command line
			String userName = args[0];
			
			// 2nd element from command line
			int age = Integer.parseInt(args[1]);
			
			try
			{
			// to validate credintials
			validate(age);
			}catch(InvalidAgeException e)
			{
				//print Exception
				System.out.println(e);
		}
	}
}
