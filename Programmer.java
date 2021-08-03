package hw2_1302;

public class Programmer extends Employee{
	public double getSalary() {
		return super.getSalary() +30000.00; //$30,000 more than the $40,000 starting
	}
	
	public int getVacationDays() {
		return super.getVacationDays() -5; // 5 days less than the standard (10 days)
	}
	
	public String getVacationForm() {
		return "grey";
	}
	
	public static void code() {
		System.out.println("Coding!"); //action unique to programmer
	}
}
