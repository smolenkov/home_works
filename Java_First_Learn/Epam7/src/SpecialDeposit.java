import java.math.BigDecimal;
import java.math.RoundingMode;


public class SpecialDeposit extends Deposit {
    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal depositPerMonths = amount;
        for (float i = 1; i <= period; i++) {
            depositPerMonths = depositPerMonths.multiply(BigDecimal.valueOf(1 + i / 100));
        }
        return (depositPerMonths.subtract(amount)).setScale(2, RoundingMode.HALF_DOWN);
    }
}
//    public static void main(String[] args) {
//        BigDecimal a = BigDecimal.valueOf(1000);
//        SpecialDeposit tmp = new SpecialDeposit(a,1);
//        System.out.println(tmp.Income());
//    }
//    }
/*
    SpecialDeposit implies income addition each month, amount of which (in percent)
    equals to deposit expiration period. If during the first month 1% is added, during the
    second month – 2% from the sum obtained after first month and so on.
        Example: Base amount – 1000,00
        In a month – 1010,00; income amount – 10,00
        In two months – 1030,20; income amount – 30,20

SpecialDeposit подразумевает ежемесячное начисление дохода, размер которого (в процентах) равен сроку действия депозита.
Если в первый месяц добавляется 1%, во второй месяц - 2% от суммы, полученной по истечении первого месяца и так далее.
Пример: Базовая сумма - 1000,00 В месяц - 1010,00; размер дохода - 10,00 За два месяца - 1030,20; сумма дохода - 30,20

 */