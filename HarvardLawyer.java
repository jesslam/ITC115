package Assignment11;

public class HarvardLawyer extends Lawyer {
	
	public HarvardLawyer() {
		//Lawyer H = new Lawyer();
		
		
	}
	
	public String getVacationForm() {
		String Hforms = super.getVacationForm();
//		for (int i = 0; i <= 3; i++) {
//			System.out.print(Hforms);	
//		}
		return Hforms + Hforms + Hforms + Hforms;	
	}
	
	public int getVacationDays() {
		int HLawvacationDays = super.getVacationDays() + 3;
		return HLawvacationDays;
	}
	
	public double getSalary() {
		double HLawSalary = super.getSalary()*1.20;
		return HLawSalary;
	}
	
	public String toString() {
		return "A Harvard Law attorney's vacation form is color: " + getVacationForm() +
				//getVacationForm() + getVacationForm() + getVacationForm() + getVacationForm() + 
				"\nA Harvard Law attorney is eligible for " + getVacationDays() + " days of vacation" +
				"\nA Harvard Law attorney's base salary is: " + formattedSalary() +
				"\nA Harvard Law attorney says: " + sue();
	}
}
