public class Employee {
    Employee(int id1, String surname1, int age1, double salary1, String department1)
    {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }
    public Employee(int id2)
    {
        this(id2, "anonim", 18, 100, "cleaner");
    }
    Employee(int id3, String surname3)
    {
        this(id3, surname3, 18, 100, "cleaner");
    }


    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public double getSalary() {
        return salary;
    }
    public double show_salary() {
        return (salary);
    }
    public String show_surname() {
        return (surname);
    }
    public int show_id() {
        return (id);
    }

    void double_salary(){
        salary *=2;

    }

}
class Employee_test{
    public static void main(String[] args) {


    Employee Rab1 = new Employee (123, "Petrov", 25, 1500.5, "Teacher");
    Employee Rab2 = new Employee (124, "Ivanov", 50, 5000, "Director");
    Employee Rab3 = new Employee(125);
    Employee Rab4 = new Employee(126, "Vasil");



    Rab1.double_salary();
    Rab2.double_salary();

    System.out.println(Rab1.surname + " Зарплата: " + Rab1.getSalary());
    System.out.println(Rab2.surname + " Зарплата: " + Rab2.getSalary());

    System.out.println(Rab1.show_id()+" "+Rab1.show_surname()+" "+Rab1.show_salary());
    System.out.println(Rab2.show_id()+" "+Rab2.show_surname()+" "+Rab2.show_salary());
    System.out.println(Rab3.show_id()+" "+Rab3.show_surname()+" "+Rab3.show_salary());
    System.out.println(Rab4.show_id()+" "+Rab4.show_surname()+" "+Rab4.show_salary());


    }
}
