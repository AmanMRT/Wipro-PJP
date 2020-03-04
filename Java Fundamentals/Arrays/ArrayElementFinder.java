// Write a program to initialize an integer array with values 
//and check if a given number is present in the array or not.
import java.util.Scanner;

public class ArrayElementFinder
{
	//function to find element if present in an array
		static void findelement(int[] arr, int num)
		{
			int len=arr.length;
			int i, count=0;
			
			for(i=0;i<len;i++)
			{
				if(arr[i] == num)//if arr[i] is present int the array then return index else -1;
				{
					 count++;
					 break;
				}
			}
			if(count>=1)
			{
				System.out.println(i);	
			}
			else
			{
				System.out.println("-1");	
			}
		}
	//Driver Function
		public static void main(String[] args)
		{
	        Scanner sc=new Scanner(System.in);
	        int len=sc.nextInt();//no of elemnts in array
	        int element=sc.nextInt();
	    	int[] array=new int[len];

	        for(int i=0;i<len;i++)
	        {
	        	array[i]=sc.nextInt();
	        }
	        
	        findelement(array,element);
	        
	        sc.close();
		}
}
