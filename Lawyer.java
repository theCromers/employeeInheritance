package hw2_1302;

public class Lawyer extends Employee{
	public int getVacationDays() {
		return super.getVacationDays() +5; //5 days extra of vacation
	}
	
	public String getVacationForm() {
		return "pink"; //vacation form is pink
	}
	
	public void sue() {
		System.out.println("I'll see you in court!");  //unique to the lawyer
	}
}
