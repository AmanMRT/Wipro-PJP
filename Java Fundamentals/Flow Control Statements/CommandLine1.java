 //Write a program to check if the program has received command line arguments or not.

public class CommandLine1
{
	//Driver Function
	public static void main(String[] args)
    {
        int i;//initialize
        for( i=0;i<args.length;i++)
        {
        
        }   
        if( i>1)
        {
            for(String str: args)
            {
            System.out.print(str);
            System.out.print(",");
            
            }
        }//end if
        else
        {
            System.out.print("No Values");
        }
    }//end   
}
