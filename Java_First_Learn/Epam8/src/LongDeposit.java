import java.math.BigDecimal;
import java.math.RoundingMode;


public class LongDeposit extends Deposit implements Prolongable {
    public LongDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    private static final int MAX_PROLONGATION_PERIOD = 36;

    @Override
    public BigDecimal income() {
        BigDecimal depositPerMonths = amount;
        BigDecimal totalIncome;
        for (float i = 1; i <= period; i++) {
            if (i <= 6) continue;
            depositPerMonths = depositPerMonths.multiply(BigDecimal.valueOf(1.15));
        }
        totalIncome = (depositPerMonths.subtract(amount)).setScale(2, RoundingMode.HALF_DOWN);
        int tmp = totalIncome.intValue();
        if (tmp == 0) return BigDecimal.ZERO;
        return totalIncome.setScale(2, RoundingMode.FLOOR);
    }

    @Override
    public boolean canToProlong() {
        return period < MAX_PROLONGATION_PERIOD;
    }
}
//    public static void main(String[] args) {
//        BigDecimal a = BigDecimal.valueOf(1000);
//        LongDeposit tmp = new LongDeposit(a, 2);
//        System.out.println(tmp.income());
//    }
//}
/*
LongDeposit implies that during first 6 months, no percent is added to client’s
deposit, but starting from 7th month, each month percent addition is 15% from
current deposit sum, thus encouraging client to make long-term deposits.

LongDeposit подразумевает, что в течение первых 6 месяцев к депозиту клиента не начисляется процент,
но, начиная с 7-го месяца, каждый месяц добавляется 15% от текущей суммы депозита,
что побуждает клиента делать долгосрочные депозиты.

 */