package hw2_1302;

public class EmployeeMain {
	public static void main(String args[] ) {
		Employee e = new Employee();
		Programmer p = new Programmer();
		SeniorProgrammer sp = new SeniorProgrammer();
		printEmployee(e,"Employee");
		System.out.println();
		printEmployee(p, "Programmer");
		System.out.println();
		printEmployee(sp, "Senior Programmer");
	}
	
	public static void printEmployee(Employee e, String a) {
		e.getSalary();
		e.getHours();
		e.getVacationDays();
		e.getVacationForm();
		System.out.println(a+" has the following: \nSalary: $"+e.getSalary()+"\nHours: "+e.getHours()+"\nVacation days: "+ e.getVacationDays()+"\nVacation form: "+e.getVacationForm());
		if(e instanceof Programmer||e instanceof SeniorProgrammer) {
			Programmer.code();
		}
	}
	
}
