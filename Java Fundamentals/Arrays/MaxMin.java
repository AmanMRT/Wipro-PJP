// Write a program to find the largest 2 numbers and
// the smallest 2 numbers in the given array.

import java.util.Scanner;
public class MaxMin
{
    static void findmax(int arr[])
    {
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            int max= arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(max < arr[j])
                {
                    max=arr[j];
                    k=j;
                }
            }
            int temp=max;
            max=arr[i];
            arr[i]=temp;
            arr[k]=max;
        }
        System.out.println();
        for(int i=0;i<2;i++)
        {
           System.out.println(arr[i]+" ");
        } 
    }
    static void findmin(int arr[])
    {
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            int min= arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(min > arr[j])
                {
                    min=arr[j];
                    k=j;
                }
            }
            int temp=min;
            min=arr[i];
            arr[i]=temp;
            arr[k]=min;
        }
        System.out.println();
        for(int i=0;i<2;i++)
        {
           System.out.println(arr[i]+" ");
        } 
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int len= sc.nextInt();
        int array[]= new int[len];
        int brray[]= new int[len];

        for(int i=0;i<len;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++)
        {
            brray[i]=array[i];
        }
        findmax(array);
        findmin(brray);
        sc.close();
    }
}