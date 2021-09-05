public class Task4 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static double sumGeometricElements(int a1, double t, int alim) {
        if (a1 <= alim) throw new IllegalArgumentException("a1 must be >=alim");
        if (t <= 0 || t >= 1) throw new IllegalArgumentException("t must be: 0 <t <1 ");
        if (a1 <= 0) throw new IllegalArgumentException("a1 must be >0");
        if (alim < 0) throw new IllegalArgumentException("alim must be >=0");
        double sum = 0;
        double var1 = a1;
        while (var1 > alim) {
            sum += var1;
            var1 *= t;
            if (var1 < alim || var1 <= 0) {
                return Math.round(sum);
            }
        }
        return Math.round(sum);
    }

    public static void main(String[] args) {
        System.out.println(Task4.sumGeometricElements(100, 0.9, 50));
    }
}

/*
Task 4.
Create function SumGeometricElements, determining the sum of the first positive elements of a decreasing geometric
progression of real numbers with a given initial element of a progression a1 and a given progression step t,
while the last element must be greater than a given alim. an is calculated by the formula (an+1 = an * t),
0<t<1.
Example:
For a progression, where a1 = 100, and t = 0.5, the sum of the first elements, grater than alim = 20,
equals to 100+50+25 = 175
*Functions’ signature should start from words public static

Задача 4. Создайте функцию SumGeometricElements, определяющую сумму первых положительных элементов
убывающей геометрической прогрессии действительных чисел с заданным начальным элементом прогрессии a1 и заданным
шагом прогрессии t, при этом последний элемент должен быть больше заданного алима. .
an вычисляется по формуле (an + 1 = an * t), 0 <t <1.
Пример: для прогрессии, где a1 = 100 и t = 0,5, сумма первых элементов больше, чем alim = 20, равна 100 + 50 + 25 = 175.

* Подпись функции должна начинаться со слов public static
 */