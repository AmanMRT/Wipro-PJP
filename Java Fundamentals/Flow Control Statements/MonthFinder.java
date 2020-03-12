import java.util.Scanner;

// Write a program to receive a number and 
//print the corresponding month name.

public class MonthFinder
{
	static void checkMonth(int month)
	{ 
		if(month > -1)
		{
			switch(month)
			{
			
			case 1:
				{
					System.out.print("January");
					break;
				}
			case 2:
				{
					System.out.print("Feburary");
					break;
				}
			case 3:
				{
					System.out.print("March");
					break;
				}
			case 4:
				{
					System.out.print("April");
					break;
				}
			case 5:
				{
					System.out.print("May");
					break;
				}
			case 6:
				{
					System.out.print("June");
					break;
				}	
			case 7:
				{
					System.out.print("July");
					break;
				}
			case 8:
				{
					System.out.print("August");
					break;
				}
			case 9:
				{
					System.out.print("September");
					break;
				}
			case 10:
				{
					System.out.print("October");
					break;
				}
			case 11:	
				{
					System.out.print("November");
					break;
				}
			case 12:
				{
					System.out.print("December");
					break;
				}	
			default:
				{
					System.out.print("Invalid Month Entry");
				}
			}
		}
		//end if
		else
		{
			System.out.print("Please enter the month in numbers");
		}
		
	}
	
	//Driver Function
	public static void main(String[] args)
    {
		//user input
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt(); 
        
        //function called
        checkMonth(num);
        sc.close();
    }   
}
