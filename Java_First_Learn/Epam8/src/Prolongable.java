public interface Prolongable {
    boolean canToProlong();
}
/*
Task
To add the following new functionalities to the project created in task 7:
To create interface Prolongable (prolonging deposit) and declare within it method
canToProlong without parameters that returns logic value true or false, depending
on the fact whether this specific deposit can be prolonged or not.
To implement interface Prolongable in classes SpecialDeposit and LongDeposit.
In addition, special deposit (SpecialDeposit) can be prolonged only when more than
1000 UAH were deposited, and long-term deposit (LongDeposit) can be prolonged
if the period of deposit is no longer than 3 years.
To implement standard generic interface Comparable in abstract class
Deposit. Total sum amount (sum deposited plus interest during entire period) should
be considered as comparison criteria of Deposit instances.
To implement additionally in class Client:
• interface Iterable.
• Method sortDeposits, which performs deposits sorting in array deposits in
descending order of total sum amount (sum deposited plus interest during entire period).
• Method countPossibleToProlongDeposit, which returns integer – amount
of current client’s deposits that can be prolonged.



Задача Чтобы добавить следующие новые функции в проект, созданный в задаче 7:

Создать интерфейс Prolongable (продление депозита) и объявить в нем метод canToProlong без параметров,
который возвращает логическое значение true или false, в зависимости от того, можно ли продлить данный конкретный депозит или нет.
Реализовать интерфейс Prolongable в классах SpecialDeposit и LongDeposit.
Кроме того, специальный депозит (SpecialDeposit) может быть продлен только при депозите на сумму более 1000 грн,
а долгосрочный депозит (LongDeposit) может быть продлен, если срок депозита не превышает 3-х лет.
Для реализации стандартного универсального интерфейса Comparable в абстрактном классе Deposit.
Общая сумма суммы (внесенная сумма плюс проценты за весь период) должна рассматриваться как критерий сравнения экземпляров Вклада.

Дополнительно реализовать в классе Client:
• интерфейс Iterable.----------------
• Метод sortDeposits, которая выполняет сортировку вкладов в массиве вкладов в порядке убывания общей суммы суммы
(сумма депонирования плюс проценты за весь период).----------------
• Метод countPossibleToProlongDeposit, который возвращает целое число - сумму текущих депозитов клиента, которую можно продлить.
-------------------------------------------------------------------------------------------------
Чтобы добавить следующие новые функции в проект, созданный в задаче 7:
Создать интерфейс Prolongable (продление депозита) и объявить в нем метод
canToProlong без параметров, который возвращает логическое значение true или false, в зависимости от
о том, можно ли продлить данный конкретный депозит.
Реализовать интерфейс Prolongable в классах SpecialDeposit и LongDeposit.
Кроме того, специальный депозит (SpecialDeposit) может быть продлен только при более чем
Внесено 1000 грн, долгосрочный депозит (LongDeposit) можно пролонгировать
если срок депозита не более 3-х лет.
Для реализации стандартного универсального интерфейса Comparable <Deposit> в абстрактном классе
Депозит. Общая сумма суммы (внесенная сумма плюс проценты за весь период) должна
рассматриваться как критерий сравнения экземпляров Депозита.
Дополнительно реализовать в классе Client:
• Итератор интерфейса <Deposit>.
• Метод sortDeposits,
который выполняет сортировку депозитов в массиве депозитов в
по убыванию общей суммы депозита по окончании срока депозита.
• Метод countPossibleToProlongDeposit, который возвращает целое число - количество.
текущих вкладов клиента, которые могут быть продлены.
 */