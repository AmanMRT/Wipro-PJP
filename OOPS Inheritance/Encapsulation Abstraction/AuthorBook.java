// Create a class Author with the following information.
import java.util.Scanner;

class Author
{
	private String name;
	private String email;
	private char gender;
	
	// set Author's name
	public void setAName(String newName)
	{
		name= newName;
	}
	
	// set Author's Email
	public void setEmail(String newEmail)
	{
		email = newEmail;
	}
	
	// set Author's Gender
	public void setGender(char newGender)
	{
		gender = newGender;
	}
	
	// get Author's Name
	public String getAName()
	{
		return name;
	}
	
	// get Author's Email
	public String getEmail()
	{
		return email;
	}
	
	// get Author's Gender
	public char getGender()
	{
		return gender;
	}
}


class Book extends Author
{
	//extends is used for implementing inheritance
	private String name;
	private double price;
	private int qtyInStock;

	// set Book's name
	public void setBName(String newName)
	{
		name = newName;
	}
	
	// set Book's Price
	public void setPrice(double newPrice)
	{
		price = newPrice;
	}	
	
	// set Book's Quantity in Stock
	public void setqty(int newqty)
	{
		qtyInStock = newqty;
	}
	
	// get Book's Name
	public String getBName()
	{
		return name;
	}
	
	// get Book's Price
	public double getPrice()
	{
		return price;
	}
	
	// get Book's quantity in stock
	public int getqty()
	{
		return qtyInStock;
	}	
}

public class AuthorBook 
{
	// a= author (eg: aname= author_name)
	// b= book (eg: bname= book_name)
	
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        
        // Input Author details 
		System.out.println("Enter Author name");
        String aName = sc.nextLine();
        
		System.out.println("Enter Author Email");
        String aEmail = sc.nextLine();
        
		System.out.println("Enter Author Gender (eg: M= Male, F= Female)");
        char aGender = sc.nextLine().charAt(0);
        
        //Input book details
        System.out.println("Enter Book title");
        String bName = sc.nextLine();
        
        System.out.println("Enter Book price (in rupees)");
        double bprice = sc.nextDouble();
        
        System.out.println("Enter no. of book's in stock");
        int bqty = sc.nextInt();
        
        // Following statement would create an object book
		Book book=new Book();
		
		//  Initialization
		// set author details
		book.setAName(aName);
		book.setEmail(aEmail);
		book.setGender(aGender);
		
		// set book details
		book.setBName(bName);
		book.setPrice(bprice);
		book.setqty(bqty);

		//output the details
		System.out.println("Author Details");
		System.out.println();
		
		System.out.println("Name:\t"+ book.getAName());
		System.out.println("Email:\t"+ book.getEmail());
		System.out.println("Gender:\t"+ book.getGender());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Book Details");
		System.out.println();
		
		System.out.println("Name:\t"+ book.getBName());
		System.out.println("Price:\t"+ book.getPrice()+ "rupees only");
		System.out.println("Quantity:  "+ "Only "+ book.getqty()+" left");
		
		sc.close();
		}
}
