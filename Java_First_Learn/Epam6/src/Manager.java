import java.math.BigDecimal;

public class Manager extends Employee {
    private final int clientAmount;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        if (clientAmount < 0) throw new IllegalArgumentException("amount must be >=0");
        this.clientAmount = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null) throw new IllegalArgumentException("bonus can't be null");
        if (bonus.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException("bonus can't be <0");
        if (clientAmount > 150) {
            bonus = bonus.add(new BigDecimal(1000));
            setBonusValue(bonus);
        } else if (clientAmount > 100) {
            bonus = bonus.add(new BigDecimal(500));
            setBonusValue(bonus);
        }
        else setBonusValue(bonus);
    }
}
/*
Чтобы создать  класс Manager в качестве наследника класса Employee и объявить с ним:
• Количество закрытых целочисленных полей (количество клиентов, обслуживаемых менеджером в течение месяца)
• Конструктор со строкой параметров name - фамилия сотрудника, зарплата и целое число clientAmount - количество обслуженных клиентов,
первые два из которых передаются конструктору базового класса.
• Переопределите виртуальный метод родительского класса SetBonus следующим образом: если менеджер обслуживает более 100 клиентов,
его бонус увеличивается на 500, а если клиентов больше 150 - на 1000.
 */
