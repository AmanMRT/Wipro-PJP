// Initialize a character variable in a program and 
//check if it's a alphabet, digit or special char.

import java.util.Scanner;
public class CheckInput
{
	static void check(char character)
    {
        int number=character;
        //check for alphabet
        if((number >= 65 && number <= 90) || (number >= 97 && number <= 122))
        {
            System.out.println(character + " is a alphabet");
        }//end if
        //check for digit
        else if(number >= 48 && number <= 57)
        {
            System.out.println(character +" is a digit");
        }//end elseif
        //check for special character
        else
        {
            System.out.println(character +" is a special character");
        }
    }
	//Driver Function
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch1 = sc.next().charAt(0);//input character 
       //function to checkInput character
        check(ch1);
       
        sc.close();
    }
}
