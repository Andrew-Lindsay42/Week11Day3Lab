package management;

import staff.Employee;

public class Manager extends Employee {

    String deptName;

    public Manager(String name, String NI, double salary, String deptName) {
        super(name, NI, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
