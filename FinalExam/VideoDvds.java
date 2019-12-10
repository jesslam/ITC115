package finalExam;

public class VideoDvds extends Library {

	public VideoDvds() {
		// TODO Auto-generated constructor stub
	}
	public int getItemNumber() {
		return 9797461;
	}
	
	public String getTitle() {
		return "Life in Motion";
	}
	
	public boolean isReserved() {
		return true;
	}
	
	public boolean isCheckedIn() {
		return false;
	}
	
	public String getDueDate() {
		return "11/30/19";
	}
	
	public int getDaysLate() {
		return 10;
	}

}
