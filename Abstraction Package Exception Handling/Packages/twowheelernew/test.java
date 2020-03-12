package twowheelernew;

import com.automobile.Vehicle;

//Logan class
class Logan extends com.automobile.Vehicle
{
	int speed ;
	String model, regno, ownername;
	
	// provides speed oof the twowheeler
	public int getSpeed() 
	{
		speed = 150;
		return speed;
	}
	
	// provides extra facility it provides
	public void radio() 
	{
		System.out.println("Provides facility to control the gps device .");
	}

	// provides model name
	public String getModelName() 
	{
		model = "Logan";
		return model;
	}

	// provides registation number of the vehicle
	public String getRegistrationNumber() 
	{
		regno = "MP34 AY XXXX ";
		return regno;
	}

	// provides owner name of the vehicle
	public String getOwnerName() 
	{
		ownername = "PQR";
		return ownername;
	}
}

//Ford Class
class Ford extends com.automobile.Vehicle
{
	int speed ;
	String model, regno, ownername;
	
	// provides speed oof the twowheeler
	public int getSpeed() 
	{
		speed = 120;
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
		model = "Ford";
		return model;
	}

	// provides registation number of the vehicle
	public String getRegistrationNumber() 
	{
		regno = "KL43 AY XXXX ";
		return regno;
	}

	// provides owner name of the vehicle
	public String getOwnerName() 
	{
		ownername = "MNO";
		return ownername;
	}
}

//Hero class
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

//Honda Class
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

//Driver Class
public class test 
{
	// Driver Function
	public static void main(String[] args) 
	{
		Logan logan = new Logan();
		Ford ford = new Ford();
		Hero hero = new Hero();
		Honda honda = new Honda();
		
		System.out.println();

		//Logan vehicle details
		System.out.println("Logan model details");
		System.out.println("Model : " + logan.getModelName());
		System.out.println("Max Speed : " + logan.getSpeed());
		System.out.println("Registration Number " + logan.getRegistrationNumber());
		System.out.println("Owner : "  + logan.getOwnerName());
		
		System.out.println();

		//Ford vehicle details
		System.out.println("Ford model details");
		System.out.println("Model : " + ford.getModelName());
		System.out.println("Max Speed : " + ford.getSpeed());
		System.out.println("Registration Number " + ford.getRegistrationNumber());
		System.out.println("Owner : "  + ford.getOwnerName());
				
		System.out.println();

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

