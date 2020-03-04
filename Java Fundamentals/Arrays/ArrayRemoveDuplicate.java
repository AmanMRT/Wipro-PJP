// Write a program to remove the duplicate elements in an array and print the same.

import java.util.Scanner;

public class ArrayRemoveDuplicate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int[] arr=new int[n];
        int len=arr.length;
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;)
            {
                if(arr[j]==arr[i])
                {
                    for(int k=j;k<len-1;k++)
                    {
                        arr[k]=arr[k+1];
                    }
                    len--;
                }
                else
                {
                    j++;
                }
            }
        }
        System.out.println();

        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
     
        }
        sc.close();
    }
}
