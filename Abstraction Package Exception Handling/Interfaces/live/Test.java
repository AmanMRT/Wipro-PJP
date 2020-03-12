package live;
// importing packages
import music.string.*;
import music.wind.*;

//Driver class
public class Test 
{
	// Driver Function
	public static void main(String[] args) 
	{
		//here v, s are objects created for Veena and Saxophone resp.
		Veena v = new Veena();
		Saxophone s = new Saxophone();
		
		// play() called from different packages
		v.play();
		s.play();
	}
}
