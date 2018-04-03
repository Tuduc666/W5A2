package W5A2;

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager Peter = new Manager(126534,"Peter","Chennai India",237844,65000);
		System.out.println(Peter.employeeName + " salary is " + Peter.calculateSalary());
		System.out.println(Peter.employeeName + " salary + transport allowance  is " + Peter.calculateTransportAllowance());
		
		Trainee Jack = new Trainee(29846,"Jack","Mumbai India", 442085,45000);
		System.out.println(Jack.employeeName + " salary is " + Jack.calculateSalary());
		System.out.println(Jack.employeeName + " salary + transport allowance  is " + Jack.calculateTransportAllowance());
	}
}
