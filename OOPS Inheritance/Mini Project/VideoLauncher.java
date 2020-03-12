import java.util.Scanner;

// Mini_Project_02 
// Video Rental Inventory System

// Parent class Video
class Video
{
	//Member Variables
	private String videoName;
	private boolean checkout;
	private int rating;
	
	// set video name as user input 
	public Video(String name) 
	{
		videoName = name;
	}
	
	// return video name
	 String getName()
	{
		return videoName;
	}
	
	 // video checkout status 
	void doCheckOut()
	{
		checkout = true;
	}
	
	// video return status
	void doReturn()
	{
		checkout = false;
	}
	
	// receive rating entered by user input
	void receiveRating(int rating)
	{
		this.rating = rating;
	}
	
	// return rating
	int getRating()
	{
		return rating;
	}
	
	// checkout status of the video
	boolean getCheckOut()
	{
		return checkout;
	}
}

// VideoStore class 
class VideoStore 
{
	// Member variable
	 private Video[] store;	
	
	 // to add video into video type store array
	void addVideo(String name)
	{
		Video video = new Video(name);		// converting String object to custom datatype(video here used)
		int storeSize;
		
		// to avoid null pointer exception
		try {
			storeSize = store.length;
		} catch (Exception e) {
			storeSize = 0;
		}
		
		// to add video name to be added into store array
		Video[] videoarr = new Video[storeSize + 1];
		videoarr[storeSize] = video;
		store = videoarr;
		
	}
	// checkout function for video status
	void doCheckout(String name)
	{
		if((store == null) || (store.length == 0))
		{
			System.out.println("No Video Available.");
			return;
		}
		
		// enhanced for loop
		for(Video video : store)
		{
			// check whether entered name is equals to the name in array store
			if(video.getName().equals(name))
			{
				video.doCheckOut();
			}
		}
	}
	
	// return video after checkout
	void doReturn(String name)
	{
		if((store == null) || (store.length == 0))
		{
			System.out.println("No Video Available for return.");
			return;
		}
		
		// enhanced for loop
		for(Video video : store)
		{
			// check whether entered name is equals to the name in array store
			if(video.getName().equals(name))
			{
				video.doReturn();
			}
		}	
	}
	
	// rating received by the user is shown here
	void receiveRating(String name, int rating)
	{
		if((store == null) || (store.length == 0))
		{
			System.out.println("No Video Available to receive rating.");
			return;
		}
		// enhanced for loop
		for(Video video : store)
		{
			// check whether entered name is equals to the name in array store
			if(video.getName().equals(name))
			{
				video.receiveRating(rating);
			}
		}	
	}
	
	// will show the video name present in store[] array 
	void listInventory()
	{
		if((store == null) || (store.length == 0))
		{
			System.out.println("No Video Available in store.");
			return;
		}

		for(int i=0;i<40;i++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.println("\t" + "Name  |" + "\t" + "Rating  |" + "\t" + "CheckOut  |");
		
		for(Video video : store)
		{
			System.out.print("\t" + video.getName() + "  |  " + video.getRating() + " \t|"  +"\t" + video.getCheckOut() + "	|");
		}
		
		System.out.println();
		for(int i=0;i<40;i++)
		{
			System.out.print("-");
		}
		System.out.println();

	}
	
}

// Driver Code
public class VideoLauncher 
{

	//Driver Function
	public static void main(String[] args)
	{
		int ch = 0;
        Scanner sc = new Scanner(System.in);
        VideoStore vs = new VideoStore();
        
    	do 
        {
    		System.out.println();
            System.out.println("MAIN MENU");
        	System.out.println("=========");
        	System.out.println("1. Add Videos :");
        	System.out.println("2. Check Out Video :");
        	System.out.println("3. Return Video :");
        	System.out.println("4. Receive Rating :");
        	System.out.println("5. List Inventory :");
        	System.out.println("6. Exit :");
        	System.out.println("Enter Your Choice... (1...6) :");
        	System.out.println();
			ch = sc.hasNextInt() ? sc.nextInt() : 6;

        	switch(ch)
        	{
        		// To add video
        		case 1:
	        	{
		        	System.out.println("Enter the name of the video you want to add :");
		            sc.nextLine();		//newline
		        	String str = sc.nextLine();		//input video name
		        	
		        	// Function Declaration
		        	vs.addVideo(str);
		    		System.out.println("Video '" + str + "' has added sucessfully.");
		    		break;
	        	}
	        	
	        	// to checkout for the entered video
        		case 2:
	        	{
	        		System.out.println("Enter the name of the video you want to checkout :");
	        		sc.nextLine();		//newline
		        	String str = sc.nextLine();		//input video name
		        	
		        	// Function Declaration
		        	vs.doCheckout(str);
		    		System.out.println("Video '" + str + "'check out sucessfully.");
		    		break;
	        	}
	        	
	        	// To return the checkout video
        		case 3:
	        	{
		        	System.out.println("Enter the name of the video you want to return :");
		        	sc.nextLine();		//newline
		        	String str = sc.nextLine();		//input video name
		        	
		        	// Function Declaration
		        	vs.doReturn(str);
		    		System.out.println("Video '" + str + "' returned sucessfully.");
		    		break;
	        	}
	        	
	        	// to enter the video rating
        		case 4:
	        	{
	        		System.out.println("Enter the name of the video you want to rate :");
	        		sc.nextLine();		//newline
		        	String str = sc.nextLine();		//input video name
		        	
		        	System.out.println("Enter the rating for this video: ");
					int rating = sc.nextInt();
					
					// Function Declaration
		        	vs.receiveRating(str, rating);
		        	
					System.out.println("Rating " + rating + " has been mapped to the Video " + str + ".");
		    		break;
	        	}
	        	
	        	// to display the data of the store array
	        	case 5:
	        	{
	        		// Function Declaration
		        	vs.listInventory();
		    		break;
	        	}
	        	
	        	// exiting the applcation
	        	default:
	        	{
					System.out.println("Exit.");
					break;
	        	}
        	}
        	
         }while(ch!=6);
	
    	sc.close();
	}
	
}
