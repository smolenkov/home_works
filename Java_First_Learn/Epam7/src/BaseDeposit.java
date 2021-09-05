import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit {
    public static final double PERCENT = 1.05;

    public BaseDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal depositPerMonths = amount;
        for (int i = 1; i <= period; i++) {
            depositPerMonths = depositPerMonths.multiply(BigDecimal.valueOf(PERCENT));
        }
        return (depositPerMonths.subtract(amount)).setScale(2, RoundingMode.HALF_DOWN);
    }
}
//    public static void main(String[] args) {
//        BigDecimal a = BigDecimal.valueOf(1000);
//        BaseDeposit tmp = new BaseDeposit(a,3);
//        System.out.println(tmp.Income());
//    }
//}

/*
BaseDeposit implies each month 5% of interest from current deposit sum. Each
following month of income is calculated from the sum, which was received by
adding to current income sum of the previous month and is rounded to hundredth.
Example: Base amount – 1000,00
In a month – 1050,00; income amount – 50,00
In two months – 1102,50; income amount – 102,50
In three months – 1157,62; income amount – 157,62

BaseDeposit предполагает ежемесячную выплату 5% процентов от текущей суммы депозита.
Доход за каждый последующий месяц рассчитывается из суммы, полученной путем
прибавления к сумме текущего дохода предыдущего месяца, и округляется до сотых.
Пример: Базовая сумма - 1000,00 В месяц - 105,00; размер дохода - 50,00 За два месяца - 1102,50;
сумма дохода - 102,50 За три месяца - 1157,62; сумма дохода - 157,62

 */