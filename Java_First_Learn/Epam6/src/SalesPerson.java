import java.math.BigDecimal;

public class SalesPerson extends Employee{
    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        if (percent < 0) throw new IllegalArgumentException("percent must be >0");
        this.percent=percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null) throw new IllegalArgumentException("bonus can't be null");
        if (bonus.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException("bonus can't be <0");
        if (percent > 200) {
            bonus = bonus.multiply(new BigDecimal(3));
            setBonusValue(bonus);
        } else if (percent > 100) {
            bonus = bonus.multiply(new BigDecimal(2));
            setBonusValue(bonus);
        } else setBonusValue(bonus);

    }
}
/*
Чтобы создать класс SalesPerson как класс Employee
наследник и объявить в нем:
· Закрытое целочисленное поле в процентах (процент выполнения / выполнения плана продаж)
· Конструктор с параметрами: имя - фамилия сотрудника, зарплата, процент - процент выполнения плана,
первые два из которых передаются конструктору базового класса
· Переопределить виртуальный метод родительского класса SetBonus следующим образом: если продавец выполнил план более чем на 100%,
так его бонус удваивается (умножается на 2), а если больше 200% - бонус увеличивается втрое (умножается на 3)
 */