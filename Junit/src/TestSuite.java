
import java.util.ArrayList;

public class TestSuite 
{
		//Demo.java
		public String stringConcat(String a,String b) 
		{
		String Concat=a+b;
		return Concat;
		}
		
		// Demo2.java
		public boolean palindromeCheck(String a)
		{
			String original="dad";  
			String reverse="";
		      int length = original.length();
		     
		      for (int i = length - 1; i >= 0; i--)
		         reverse = reverse + original.charAt(i);
		         
		      if (original.equals(reverse))
		        return true;
		      else
		         return false;
		}
		
		// Employee.java
		public String findName(ArrayList employees,String name)
		{
			  String result="";
			  if(employees.contains(name)){
			   result="FOUND";
			  }else{
			   result="NOT FOUND";
			  }
			  return result;
			 }
}