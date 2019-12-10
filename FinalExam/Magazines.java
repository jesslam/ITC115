package finalExam;

public class Magazines extends Library{
	
	public Magazines() {
		
	}
	
	public int getItemNumber() {
		return 15649471;
	}
	
	public String getTitle() {
		return "Mad Magazine";
	}
	
	public boolean isReserved() {
		return true;
	}
	
	public boolean isCheckedIn() {
		return false;
	}
	
	public String getDueDate() {
		return "01/05/20";
	}
	
	public int getDaysLate() {
		return 0;
	}

}
