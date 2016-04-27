public class EmployeeClass {
	private String name;
	private double payRate;
	private int EMPLOYEE_ID;
	private static int nextID = 999;
	private static double STARTING_PAY_RATE = 7.75;

	public EmployeeClass(String name) {
		this.name = name;
		this.payRate = STARTING_PAY_RATE = 7.75;
		EMPLOYEE_ID = getNextID();
	}
	


	public EmployeeClass(String name, double startingPay) {
		this.name = name;
		this.payRate = startingPay;
		EMPLOYEE_ID = getNextID();
	}

	public String getName() {
		return name;
	}

	public int getEmployeeClassID() {
		return EMPLOYEE_ID;
	}

	public double getPayRate() {
		return payRate;
	}

	public void changeName(String newName) {
		name = newName;
	}

	public void changePayRate(double newRate) {
		payRate = newRate;
	}

	private int getNextID() {
		nextID++;
		return nextID;
	}

}