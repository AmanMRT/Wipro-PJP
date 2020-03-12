// Write a program to print even numbers between 23 and 57. 
//Each number should be printed in a separate row.

public class EvenInRange 
{
	//Driver Function
		public static void main(String[] args)
	    {
			for (int i=23;i<=57;i++)
			{
				//even condition
				if((i % 2) == 0)
				System.out.println(i); 
			}
	    }	
}
