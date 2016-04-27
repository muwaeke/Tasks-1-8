
public class Main {

	public static void main(String[] args) {
		EmployeeClass e1 = new EmployeeClass("John");
        EmployeeClass e2 = new EmployeeClass("Jill", 8.50);
        EmployeeClass e3 = new EmployeeClass("Jane");
        e1.changeName("Joe");
        e3.changePayRate(10);
                        
        printEmployee(e1);
        printEmployee(e2);
        printEmployee(e3);
}
public static void printEmployee(EmployeeClass emp) {
        System.out.println(
                "Name: " + emp.getName() +
                "\tID: " + emp.getEmployeeClassID() +
                "\tPayrate: " + emp.getPayRate()
        );
}
	


}
