/*package CompositePatternDemo;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates = new ArrayList<>();


    public void add(Employee emp) {
        subordinates.add(emp);

    }


    public void remove(Employee emp) {
        subordinates.remove(emp);


    }

    @Override
    public String toString() {
        String result = name + ":";

        for(Employee emp  : subordinates) {
            result += emp.getName() + ",";

        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}

*/