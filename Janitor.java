package Assignment11;

public class Janitor extends Employee {
	public Janitor () {
		
	}
	
	public int getHours(int hours) {
		hours = super.hours*2;
		return hours;
	}
	
	public double getSalary(double salary) {
		salary = super.salary - 10000;
		return salary;
	}
	
	public int getVacationDays() {
		vacationDays = super.vacationDays - 5;
		return vacationDays;
	}
	
	public String clean() {
		return("Workin' for the man.");
	}
	
	
	public String toString() {
		return ("A Janitor works " + getHours(hours) + " hours weekly.") +
				("\nA Janitor is eligible for " + getVacationDays() + " vacation days.") +
				("\nA Janitor's base salary is: " + formattedSalary()) +
				("\nA Janitor says: " + clean());
	}
	
}
