// Create a class called GeneralBank that acts as base class for all banks.

// Parent class
// Abstract class including only methods without body
abstract class GeneralBank
{
	// abstract methods  
	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
}

// Inherit Parent class
class ICICIBank extends GeneralBank
{

	// abstracted method body
	// Method overriding
	double getSavingsInterestRate()
	{
		double rate = 0.04;
		return rate;
	}
	
	// abstracted method body
	// Method overriding
	double getFixedDepositInterestRate()
	{
		double rate = 0.85;
		return rate;
	}
}

//Inherit Parent class
class KotMBank extends GeneralBank
{
	// abstracted method body
	// Method overriding
	double getSavingsInterestRate()
	{
		double rate = 0.06;
		return rate;
	}
	
	// abstracted method body
	// Method overriding
	double getFixedDepositInterestRate()
	{
		double rate = 0.09;
		return rate;
	}
}

// Driver class
public class Banking 
{
	// Driver Function
	public static void main(String[] args) 
	{
		// Following will create object with reference variables ib, kmb, gb1, gb2
		ICICIBank ib=new ICICIBank();
		KotMBank kmb=new KotMBank();
		
		GeneralBank gb1=new ICICIBank();
		GeneralBank gb2=new KotMBank();
		
		// Icici Bank details
		System.out.println(" ICICI Bank Interset Rates");
		System.out.println();
		
		System.out.println("Savings : "+ ib.getSavingsInterestRate());
		System.out.println("Fixed Deposit : " + ib.getFixedDepositInterestRate());
		
		System.out.println();
		
		// Kotak Mahindra Bank Details
		System.out.println(" Kotak Mahindra Bank Interset Rates");
		System.out.println();
		
		System.out.println("Savings : "+ kmb.getSavingsInterestRate());
		System.out.println("Fixed Deposit : " + kmb.getFixedDepositInterestRate());
		
		System.out.println();
		
		// Through Parent class object gb1 (ICICI)
		System.out.println("Savings : "+ gb1.getSavingsInterestRate());
		System.out.println("Fixed Deposit : " + gb1.getFixedDepositInterestRate());
		
		System.out.println();
		
		//Through Parent class object gb2 (Kotak Mahindra)
		System.out.println("Savings : "+ gb2.getSavingsInterestRate());
		System.out.println("Fixed Deposit : " + gb2.getFixedDepositInterestRate());
	}
}
