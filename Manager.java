package W5A2;

public class Manager extends Employee {
	public Manager(long Id, String Name, String Address, long Phone, double Salary) {
		super(Id, Name, Address, Phone, Salary);         // call the parent's constructor
	}
	
	// Overriding the parent method to calculate salary - transportAllowance = 15*basicSalary /100
	@Override                       
	public double calculateTransportAllowance() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
		salary = salary + .15 * basicSalary;    // transportAllowance = 15/100*basicSalary.
		return salary;
	}
	
}
