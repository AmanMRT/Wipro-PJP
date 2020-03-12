//Design a class that can be used by a health care professional 
//to keep track of a patient’s vital statistics.
import java.util.Scanner;

class BMICalculator
{
	public static void computeBMI(String patientName,  double height, double weight )
	{
		weight = weight/1000; 	//weight in kgs
		height = height/100;	//height in meters
		
		// BMI formula
		double BMI= (weight / (height * height));
		
		System.out.println(BMI);
	}
}
public class Patient
{
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        
        //Member Variables
        String pName = sc.nextLine();
        double hei = sc.nextInt();
        double weigh = sc.nextInt();
        
		//  Initialization
		BMICalculator.computeBMI(pName, hei, weigh);
		
		sc.close();
	}
}
