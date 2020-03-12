import java.util.Scanner;

//If the character value is in lowercase, 
//the output should be displayed in uppercase in the following format.

public class UpperLowerCase
{
	static void characterCheck(char character)
	{ 
        int number=character;
        //Uppercase AscII Range
		if(number >= 65 && number <= 90)
		{
			//Becomes Lowercase Char
			number=number+32;//A -> a
			character= (char) number;
            System.out.println(character);
		}
		else
		{
			//Become Uppercase char
			number=number-32;//a -> A
			character= (char) number;
            System.out.println(character);
		}
	}
	//Driver Function
	public static void main(String[] args)
    {
		//user input
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0); 
        
        //function declaration
        characterCheck(ch);
        sc.close();
    }   
}
