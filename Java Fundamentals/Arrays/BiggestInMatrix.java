// Write a program to find the biggest number in a 3*3 array. 
//The program is supposed to receive 9 integer numbers as command line arguments.

public class BiggestInMatrix 
{	
	//Driver Function
	public static void main(String[] args)
    {
        int[][] arr= new int[3][3]; //Fixed Size Array
        int max =arr[0][0];			//Assumed to be maximum
        
        if(args.length==9)
        {
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=0;j<arr[i].length;j++)
	            {
	                arr[i][j] = Integer.parseInt(args[3*i+j]);
	            }
	        }
	       
	        for(int i=0;i<3;i++)
	        {
	        	for(int j=0;j<3;j++)
	        	{
	        		if(max < arr[i][j] )	//condition to find maximum element
	        		{
	        			max=arr[i][j];
	        		}
	        	}
	        }

	        System.out.println("The Given Array is: ");

	        for(int i=0;i<3;i++)
	        {
	        	for(int j=0;j<3;j++)
	        	{
	                System.out.print(arr[i][j]+" ");
	        	}
	            System.out.println();
	        }
	        
	        System.out.print("The biggest number in the given array is ");
	        System.out.print(max);
        }
        else
        {
            System.out.print("Please enter 9 Integer values");
        }
    }   

}
