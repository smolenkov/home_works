import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class TestEmployee{
    void printEmployee(Employee emp) {
        System.out.println("Employee{" +
                "name='" + emp.name + '\'' +
                ", department='" + emp.department + '\'' +
                ", salary=" + emp.salary +
                "}");
    }

    void filtering(Predicate<Employee> pr, ArrayList<Employee> emp) {
        for (Employee e : emp) {
            if (pr.test(e)) printEmployee(e);
        }
    }


    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee("Alexander", "IT", 10000);
        Employee emp2 = new Employee("Dmitry", "IT", 5000);
        Employee emp3 = new Employee("Vova", "Staff", 3000);
        Employee emp4 = new Employee("Kolya", "Dir", 9000);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        TestEmployee tmp = new TestEmployee();
        tmp.filtering(x -> x.department.equals("IT") &&  x.salary >=5000, employees);
    }


}


