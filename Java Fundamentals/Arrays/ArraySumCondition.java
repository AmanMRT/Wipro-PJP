// Write a program to print the sum of the elements 
//of an array following the given below condition.
import java.util.Scanner;

public class ArraySumCondition 
{
	//Driver function
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j,k,sum=0;
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        //Code that satisfy condition
        for(int i=0;i<arr.length;i++)
        { 
            sum=sum+arr[i];
            if(arr[i+1]==6)
            {
                for(j=i+1;j<arr.length-1;j++)
                {   
                    if(arr[j+1]==7)
                    {
                        j=j+1;
                        break;
                    }
                }
                
                for( k=j+1;k<arr.length;k++)
                {
                    sum=sum+arr[k];
                    if(k==arr.length-1)
                    {
                        i=k;
                        break;
                    }
                } 
            }
            else
            {
                for( i=1;i<arr.length;i++)
                {
                    sum=sum+arr[i];
                }
            }
            if(i==arr.length-1)
            {
                break;
            }
        }
        System.out.print(sum+" ");
        
        sc.close();
    }
}
