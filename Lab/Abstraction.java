 abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    public void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Employee emp = new FullTimeEmployee("Shalix", 10000);
        emp.showDetails();
        System.out.println("Salary: " + emp.calculateSalary());
    }
}

