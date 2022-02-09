package staff;

public abstract class Employee {
    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public boolean raiseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
            return true;
        }
        return false;
    }

    public double payBonus() {
        return this.salary * 1 / 100;
    }
}
