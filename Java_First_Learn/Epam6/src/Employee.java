import java.math.BigDecimal;

public abstract class Employee {
    private final String name;
    private BigDecimal salary;
    private BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        if (name == null) throw new IllegalArgumentException("illegal name");
        if (salary.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException("salary must be >0");
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setBonusValue(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public abstract void setBonus(BigDecimal bonus);

    public BigDecimal getBonus() {
        return bonus;
    }

    public BigDecimal toPay() {
        if (bonus == null) throw new IllegalArgumentException("bonus can't be null");
        return (salary.add(bonus));
    }


}
/*
To create classes Employee, SalesPerson, Manager and Company with predefined functionality.

Low level requires:

To create basic class Employee and declare following content:
· Three closed fields – text field name (employee last name), money fields – salary and bonus
· Public property Name for reading employee’s last name
· Public property Salary for reading and recording salary field
· Constructor with parameters string name and money salary (last name and salary are set)
· Virtual method SetBonus that sets bonuses to salary, amount of which is delegated/conveyed as bonus
· Method ToPay that returns the value of summarized salary and bonus. ------------------------------
To create class SalesPerson as class Employee inheritor and declare within it:
· Closed integer field percent (percent of sales targets plan performance/execution)
· Constructor with parameters: name – employee last name, salary, percent – percent of plan performance,
first two of which are passed to basic class constructor
· Redefine virtual method of parent class SetBonus in the following way: if the sales person completed the plan more than 100%,
so his bonus is doubled (is multiplied by 2), and if more than 200% - bonus is tripled (is multiplied by 3)
To create class Manager as Employee class inheritor, and declare with it:
• Closed integer field quantity (number of clients, who were served by the manager during a month)
• Constructor with parameters string name – employee last name, salary and integer clientAmount – number of served clients,
first two of which are passed to basic class constructor.
• Redefine virtual method of parent class SetBonus in the following way: if the manager served over 100 clients,
his bonus is increased by 500, and if more than 150 clients – by 1000.

Для создания классов Employee, SalesPerson, Manager и Company с предопределенными функциями.

Низкий уровень требует:

Чтобы создать базовый класс Employee и объявить следующее содержимое:
· Три закрытых поля - имя текстового поля (фамилия сотрудника), денежные поля - зарплата и бонус
· Имя публичного свойства для чтения фамилии сотрудника
· Общественное имущество Заработная плата за чтение и запись поля зарплаты
· Конструктор со строкой параметров name и денежной зарплатой (задаются фамилия и зарплата)
· Виртуальный метод SetBonus, устанавливающий бонусы к заработной плате, размер которых делегируется / передается в качестве бонуса
· Метод ToPay, который возвращает значение суммарной зарплаты и бонуса.----------------------------
Чтобы создать класс SalesPerson как класс Employee
наследник и объявить в нем:
· Закрытое целочисленное поле в процентах (процент выполнения / выполнения плана продаж)
· Конструктор с параметрами: имя - фамилия сотрудника, зарплата, процент - процент выполнения плана,
первые два из которых передаются конструктору базового класса
· Переопределить виртуальный метод родительского класса SetBonus следующим образом: если продавец выполнил план более чем на 100%,
так его бонус удваивается (умножается на 2), а если больше 200% - бонус увеличивается втрое (умножается на 3)
Чтобы создать диспетчер классов в качестве наследника класса Employee и объявить с ним:
• Количество закрытых целочисленных полей (количество клиентов, обслуживаемых менеджером в течение месяца)
• Конструктор со строкой параметров name - фамилия сотрудника, зарплата и целое число clientAmount - количество обслуженных клиентов,
первые два из которых передаются конструктору базового класса.
• Переопределите виртуальный метод родительского класса SetBonus следующим образом: если менеджер обслуживает более 100 клиентов,
его бонус увеличивается на 500, а если клиентов больше 150 - на 1000.
 */
