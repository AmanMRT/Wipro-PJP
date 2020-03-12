// A student portal provides user to register their profile.
import java.util.Scanner;

//custom Exception declaration 
class InvalidCountryException extends Exception
{  
	InvalidCountryException(String s)
	{  
	  super(s);  
	}  
}
public class UserRegistration 
{
	// custom Exception Initializatiion
	static void validate(String userName, String userCountry)throws InvalidCountryException
	{  
	     if(userCountry.equals("India") || userCountry.equals("INDIA") || userCountry.contentEquals("india"))   
	     {
	    	 System.out.println("User registration done successfully.");
	     }
	     else
	     {
	    	 throw new InvalidCountryException("User Outside India cannot be registered.");   
	     }
	}  
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username");
		String userName = sc.nextLine();
		
		System.out.println("Enter UserCountry");
		String userCountry = sc.nextLine();
		try
		{
		// to validate credintials
		validate(userName, userCountry);
		}catch(InvalidCountryException e)
		{
			//print Exception
			System.out.println(e);
		}
		sc.close();
	}
}
