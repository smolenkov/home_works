import java.util.Arrays;

public class Task2 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int[] transform(int[] array, SortOrder order) {
        if (array.length==0){throw new IllegalArgumentException("array's length=0");}
        if (order != SortOrder.ASC && order != SortOrder.DESC) {
            throw new IllegalArgumentException("order mus be ASc or DESC");}
        if (!Task1.isSorted(array, order)){
            return array;}
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
        }
        return array;
    }
//        public static void main(String[] args) {
//
//        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 11, 23, 24, 25, 56, 67, 78, 89, 90};
//            System.out.println(Arrays.toString(transform(testArray, SortOrder.DESC)));
//
//        int[] testArray1 = {98, 87, 76, 65, 54, 43, 39, 37, 36, 32, 15, 10, 8, 5, 3, 0, -12, -23};
//            System.out.println(Arrays.toString(transform(testArray1, SortOrder.DESC)));
//
//        int[] testArray2 = {98, 4, 3, 4, 55, 43, 0, 37, 0, 32, 43, 10, 8, 5, 3, 0, -12, -23};
//            System.out.println(Arrays.toString(transform(testArray2, SortOrder.ASC)));
//
//            int[] testArray3 = {15};
//            System.out.println(Arrays.toString(transform(testArray3, SortOrder.DESC)));
//
//
//    }
}

/*
Task 2.
Create function Transform, replacing the value of each element of an integer array with the sum of
this element value and its index, only if the given array is sorted in the given order (the order
is set up by enum value SortOrder). Array and sort order are passed by parameters. To check, if
the array is sorted, the function IsSorted from the Task 1 is called.
Example:
For {5, 17, 24, 88, 33, 2} and “ascending” sort order values in the array do not change;
For {15, 10, 3} and “ascending” sort order values in the array do not change;
For {15, 10, 3} and “descending” sort order the values in the array are changing to {15, 11, 5}

Задача 2. Создать функцию Transform, заменяя значение каждого элемента целочисленного массива
суммой значения этого элемента и его индекса, только если данный массив отсортирован в заданном порядке
(порядок устанавливается значением перечисления SortOrder) . Массив и порядок сортировки передаются параметрами.
Чтобы проверить, отсортирован ли массив, вызывается функция IsSorted из Задачи 1.

Пример: для {5, 17, 24, 88, 33, 2} и «возрастающего» значения порядка сортировки в массиве не изменяются;
Для {15, 10, 3} и «по возрастанию» значения порядка сортировки в массиве не меняются;
Для {15, 10, 3} и порядка сортировки «по убыванию» значения в массиве меняются на {15, 11, 5}
 */
