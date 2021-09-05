import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;

public class Client implements Iterable<Deposit> {
    private int countOfDeposit = 0;
    private static final int MAX_COUNT = 10;
    private static final String ILLEGAL_DEPOSIT = "Argument must not be null";
    private final Deposit[] deposits;

    public Client() {
        deposits = new Deposit[MAX_COUNT];
    }


    public boolean addDeposit(Deposit deposit) {
        if (deposit == null) throw new IllegalArgumentException(ILLEGAL_DEPOSIT);
        if (countOfDeposit >= MAX_COUNT) {
            return false;
        } else {
            deposits[countOfDeposit] = deposit;
            countOfDeposit++;
            return true;
        }
    }

    public BigDecimal totalIncome() {
        if (deposits.length == 0) throw new IllegalArgumentException(ILLEGAL_DEPOSIT);
        BigDecimal total = deposits[0].income();
        for (int i = 1; i < deposits.length; i++) {
            if (deposits[i] == null) {
                return total;
            }
            total = total.add(deposits[i].income());
        }
        return total;
    }

    public BigDecimal maxIncome() {
        BigDecimal maxIncome = deposits[0].income();
        if (maxIncome == null) throw new IllegalArgumentException(ILLEGAL_DEPOSIT);
        for (int i = 1; i < deposits.length; i++) {
            if (deposits[i] == null) {
                return maxIncome;
            }
            if ((deposits[i].income()).compareTo(maxIncome) > 0) {
                maxIncome = deposits[i].income();
            }
        }
        return maxIncome;
    }

    public BigDecimal getIncomeByNumber(int number) {
        if (deposits[number] == null || number > countOfDeposit) return BigDecimal.ZERO;
        if (number < 0) throw new IllegalArgumentException("deposit's number must be >0");
        return deposits[number].income();

    }

    @Override
    public Iterator<Deposit> iterator() {
        return new DepositIterator();
    }

    class DepositIterator implements Iterator<Deposit> {
        private int index;
        private final Deposit[] deposits;

        DepositIterator() {
            this.index = 0;
            this.deposits = Client.this.deposits;
        }

        @Override
        public boolean hasNext() {
            return index < deposits.length;
        }

        @Override
        public Deposit next() {
            if (!hasNext()) {
                throw new NoSuchElementException("element is not found");
            }
            Deposit value = deposits[index];
            index++;
            return value;
        }
    }

    public void sortDeposits() {
        Arrays.sort(deposits, 0, countOfDeposit, Comparator.reverseOrder());
    }

    public int countPossibleToProlongDeposit() {
        int count = 0;
        for (Deposit deposit : deposits) {
            if (deposit instanceof Prolongable && ((Prolongable) deposit).canToProlong()) {
                count++;
            }
        }
        return count;
    }
}

/*
To create class Client (bank client) and declare within it:
• Private field deposits (client deposits) – objects array of type Deposit
• Constructor without parameters, which creates empty array deposits consisting of 10 elements
• Method AddDeposit with parameter deposit for adding regular, special or long-term account into array
on the first empty spot and returning true, or returning false, if accounts number limit is depleted (no empty space in array).
• Method TotalIncome, returning total income amount based on all client’s deposits upon deposits expiration.
• Method MaxIncome, returning maximum deposit income of all client’s deposits upon deposits expiration.
• Method GetIncomeByNumber with integer parameter number (deposit number, which equals its index in array),
returning income from deposit with such number. If deposit with such number does not exist, method returns 0 value.

Создать класс Client (клиент банка) и объявить в нем:
• Private field deposit (вклады клиентов) - массив объектов типа Deposit
• Конструктор без параметров, который создает пустой массив депозитов, состоящий из 10 элементов
• Метод AddDeposit с параметром deposit для добавления регулярных , специальные или длинные временная учетная запись
в массив на первом пустом месте и возвращает истину или возвращает ложь, если лимит количества учетных записей исчерпан (нет пустого места в массиве).
• Метод TotalIncome, возвращающий общую сумму дохода по всем вкладам клиента по истечении срока их действия.
• Метод MaxIncome, возврат максимального депозита по всем вкладам клиента по истечении срока их действия.
• Метод GetIncomeByNumber с целочисленным номером параметра (номер депозита, равным его индексу в массиве),
возвращающий доход от депозита с таким номером. Если депозита с таким номером не существует, метод возвращает значение 0.

 */