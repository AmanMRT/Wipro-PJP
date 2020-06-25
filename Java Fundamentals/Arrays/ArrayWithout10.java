import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithout10 {

	public static void main(String[] args)
	{
		int[] arr = {1, 10 , 20, 10, 5};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 10)
			{
				al2.add(0);
			}
			else
			{
				al.add(arr[i]);
			}
		}	
		al.addAll(al2);
		System.out.println(al);
	}
	

}
