package twowheeler;
import com.automobile.Vehicle;

class Hero extends com.automobile.Vehicle
{
	int speed ;
	String model, regno, ownername;
	
	// provides speed oof the twowheeler
	public int getSpeed() 
	{
		speed = 40;
		return speed;
	}
	
	// provides extra facility it provides
	public void radio() 
	{
		System.out.println("Provides facility to control the radio device.");
	}

	// provides model name
	public String getModelName() 
	{
		model = "Hero";
		return model;
	}

	// provides registation number of the vehicle
	public String getRegistrationNumber() 
	{
		regno = "UP15 AY XXXX ";
		return regno;
	}

	// provides owner name of the vehicle
	public String getOwnerName() 
	{
		ownername = "ABC";
		return ownername;
	}
}


class Honda extends com.automobile.Vehicle
{
	int speed ;
	String model, regno, ownername;
	
	// provides speed oof the twowheeler
	public int getSpeed() 
	{
		speed = 100;
		return speed;
	}
	
	// provides extra facility it provides
	public void radio() 
	{
		System.out.println("Provides facility to control the cd player device which is available in the car..");
	}

	// provides model name
	public String getModelName() 
	{
		model = "Honda";
		return model;
	}

	// provides registation number of the vehicle
	public String getRegistrationNumber() 
	{
		regno = "UP15 DD XXXX ";
		return regno;
	}

	// provides owner name of the vehicle
	public String getOwnerName() 
	{
		ownername = "XYZ";
		return ownername;
	}
}

public class test 
{
	// Driver Function
	public static void main(String[] args) 
	{
		Hero hero = new Hero();
		Honda honda = new Honda();
		
		//Hero vehicle details
		System.out.println("Hero model details");
		System.out.println("Model : " + hero.getModelName());
		System.out.println("Max Speed : " + hero.getSpeed());
		System.out.println("Registration Number " + hero.getRegistrationNumber());
		System.out.println("Owner : "  + hero.getOwnerName());
		
		System.out.println();
		
		//Honda Vehicle details
		System.out.println("Honda model details");
		System.out.println("Model : " + honda.getModelName());
		System.out.println("Max Speed : " + honda.getSpeed());
		System.out.println("Registration Number : " + honda.getRegistrationNumber());
		System.out.println("Owner : " + honda.getOwnerName());
		
	}
}
