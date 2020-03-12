//rite a program to accept gender ("Male" or "Female")
//and age from command line arguments and 
//print the percentage of interest based on the given conditions.

public class MaleFemale
{
    public static void main(String[] args)
    {
        
        double intrest=0;
        for(int i=0;i<args.length;i++)
        {
             
        }    
        System.out.println(args[0]+" ");  
        System.out.println(args[1]+" ");  
        int num = Integer.parseInt(args[1]);
        
        if(args[0]=="Female" && ( ( num)>=1 &&  ( num)<=58))
        {           
            intrest=8.2;
            System.out.print(intrest);
        }
        else if(args[0]=="Female" && ( ( num)>=59 &&  ( num)<=100))
        {
            intrest=9.2;
            System.out.print(intrest);
        }
        else if(args[0]=="Male" && ( ( num)>=1 &&  ( num)<=58))
        {
            intrest=8.4;
            System.out.print(intrest);
        }
        else if(args[0]=="Male" && ( ( num)>=59 &&  ( num)<=100))
        {
            intrest=10.5;
            System.out.print(intrest);
        }
        else
        {
            System.out.print("Invalid Entry");
        }  
    }    
}