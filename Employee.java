package W5A2;

public class Employee {
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected double specialAllowance;
	protected double Hra;
	
	// constructor
	public Employee(long Id, String Name, String Address, long Phone, 
			          double Salary, double Allowance, double Hra) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
		this.basicSalary = Salary;
		this.specialAllowance = Allowance;
		this.Hra = Hra;		
	}
	
	// overloading the constructor
	public Employee(long Id, String Name, String Address, long Phone) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;	
		
		this.specialAllowance = 250.80;
		this.Hra = 1000.50;
	}
	
	// overloading the constructor
	public Employee(long Id, String Name, String Address, long Phone, double Salary) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;	
		this.basicSalary = Salary;
		
		this.specialAllowance = 250.80;
		this.Hra = 1000.50;
	}
	
	// method to calculate salary
	public double calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
		return salary;
	}

	// method to calculate include transport allowance in the salary
	public double calculateTransportAllowance() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
		salary = salary + .1 * basicSalary;    // transportAllowance = 10/100*basicSalary.
		return salary;
	}
	
	public static void main(String[] args) {
		Employee tam = new Employee(1001,"Tam Uduc","6624 Broadway",9999999,100,100,10);
		System.out.println("Tam salary is " + tam.calculateSalary());
	}
}
