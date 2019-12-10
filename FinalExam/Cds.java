package finalExam;

public class Cds extends Library{

	public Cds() {
		// TODO Auto-generated constructor stub
	}
	public int getItemNumber() {
		return 8441577;
	}
	
	public String getTitle() {
		return "Monster Mash";
	}
	
	public boolean isReserved() {
		return false;
	}
	
	public boolean isCheckedIn() {
		return false;
	}
	
	public String getDueDate() {
		return "12/7/19";
	}
	
	public int getDaysLate() {
		return 2;
	}

}
