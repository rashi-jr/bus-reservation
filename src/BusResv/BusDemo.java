package BusResv;





import java.util.Scanner;


public class BusDemo {
	public static void main(String[]args ) {
		 BusDAO busdao= new BusDAO();
		 try {
		
			busdao.displayBusInfo();
	
		

		
		int userOpt=1;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		while(userOpt==1) {
			System.out.println("Enter 1 to book and 2 to Exit");
		    userOpt = scanner.nextInt();
		    
		    if(userOpt==1) {
		    	 Booking booking =new Booking();	
				    
						if(booking.isAvailable()) {
							BookingDAO bookingdao =new BookingDAO();
							bookingdao.addBooking(booking);
							System.out.println("booking is confirmed");
						}
						else
							System.out.println("sorry bus is full try another bus or date ");
					
		    }
		    else
		    	System.out.println("thanks for booking");
		    
		    
		   
			
					
					
		   
				}
		scanner.close();
		 }
		 catch(Exception e) {
			    System.out.println("server busy");
			
			
			}
		}
}

				
		
			
			
			
			
			
		
	




