import java.util.Scanner;

//Write a program to receive a color code from the user (an Alphabhet). 
//The program should then print the color name, based on the color code given.

public class ColorCode
{
	static void checkColor(char character)
	{
		switch(character)
		{
		//Uppercase Letter
		case 'R':
			{
				System.out.print("Red Color");
				break;
			}
		case 'B':
			{
				System.out.print("Blue Color");
				break;
			}
		case 'G':
			{
				System.out.print("Green Color");
				break;
			}
		case 'O':
			{
				System.out.print("Orange Color");
				break;
			}
		case 'Y':
			{
				System.out.print("Yellow Color");
				break;
			}
		case 'W':
			{
				System.out.print("White Color");
				break;
			}
			//Lowercase Letter 
		case 'r':
			{
				System.out.print("Red Color");
				break;
			}
		case 'b':
			{
				System.out.print("Blue Color");
				break;
			}
		case 'g':
			{
				System.out.print("Green Color");
				break;
			}
		case 'o':
			{
				System.out.print("Orange Color");
				break;
			}
		case 'y':
			{
				System.out.print("Yellow Color");
				break;
			}
		case 'w':
			{
				System.out.print("White Color");
				break;
			}
			default:
				{
					System.out.print("Invalid");
				}		
		}
		
	}
	//Driver Function
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        
        //function defination
        checkColor(ch);
        sc.close();
    }
	
}
