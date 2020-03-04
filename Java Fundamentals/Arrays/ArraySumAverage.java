// Write a program to initialize an integer array and 
//print the sum and average of the array.
import java.util.Scanner;

public class ArraySumAverage 
{
	static void sumaverage(int[] arr)
	{
		int len=arr.length;
		double avg=0.0;
		int sum=0;
		
		for(int i=0;i<len;i++)
		{
			sum=sum+arr[i];
		}
		avg=sum/len;
		System.out.print(sum);
		System.out.println(avg);
			
	}
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
    	int[] array=new int[len];

        for(int i=0;i<len;i++)
        {
        	array[i]=sc.nextInt();
        }
        sumaverage(array);
        sc.close();
	}

	
}
