package BusResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;       //getandset method
	
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getbusNo() {
		return busNo;
	}
	public boolean isAc() {
		return ac;
	}
	public int getCapacity() {
		return capacity;
		
		
	}
	public void setAc(boolean val) {
		ac=val;
		
		
	}
	public void setCapacity(int cap) {
		capacity=cap;
		
		
	}
	
		
	}
	


