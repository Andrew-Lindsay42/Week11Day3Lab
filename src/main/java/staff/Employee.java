package staff;

public abstract class Employee {
    String name;
    String NI;
    double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
        this.salary += amount;
    }

    public double payBonus() {
        return this.salary * 1 / 100;
    }
}
