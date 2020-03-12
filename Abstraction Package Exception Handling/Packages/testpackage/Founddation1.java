package testpackage;
import testpackage.Foundation;

public class Founddation1 
{
		// Driver Function
		public static void main(String[] args) 
		{
			Foundation f = new Foundation();
			//var1 is private variable thus visible in same class only
			//System.out.println(f.var1);
			
			// var2 is default variable thus visible in same package only
			System.out.println(f.var2);
			
			// var3 is proctected variable thus visible in same package and subclass
			System.out.println(f.var3);
			
			// var4 is public thus visible availablle
			System.out.println(f.var4);		}
}
