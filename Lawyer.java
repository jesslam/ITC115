//*******************************************************************

//  The class or method name: Lawyer
//
// Description of the class or method purpose:
// This method inherits Employee superclass and modifies certain methods
// to reflect subclass Lawyer.
//By: Jessica Lam 
//Date: 12/9/19
//*******************************************************************
package Assignment11;

public class Lawyer extends Employee{
	
	public Lawyer() {
		//Lawyer L = new Lawyer();
		
		
		
	}
	
	public String getVacationForm() {
		super.formColor = "pink";
		return formColor;
	}
	
	public int getVacationDays() {
		int LawvacationDays = super.vacationDays;
		LawvacationDays = LawvacationDays + 5;
		return LawvacationDays;
		
	}
	
	public double getSalary() {
		double lawSalary = super.getSalary();
		lawSalary += 20000.00;
		
		return lawSalary;
	}
	
	public String sue() {
		return("I'll see you in court!");
		
	}
	
	public String toString() {
		return "An attorney's vacation form is color: " + getVacationForm() + 
				"\nAn attorney is eligible for " + getVacationDays() + " days of vacation" +
				"\nAn attorney's base salary is: " + formattedSalary() +
				"\nAn attorney says: " + sue();
	}

}
