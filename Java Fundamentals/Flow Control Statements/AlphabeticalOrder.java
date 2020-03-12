// Initialize two character variables in a program and 
//display the characters in alphabetical order.

import java.util.Scanner;

public class AlphabeticalOrder {
	static void order(char character1,char character2)
    {
        int number1=character1;
        int number2=character2;
        if(number1<number2)
        {
            System.out.println(character1 +" , "+ character2);
        }
        else
        {
            System.out.println(character2 +" , "+ character1);
        }
    }
	//Driver Function
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch1 = sc.next().charAt(0); 
        char ch2 = sc.next().charAt(0); 
        //function called
        order(ch1,ch2);

        sc.close();
    }
}
