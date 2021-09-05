import java.util.Arrays;

public class Task1 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if(array.length==1){return true;}
        if (array.length == 0) {
            throw new IllegalArgumentException("array's length=0");
        }
        if (order != SortOrder.ASC && order != SortOrder.DESC) {
            throw new IllegalArgumentException("order must be ASC or DESC");}
        int[] tempArray = array.clone();
        Arrays.sort(tempArray);
        int[] ArrayASC = tempArray.clone();
        int[] ArrayDESC = tempArray.clone();

        int len = ArrayDESC.length;
        for (int i = 0; i < len / 2; i++) {
            int tmp = ArrayDESC[i];
            ArrayDESC[i] = ArrayDESC[len - i - 1];
            ArrayDESC[len - i - 1] = tmp;
        }

        if (order == SortOrder.ASC) return Arrays.equals(ArrayASC, array);
        if (order == SortOrder.DESC) return Arrays.equals(ArrayDESC, array);
        return false;

    }

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 11, 23, 24, 25, 56, 67, 78, 89, 90};
        System.out.println(isSorted(testArray, SortOrder.DESC));

        int[] testArray1 = {98, 87, 76, 65, 54, 43, 39, 37, 36, 32, 15, 10, 8, 5, 3, 0, -12, -23};
        System.out.println(isSorted(testArray1, SortOrder.DESC));

        int[] testArray2 = {98, 4, 3, 4, 55, 43, 0, 37, 0, 32, 43, 10, 8, 5, 3, 0, -12, -23};
        System.out.println(isSorted(testArray2, SortOrder.ASC));

//        int[] testArray = {1};
//        System.out.println(isSorted(testArray, SortOrder.DESC));
//
//        int[] testArray1 = {1};
//        System.out.println(isSorted(testArray1, SortOrder.ASC));
    }
}

/*
Task 1*
Create function IsSorted, determining whether a given array of integer values of arbitrary length
is sorted in a given order (the order is set up by enum value SortOrder). Array and sort order are
passed by parameters. Function does not change the array.

Задача 1 * Создать функцию IsSorted, определяющую, отсортирован ли заданный массив целочисленных значений
произвольной длины в заданном порядке (порядок задается значением перечисления SortOrder).
Массив и порядок сортировки передаются параметрами. Функция не меняет массив.

 */