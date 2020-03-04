//Write a program to reverse the elements of a given 2*2 array.
//Four integer numbers needs to be passed as Command Line arguments.

public class ArrayMatrixReverse 
{
	public static void reverse(int[][] arr)
	{
			int n = arr.length;	//For square matrixes only
		    int brr[][]=new int[n][n];
		    
		    for(int i = n-1; i >= 0; i--) 
		    {
		        for(int j = n-1; j >= 0; j--)
		        {
		        	//Main Condition
		            brr[n-1-i][n-1-j] = arr[i][j];
		        }
		    }
		  
		    //Reversed Matrix
	        System.out.println("The Reversed Array is:");
		    for(int i = 0; i < n; i++) 
		    {
		        for(int j = 0; j < n; j++) 
		        {
		            System.out.print(brr[i][j]+" ");
		        }
		        System.out.println();
		     }
		}
	//Driver Function
	public static void main(String[] args)
    {
        int[][] array= new int[2][2]; //Fixed Size array
        
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                array[i][j] = Integer.parseInt(args[3*i+j]);	
            }
        }
        
        //Matrix Printing
        System.out.println("The Given Array is:  ");
        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<2;j++)
        	{
                System.out.print(array[i][j]+" ");
        	}
            System.out.println();
        }
        
        System.out.println();		//new line
        	
       reverse(array);		//Function to reverse matrix
        
       
       
    }   
}
