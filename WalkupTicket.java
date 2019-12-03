package Assignment10;

import java.text.NumberFormat;

public class WalkupTicket extends Ticket {
	//private double totalPrice;
	
	public WalkupTicket (int ticketNumber) {
		super(ticketNumber);
	}
	
	public int getTicketNumber(int ticketNumber) {
		return ticketNumber = 1;
	}
	

	
	public double getPrice() {
		return 50.00;
		
	}
	
	public String getTotalPrice(double price) {
		String totalPrice = NumberFormat.getCurrencyInstance().format(count*getPrice());
		return totalPrice;
	}
	
	public String toString() {
		return ("Number: " + ticketNumber + ", Price: " + getPrice());
	}
	



}
