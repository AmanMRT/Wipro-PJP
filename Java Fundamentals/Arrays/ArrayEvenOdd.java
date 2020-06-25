import java.util.ArrayList;

public class ArrayEvenOdd 
{
	public static void main(String[] args)
	{
		int[] arr = {3,2,5,6,7,9,2,6,2,3,7,6,3,1,8,9,4,2};
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				al1.add(arr[i]);
			}
			else
			{
				al2.add(arr[i]);
			}
		}
		al1.addAll(al2);
		
		System.out.println(al1);
		
	}
}
