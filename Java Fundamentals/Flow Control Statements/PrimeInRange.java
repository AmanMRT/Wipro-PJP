
// Write a program to print prime numbers between 10 and 99.

public class PrimeInRange
{
	//Driver Function
	public static void main(String[] args)
    {
        
        int j,flag=0;
		for (int i=10;i<=99;i++)
		{	
			for ( j=2;j<=i/2;j++)
			{
				//prime condition
				if((i % j) == 0)
				{
					flag++;
					break;
				}
			}
			if(flag==0 && i!=10)
			{
				System.out.println(i+" "); 
			}
		}	
	}	
  		
}
