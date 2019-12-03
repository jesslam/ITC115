package Assignment10;
import java.text.NumberFormat;

public class Ticket {
	public int ticketNumber;
	public double price;
	//private String ticketType;
	
	public static int count;
	

	
public Ticket (int ticketNumber){
	this.ticketNumber = ticketNumber;
	this.price = price;
}



public int getTicketNumber() {
	return ticketNumber;
}



public void setTicketNumber(int ticketNumber) {
	this.ticketNumber = ticketNumber;
}


public double getPrice() {
	//Walk-up Tix
	if (ticketNumber == 1) {
		price = 50.00;
	//Adv Tix > 10 days before event
	} else if (ticketNumber == 2) {
		price = 40.00;
	//Adv Tix < 10 days before event	
	} else if (ticketNumber == 3){
		price = 30.00;
	//Student Adv Tix > 10 days before event
	} else if (ticketNumber == 4) {
		price = 20.00;
	//Student Adv Tix < 10 days before event
	} else if (ticketNumber == 5) {
		price = 15.00;
	} 
	return price;
}



public void setPrice(double price) {
	this.price = price;
}



//public String getTotalPrice(double price) {
//	String totalPrice = NumberFormat.getCurrencyInstance().format(price*count);
//	return totalPrice;
//}




public String toString() {
	return ("Number: " + ticketNumber +", Price: " + getPrice());
}


} 
