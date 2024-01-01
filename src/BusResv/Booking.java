package BusResv;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;


public class Booking {
	String passengerName;
	int busNo;
	Date date;

	

        Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of pssenger");
		passengerName =scanner.next();
		System.out.println("Enter busno");
		busNo= scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateinput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateinput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	  public boolean isAvailable () throws SQLException{
		  BusDAO busdao= new BusDAO();
		  BookingDAO bookingdao=new BookingDAO();
		  int capacity =busdao.getCapacity(busNo);
		  
		  int booked=bookingdao.getbookedcount(busNo,date);
		
			  
		  
		 
		  return booked<capacity;
		  
		  
	    	
	    }
	  
	  
}
	  
		
		  
		  
		  
	    	
	    
	  
		
			
			 
		
	


	


