//*******************************************************************

//  The class or method name: Employee
//
// Description of the class or method purpose:
// This method establishes Employee as a superclass.
// 
//By: Jessica Lam 
//Date: 12/9/19
//*******************************************************************
package Assignment11;

import java.text.NumberFormat;

public class Employee {
	int hours = 40;
	double salary = 40000.00;
	int vacationDays = 10;
	String formColor = "yellow";
	

	public int getHours() {
		return hours;
	}

	public double getSalary() {
		return salary;
	}

	public String formattedSalary() {
		String formattedSalary = NumberFormat.getCurrencyInstance().format(getSalary());
		return formattedSalary;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public String getVacationForm() {
		return formColor;
	}
	
	public String toString() {
		return ("Employees typically work " + getHours() + " hours weekly.") +
				("\nEmployees are generally eligible for " + getVacationDays() + " vacation days.") +
				("\nAn example employee base salary is: " + formattedSalary()) +
				("\nThe standard vacation form is color: " + getVacationForm());
	}

}
