import java.util.Scanner;

// Write a Program to take care of Number Format Exception

// custom Exception declaration 
class NumberException extends Exception
{  
	NumberException(String s)
	{  
	  super(s);  
	}  
}  

public class NumberFormatException 
{
	// custom Exception Initializatiion
	static void validate(int num)throws NumberException
	{  
	     if(num<0 || num>100)   
	      throw new NumberException("Enter number not in range 0 - 100.");  
	}  
	
	// throws keyword implementation
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			// Member variables
			System.out.println("Student 1 details");
			System.out.println("Student Name");
			String name1 = sc.nextLine();
			
			System.out.println("Marks in subject 1");
			int num1 = sc.nextInt();
			validate(num1);		//validation of number for exception
			
			System.out.println("Marks in subject 2");
			int num2 = sc.nextInt();
			validate(num2);		//validation of number for exception
			
			System.out.println("Marks in subject 3");
			int num3 = sc.nextInt();
			validate(num3);		//validation of number for exception
			
			System.out.println();
			
			System.out.println("Student 2 details");
			System.out.println("Student Name");
			String name2 = sc.nextLine();
			sc.nextLine();
			System.out.println("Marks in subject 1");
			int num4 = sc.nextInt();
			validate(num4);		//validation of number for exception
			
			System.out.println("Marks in subject 2");
			int num5 = sc.nextInt();
			validate(num5);		//validation of number for exception
			
			System.out.println("Marks in subject 3");
			int num6 = sc.nextInt();
			validate(num6);		//validation of number for exception
			
			// prints average of student1
			int sum1 = (num1 + num2 + num3);
			double avg1 = sum1/3;
			System.out.println("Student1 average : " +avg1);
			
			// prints average of student2
			int sum2 = (num4 + num5 + num6);
			double avg2 = sum2/3;
			System.out.println("Student2 average : " +avg2);

			}catch(NumberException | ArithmeticException e)
			{
				System.out.println(e);
			}
	}
}
