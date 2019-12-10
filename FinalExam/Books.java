package finalExam;

public class Books extends Library{
	public Books() {
		
		
	}
	
	public int getItemNumber() {
		return 54858574;
	}
	
	public String getTitle() {
		return "Hello World";
	}
	
	public boolean isReserved() {
		return false;
	}
	
	public boolean isCheckedIn() {
		return true;
	}
	
	public String getDueDate() {
		return "12/25/19";
	}
	
	public int getDaysLate() {
		return 0;
	}
	

}
