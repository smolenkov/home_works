import java.math.BigDecimal;

public class Company {
    private Employee[] employees;

    public Company(Employee... employees) {
        if (employees == null) throw new IllegalArgumentException("array employees is empty");
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("bonus can not be null or negative");
        for (Employee person : employees) {
            if (person == null) {
                throw new IllegalArgumentException("member in array is null");
            } else person.setBonus(bonus);
        }
    }

    public BigDecimal totalToPay() {
        BigDecimal TotalSum = BigDecimal.ZERO;
        for (Employee person : employees) {
            TotalSum = TotalSum.add(person.toPay());
        }
        return TotalSum;
    }

    public String nameMaxSalary() {
        if (employees == null) throw new IllegalArgumentException("array employees is empty");
        if (employees.length == 0) return null;
        BigDecimal MaxSalary = employees[0].toPay();
        String nameOfMaxSalary = employees[0].getName();
        for (Employee person : employees) {
            if (person.toPay().compareTo(MaxSalary) > 0) {
                MaxSalary = person.toPay();
                nameOfMaxSalary = person.getName();
            }
        }
        if (nameOfMaxSalary == null) throw new IllegalArgumentException("THERE_ARE_NO_EMPLOYEES_IN_A_COMPANY");
        return nameOfMaxSalary;
    }
}
/*
To fully complete Low level tasks.
Create class Company and declare within it:
Closed field employees (staff)  an array of Employee type.
Constructor that receives employee array of Employee type with arbitrary length
Method giveEverybodyBonus with money parameter companyBonus that sets the amount of basic bonus for each employee.
Method totalToPay that returns total amount of salary of all employees including awarded bonus
Method nameMaxSalary that returns employee last name, who received maximum salary including bonus.

Создайте класс Company и объявите в нем:
Closed field staff (staff) массив типа Employee.
Конструктор, который принимает массив сотрудников типа Employee произвольной длины.
Метод giveEverybodyBonus с параметром money companyBonus, который устанавливает размер базового бонуса для каждого сотрудника.
Метод totalToPay, который возвращает общую сумму заработной платы всех сотрудников, включая начисленный бонус.
Метод nameMaxSalary, который возвращает фамилию сотрудника, получившего максимальную зарплату с учетом бонуса.
 */
