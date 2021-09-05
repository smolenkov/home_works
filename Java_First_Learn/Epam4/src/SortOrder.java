public enum SortOrder {
    ASC,
    DESC;
}



//public class Task1 {
//
//    /**
//     * <summary>
//     * Implement code according to description of task.
//     * </summary>
//     * if set invalid arguments in method, then method must throws
//     *  IllegalArgumentException
//     */
//    public static boolean isSorted(int[] array, SortOrder order) {
//        throw new UnsupportedOperationException();
//    }
//}


/**

 Task 1*
        Create function IsSorted, determining whether a given array of integer values of arbitrary length
        is sorted in a given order (the order is set up by enum value SortOrder). Array and sort order are
        passed by parameters. Function does not change the array.

 Task 2.
        Create function Transform, replacing the value of each element of an integer array with the sum of
        this element value and its index, only if the given array is sorted in the given order (the order
        is set up by enum value SortOrder). Array and sort order are passed by parameters. To check, if
        the array is sorted, the function IsSorted from the Task 1 is called.
        Example:
        For {5, 17, 24, 88, 33, 2} and “ascending” sort order values in the array do not change;
        For {15, 10, 3} and “ascending” sort order values in the array do not change;
        For {15, 10, 3} and “descending” sort order the values in the array are changing to {15, 11, 5}

 Task 3.
        Create function MultiArithmeticElements, which determines the multiplication of the first n elements
        of arithmetic progression of real numbers with a given initial element of progression a1 and progression
        step t. an is calculated by the formula (an+1 = an + t).
        Example:
        For a1 = 5, t = 3, n = 4 multiplication equals to 5811*14 = 6160

 Task 4.
        Create function SumGeometricElements, determining the sum of the first positive elements of a decreasing geometric
        progression of real numbers with a given initial element of a progression a1 and a given progression step t,
        while the last element must be greater than a given alim. an is calculated by the formula (an+1 = an * t),
        0<t<1.
        Example:
        For a progression, where a1 = 100, and t = 0.5, the sum of the first elements, grater than alim = 20,
        equals to 100+50+25 = 175
        *Functions’ signature should start from words public static


 Задача 1 * Создать функцию IsSorted, определяющую, отсортирован ли заданный массив целочисленных значений
        произвольной длины в заданном порядке (порядок задается значением перечисления SortOrder).
        Массив и порядок сортировки передаются параметрами. Функция не меняет массив.


 Задача 2. Создать функцию Transform,
        замена значения каждого элемента целочисленного массива суммой значения этого элемента и его индекса,
        только если данный массив отсортирован в заданном порядке (порядок устанавливается значением перечисления SortOrder).
        Массив и порядок сортировки передаются параметрами. Чтобы проверить, отсортирован ли массив, вызывается функция IsSorted из Задачи 1.
        Пример: для {5, 17, 24, 88, 33, 2} и «возрастающего» значения порядка сортировки в массиве не изменяются;
        Для {15, 10, 3} и «по возрастанию» значения порядка сортировки в массиве не меняются;
        Для {15, 10, 3} и порядка сортировки «по убыванию» значения в массиве меняются на {15, 11, 5}


 Задача 3. Создайте функцию MultiArithmeticElements,
        который определяет умножение первых n элементов арифметической прогрессии действительных чисел с заданным
        начальным элементом прогрессии a1 и шагом прогрессии t. an рассчитывается по формуле (an + 1 = an + t).

        Пример: для a1 = 5, t = 3, n = 4 умножение равно 5811 * 14 = 6160


 Задача 4. Создайте функцию SumGeometricElements,
        определение суммы первых положительных элементов убывающей геометрической прогрессии действительных чисел
        с заданным начальным элементом прогрессии a1 и заданным шагом прогрессии t, в то время как последний элемент
        должен быть больше заданного алима. an вычисляется по формуле (an + 1 = an * t), 0 <t <1.

        Пример: для прогрессии, где a1 = 100,
        и t = 0,5, сумма первых элементов больше, чем alim = 20, равна 100 + 50 + 25 = 175

        * Подпись функции должна начинаться со слов public static
**/