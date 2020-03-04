//Program to print TECHNOLOGIES between two strings
public class CommandLine 
{
	//Driver Function
    public static void main(String[] args)
    {
		for(int i=0;i<args.length-1;i++)
	    {
	        String str="Technologies";
	        System.out.println(args[i]+" "+ str +" "+args[i+1]); 
	    } //end for
    }//end main function	
}
