import java.math.BigDecimal;

public abstract class Deposit {
    public final BigDecimal amount;
    public final int period;

    public Deposit(BigDecimal depositAmount, int depositPeriod) {
        if (depositPeriod < 0) throw new IllegalArgumentException("period can not be negative");
        if (depositAmount.compareTo(BigDecimal.valueOf(0)) < 0) throw new IllegalArgumentException("deposit can not be negative");
        this.amount = depositAmount;
        this.period = depositPeriod;
    }
    public abstract BigDecimal income();



}


/*
To create abstract class Deposit and declare within it:
• Public money property only for reading Amount (deposit amount)
• Public integer property only for reading Period (time of deposit in months)
• Constructor (for calling in class-inheritor) with parameters depositAmount
and depositPeriod, which creates object deposit with specified sum for
specified period.
• Abstract method Income, which returns money value – amount of income
from deposit. Income is the difference between sum, withdrawn from
deposit upon expiration date and deposited sum.

To create classes that are inheritors of the class Deposit, which determine different
options of deposit interest addition – class BaseDeposit, class SpecialDeposit and
class LongDeposit. To implement in each class a constructor with parameters
amount and period, which calls constructor of parent class.
For each inheritor class – to implement own interest addition scheme and
accordingly profit margin definitions, overriding abstract method Income in each
class.

Создать абстрактный класс Deposit и объявить в нем:
• Свойство Public money только для чтения Amount (сумма депозита)
• Public integer свойство только для чтения Period (время депозита в месяцах)
• Конструктор (для вызова в классе-наследнике) с параметрами depositAmount и depositPeriod,
который создает депозит объекта с указанной суммой на указанный период.
• Абстрактный метод Income, который возвращает денежную стоимость - сумму дохода от депозита.
Доход - это разница между суммой, снятой с депозита по истечении срока его действия, и суммой депозита.

Создать классы-наследники класса Deposit, определяющие различные варианты начисления процентов по депозиту
- класс BaseDeposit, класс SpecialDeposit и класс LongDeposit.
Реализовать в каждом классе конструктор с параметрами количество и период, вызывающий конструктор родительского класса.
Для каждого класса-наследника - реализовать собственную схему начисления процентов и, соответственно,
определения размера прибыли, переопределив абстрактный метод Income в каждом классе.

 */