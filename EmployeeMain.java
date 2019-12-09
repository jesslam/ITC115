//*******************************************************************

//  The class or method name: EmployeeMain
//
// Description of the class or method purpose:
// This method is the client side call to Employee and subclasses.
//By: Jessica Lam 
//Date: 12/9/19
//*******************************************************************
package Assignment11;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee[] employees = {new Janitor(), new Lawyer(), new HarvardLawyer()};
//		for (Employee e: employees) {
//			System.out.println(e.getVacationForm());
//			System.out.println(e.formattedSalary());
//			System.out.println(e.getVacationDays());
//			System.out.println();
//		}
		
		Lawyer lawyer1 = new Lawyer();
		System.out.print(lawyer1);
		
		System.out.println();
		System.out.println();
		
		Employee emp1 = new Employee();
		System.out.print(emp1);
		
		System.out.println();
		System.out.println();
		
		Janitor janitor1 = new Janitor();
		System.out.print(janitor1);
		
		System.out.println();
		System.out.println();
		
		HarvardLawyer hlaw1 = new HarvardLawyer();
		System.out.print(hlaw1);


	}

}
