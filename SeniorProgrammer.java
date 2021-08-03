package hw2_1302;

public class SeniorProgrammer extends Programmer{
	public double getSalary() {
		return super.getSalary()+super.getSalary()*.3; //30% more salary than programmer
	}
	
	public int getVacationDays() {
		return super.getVacationDays() +10; //vacation days: 10 
	}
	
	public String getVacationForm() {
		return "grey grey grey grey"; //four times the programmer forms
	}
}
