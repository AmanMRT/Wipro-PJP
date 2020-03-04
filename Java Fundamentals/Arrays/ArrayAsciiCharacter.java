// Initialize an integer array with ascii values and 
//print the corresponding character values in a single row.
import java.util.Scanner;

public class ArrayAsciiCharacter 
{
	//Function to convert int to char
	static void asciiToChar(int[] arr)
	{
		char num;
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			num=(char)arr[i];      //typecast int to char
            System.out.print(num+" ");
		}
	}
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();       //no of elemnts in array
    	int[] array=new int[len];

        for(int i=0;i<len;i++)
        {
        	array[i]=sc.nextInt();
        }
        //Function declaration
        asciiToChar(array);
        sc.close();
	}
}
