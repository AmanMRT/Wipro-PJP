// Write a program to initialize an integer array and 
//find the maximum and minimum value of the array.
import java.util.Scanner;

public class Arraymaxmin 
{
	//function to find minimum element
	static void findmin(int[] arr)
	{
		int len=arr.length;
		int min=arr[0];//Assume minimum be the last element
		
		for(int i=0;i<len;i++)
		{
			if(min > arr[i])//if arr[i] is less than the min then update
			{
				min=arr[i];
			}
		}
		System.out.println(min);	
	}
	
	//function to find minimum element
	static void findmax(int[] arr)
	{
		int len=arr.length;
		int max=arr[0];//Assume maximum be the first element
		
		for(int i=0;i<len;i++)
		{
			if(max < arr[i])//if arr[i] is less than the min then update
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();//no of elemnts in array
    	int[] array=new int[len];

        for(int i=0;i<len;i++)
        {
        	array[i]=sc.nextInt();
        }
        
        findmin(array);
        
        findmax(array);
        sc.close();
	}
}
