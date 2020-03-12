//  An online library application need to be created for two types of users/roles-Adults and children.
// Both of these users should be able to register an account. 

import java.util.Scanner;

// interface implementation 
interface LibraryUser 
{
	void registerAccount( int age);
	void requestBook(String booktype);
}

// here implements is used to inherit interface
class KidsUsers implements LibraryUser
{
	//member variables
	int age;
	String booktype;
	
	public void registerAccount(int age) 
	{
		if (age < 12)
		{
			System.out.println(" You have successfully registered under a Kids Account. ");
		}
		else
		{
			System.out.println(" Sorry, Age must be less than 12 to register as a kid. ");
		}
	}

	public void requestBook(String booktype) 
	{
		if (booktype == "Kids")
		{
			System.out.println(" Book Issued successfully, please return the book within 10 days. ");
		}
		else
		{
			System.out.println(" Oops, you are allowed to take only kids books. ");
		}
	}
}

// here implements is used to inherit interface
class AdultUsers implements LibraryUser
{
	//member variables
	int age;
	String booktype;
	
	public void registerAccount(int age) 
	{
		if (age > 12)
		{
			System.out.println(" You have successfully registered under an Adult Account. ");
		}
		else
		{
			System.out.println(" Sorry, Age must be greater than 12 to register as an adult. ");
		}
	}

	public void requestBook(String booktype) 
	{
		if (booktype == "Fiction")
		{
			System.out.println(" Book Issued successfully, please return the book within 7 days. ");
		}
		else
		{
			System.out.println(" Oops, you are allowed to take only adult Fiction books. ");
		}
	}
}

//Driver class
public class LibraryInterfaceDemo 
{
	// Driver Function
	public static void main(String[] args) 
	{
		// here kids and adult are objects for class KidsUsers and AdultUsers resp.
		KidsUsers kids = new KidsUsers();
		AdultUsers adult = new AdultUsers();
		
		Scanner sc = new Scanner(System.in);
		
		
		// user input 
		// input age
		int age = sc.nextInt();
		
		kids.registerAccount(age);
		adult.registerAccount(age);

		sc.nextLine();
		
		//input bookcategory 
		String booktype = sc.nextLine();
		
		kids.requestBook(booktype);		
		adult.requestBook(booktype);
		
	}
}
