package ISP;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 5000.0);
        Manager manager = new Manager("Jane Smith", 8000.0);

        // Using Employee's behaviors
        double employeeSalary = employee.calculateSalary();
        System.out.println("Employee Salary: " + employeeSalary);

        employee.requestTimeOff(3);
        employee.attendMeeting("123456");

        // Using Manager's behaviors
        double managerSalary = manager.calculateSalary();
        System.out.println("Manager Salary: " + managerSalary);

        manager.requestTimeOff(5);
    }
}
