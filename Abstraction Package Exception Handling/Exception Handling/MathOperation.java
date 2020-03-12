//  Write a class MathOperation which accepts 5 integers through command line

public class MathOperation 
{
	public static void main(String[] args)
	{
		// array reference variable arr
		int[] arr = new int[args.length]; 
		double avg = 0.0;
		int sum = 0;
		try 
		{
			for(int i=0;i<args.length;i++)
			{
				String num = args[i];
				arr[i] = Integer.parseInt(num);
				sum = sum + arr[i];
			}	
				avg = sum / args.length;
				System.out.println(sum);
				System.out.println(avg);
			}// catch the exception 
		catch(ArithmeticException e)
		{
			// prints exception
			System.out.println(e);
		}
	}
}
