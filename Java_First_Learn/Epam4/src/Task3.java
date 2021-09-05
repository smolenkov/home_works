public class Task3 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("arguments n can't be = 0");
        }
        int sum = a1;
        long sum1 = a1;
        for (int i = 2; i <= n; i++) {
            a1 += t;
            sum1 *= a1;
            if (sum1 > 2147483647) {
                throw new ArithmeticException("too mach result");
            }
            sum *= a1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(multiArithmeticElements(1, -2, 3));
    }
}

/*
Task 3.
Create function MultiArithmeticElements, which determines the multiplication of the first n elements
of arithmetic progression of real numbers with a given initial element of progression a1 and progression
step t. an is calculated by the formula (an+1 = an + t).
Example:
For a1 = 5, t = 3, n = 4 multiplication equals to 5811*14 = 6160

Задача 3. Создать функцию MultiArithmeticElements, которая определяет умножение первых n элементов арифметической
прогрессии действительных чисел с заданным начальным элементом прогрессии a1 и шагом прогрессии t.
an рассчитывается по формуле (an + 1 = an + t).

Пример: для a1 = 5, t = 3, n = 4 умножение равно 5811 * 14 = 6160.
 */
