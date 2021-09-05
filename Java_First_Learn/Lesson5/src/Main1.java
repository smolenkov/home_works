public class Main1 {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public int task1(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Argument should be > 0");}
            int sum = 0;
            while (value != 0) {
                if ((value % 10) % 2 == 1) {
                    sum += (value % 10);
                }
                value /= 10;
            }
            return sum;

        }

        /**
         * <summary>
         * Implement code according to description of task 2.
         * </summary>
         */
        public static int task2 ( int value){
            if (value <= 0) {
                throw new IllegalArgumentException("Argument should be > 0");
            int result = 0;
            String convert = Integer.toBinaryString(value);
            for (String s : convert.split("")) {
                if (s.equals("1")) {
                    result++;
                }
            }
            return result;
        }

        /**
         * <summary>
         * Implement code according to description of task 3.
         * </summary>
         */
        public static int task3 ( int value){
            if (value <= 0) {
                throw new IllegalArgumentException("Argument should be > 0");
            }
            if (value == 1) {
                return 0;
            }
            if (value == 2) {
                return 1;
            }
            int f1 = 1;
            int f2 = 1;
            int sum = 2;
            int fibonacci;
            for (int i = 3; i < value; i++) {
                fibonacci = f1 + f2;
                f1 = f2;
                f2 = fibonacci;
                sum = sum + fibonacci;
            }
            return sum;
        }
    }

class Test1 {
    public static void main(String[] args) {
        Main1 var = new Main1();
        int intValue = 0;
        int n = var.task1(intValue);
        System.out.println(n);

        int nBin = Main1.task2(0);
        System.out.println(nBin);

        int fib = Main1.task3(11);
        System.out.println(fib);
    }
}
/*
Задание 1*. Для положительного целого числа n вычислите значение результата, которое равно сумме нечетных чисел n.
Например, n = 1234 результат = 4; n = 246 результат = 0;

        Задача 2. Для положительного целого числа n вычислить значение результата, которое равно количеству «1» в двоичном представлении числа n. Например, n = 14 = 1110 результат = 3;
        n = 128 = 1000 0000 результат = 1;

        Задача 3. Для положительного целого числа n вычислить результат, равный сумме первых n чисел Фибоначчи.
        Примечание. Числа Фибоначчи - это последовательность чисел, в которой каждое следующее число равно сумме двух предыдущих: 0, 1, 1, 2, 3, 5, 8, 13 ...
        (значение первого элемента в числах Фибоначчи равно «0», значения второго и третьего элементов равны «1»,
        для остальных элементов используйте формулу F (n) = F (n-1) + F (n-2)) Пример, n = 8 результат = 33; n = 11 результат = 143;

        * Решить задачу как в примере
        Пример решения задачи в eMentor.

        Задача.
        Найдите сумму заданных целых значений a и b.

        Скачайте скелетный код из нашего клонированного репозитория для решения задачи:

// Реализуем код согласно описанию задачи x
//public static int taskX (int a, int b) {
//        // ЗАДАЧИ: удалите строку ниже и напишите собственное решение
//        выбросить новое исключение UnsupportedOperationException ();
//        }
//        Измените скелетный код и поместите его в наш репозиторий:
//
//public static int taskX (int a, int b) {
//        int результат;
//        результат = а + б;
//        вернуть результат;
//        }
//        Предположим, что значения a и b уже установлены, и присвоение им новых значений является ошибкой. Результаты должны быть сохранены в целочисленной переменной, например, result,
//        и завершите свой код результатом, возвращаемым оператором;*/
