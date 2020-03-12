package testpackage;

class Foundationnew 
{
	private int var1 = 10;
			int var2 = 10;
	protected int var3 = 10;
	public int var4 = 10;

}

public class Foundation extends Foundationnew
{
	// Driver Function
	public static void main(String[] args) 
	{
		Foundationnew f = new Foundationnew();
		
		//var1 is private variable thus visible in same class only
		//System.out.println(f.var1);
		
		// var2 is default variable thus visible in same package only
		System.out.println(f.var2);
		
		// var3 is proctected variable thus visible in same package and subclass
		System.out.println(f.var3);
		
		// var4 is public thus visible availablle
		System.out.println(f.var4);
	}
}
