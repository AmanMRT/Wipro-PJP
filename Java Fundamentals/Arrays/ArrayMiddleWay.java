import java.util.ArrayList;

public class ArrayMiddleWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		int len1 = arr1.length / 2;
		int len2 = arr2.length / 2;
		
		al.add(arr1[len1]);
		al.add(arr2[len2]);
		System.out.println(al);

	}

}
