class Position {
    private String title;
    private double salary;

    public Position(String title, double salary){
        this.title = title;
        this.salary = salary;
    }

    public String toString(){
        return title + " , $" + salary;
    }
}

class Employee {
    private String name;
    private Position pos;

    public Employee(String name, Position pos){
        this.name = name;
        this.pos = pos;
    }

    public void showInfo(){
        System.out.println("Employee: " + name);
        System.out.println("Position: " + pos);
    }
}

class Company {
    private String compName;
    private Employee emps[];
    private int count = 0;

    public Company(String compName, int size){
        this.compName = compName;
        emps = new Employee[size];
    }

    public void addEmployee(Employee e){
        if(count < emps.length){
            emps[count] = e;
            count++;
        } else {
            System.out.println("No space....!! " + e);
        }
    }

    public void showEmployees(){
        System.out.println("Company: " + compName);
        for(int i=0; i<count; i++){
            emps[i].showInfo();
            System.out.println();
        }
    }
}

public class CompanyAssociation {
    public static void main(String[] args) {

        Company c = new Company("Google", 3);

        c.addEmployee(new Employee("Bruce", new Position("Manager", 85000)));
        c.addEmployee(new Employee("Wayne", new Position("Assistant", 60000)));
        c.addEmployee(new Employee("John", new Position("Cashier", 55000)));

        c.showEmployees();

        System.out.println();

        Employee x = new Employee("Doe", new Position("Intern", 15000));
        x.showInfo();
    }
}
