// Write a program to initialize an array and 
//print them in a sorted order.

import java.util.Scanner;

public class ArraySort 
{	
	static void sort(int[] arr)
	{
		int len=arr.length;
        for(int i=1;i<len;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
	}
	 //sorted array print
    static void printarray(int arr[])
    {
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            //System.out.print("Sorted Array");
            System.out.print(arr[i]+" ");
        }
    }
    
    //Driver Function 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] array=new int[n];

        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();//input array from user
        }

        sort(array);
        printarray(array);
        sc.close();
    }
	
}
