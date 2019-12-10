package finalExam;

import java.text.NumberFormat;

public abstract class Library {
	int itemNumber;
	String title;
	boolean reserved;
	boolean checkedIn;
	String dueDate;
	int daysLate;
	double finesAccrued;
	
	public Library() {
		
		
	}

	
	public int getItemNumber() {
		return itemNumber;
	}


	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isReserved() {
		return reserved;
	}


	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}


	public boolean isCheckedIn() {
		return checkedIn;
	}


	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}


	public String getDueDate() {
		return dueDate;
	}


	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public int getDaysLate() {
		return daysLate;
	}


	public void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
	}


	public double getFinesAccrued() {
		double fines = getDaysLate() * 0.50;
		return fines;
	}


	public void setFinesAccrued(double finesAccrued) {
		this.finesAccrued = finesAccrued;
	}
	
	public String formatFines() {
		String formatFines = NumberFormat.getCurrencyInstance().format(getFinesAccrued());
		return formatFines;
	}
	
	public String toString() {
		return("Item number: " + getItemNumber() + 
				" \nTitle: " + getTitle() +
				"\nReserved? " + isReserved() +
				"\nChecked In? " + isCheckedIn() +
				"\nDue Date: " + getDueDate() +
				"\nDays Late: " + getDaysLate() + 
				"\nFines Accrued: " + formatFines());
	}
	

}

