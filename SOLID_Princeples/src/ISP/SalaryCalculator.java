package ISP;
/*In this example, we have three interfaces: SalaryCalculator, TimeOffRequester, and MeetingAttendee. Each interface represents a specific responsibility or behavior.

The Employee class implements all three interfaces, as it needs to calculate salary, request time off, and attend meetings. It provides the necessary implementations for each interface's methods.

The Manager class, on the other hand, only implements the SalaryCalculator and TimeOffRequester interfaces. It doesn't implement the MeetingAttendee interface because managers might not need to attend meetings in this example.

By using interfaces, we adhere to the Interface Segregation Principle (ISP). Each interface represents a specific set of behaviors, and classes can choose to implement only the interfaces that are relevant to them. This avoids forcing classes to depend on unnecessary methods or behaviors they don't need.

By separating responsibilities into individual interfaces, we ensure that each class implements only the interfaces it requires. This promotes modularity, flexibility, and maintainability in the codebase.*/
interface SalaryCalculator {
    double calculateSalary();
}

interface TimeOffRequester {
    void requestTimeOff(int days);
}

interface MeetingAttendee {
    void attendMeeting(String meetingId);
}

class Employee implements SalaryCalculator, TimeOffRequester, MeetingAttendee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Implement methods from interfaces
    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public void requestTimeOff(int days) {
        System.out.println(name + " is requesting " + days + " days off.");
        // Logic for time off request
    }

    @Override
    public void attendMeeting(String meetingId) {
        System.out.println(name + " is attending meeting " + meetingId);
        // Logic for attending a meeting
    }
}

class Manager implements SalaryCalculator, TimeOffRequester {
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Implement methods from interfaces
    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public void requestTimeOff(int days) {
        System.out.println(name + " is requesting " + days + " days off.");
        // Logic for time off request
    }
}
