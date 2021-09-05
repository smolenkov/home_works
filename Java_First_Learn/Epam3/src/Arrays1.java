import java.util.Arrays;

public class Arrays1 {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int[] task1(int[] array) {
        int bufer;
        int len = array.length;
        if (len == 0) throw new ArrayIndexOutOfBoundsException("array is empty");
        for (int i = 0; i <= len / 2; i++) {
            if (array[i] % 2 == 0 && array[len - i - 1] % 2 == 0) {
                bufer = array[i];
                array[i] = array[len - i - 1];
                array[len - i - 1] = bufer;
            }
        }
        return array;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int[] array) {
        int len = array.length;
        if (len == 0) throw new IllegalArgumentException("array is empty");
        int result;
        int max = array[0];
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 1; i < len - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < len - 1; i++) {
            if (array[i] == max) {
                startIndex = i;
                break;
            }
        }
        for (int i = len - 1; i >= 0; i--) {
            if (array[i] == max) {
                endIndex = i;
                break;
            }
        }
        result = endIndex - startIndex;
        return result;
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int[][] task3(int[][] matrix) {
        int lenY = matrix.length;
        if (lenY == 0) throw new IllegalArgumentException("dimension of matrix may be > 0");
        int i;
        int lenX = 0;
        for (i = 0; i < lenY - 1; i++) {
            lenX = matrix[i].length;
            if (lenX != lenY) throw new IllegalArgumentException("matrix is not square");
        }
        for (int x = 0; x < lenX; x++) {
            for (int y = 0; y < lenX; y++) {
                if (x == y) continue;
                if (x > y) matrix[x][y] = 0;
                if (x < y) matrix[x][y] = 1;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
//        int[] testarray1 = {100, 2, 3, 45, 33, 8, 4, 488, 54};
//        int[] result = task1(testarray1);
//        for (int i = 0; i < result.length; i++)
//            System.out.print(result[i] + " ");

        int[] testarray2 = {};
        int[] result1 = task1(testarray2);//Exception
//        for (int i = 0; i < result1.length; i++)
//            System.out.print(result1[i] + " ");

        int[] testarray3 = null;
        int[] result2 = task1(testarray3);//Exception
    }
//public static void main(String[] args) {
//    int[] testarray1 = {4, 100, 3, 4};// 0
//    int result = task2(testarray1);
//    System.out.println(result);
//
//    int[] testarray2 = {5, 50, 50, 4, 5};// 1
//    result = task2(testarray2);
//    System.out.println(result);
//
//    int[] testarray3 = {5, 350, 350, 4, 350};// 3
//    result = task2(testarray3);
//    System.out.println(result);
//
//    int[] testarray4 = {10, 10, 10, 10, 10};// 4
//    result = task2(testarray4);
//    System.out.println(result);
//
//    int[] testarray5 = {0};// 0
//    result = task2(testarray5);
//    System.out.println(result);
//
//    int[] testarray6 = {};// Exeption
//    result = task2(testarray6);
//    System.out.println(result);
//}
//public static void main(String[] args) {
//    int[][] array1 = new int[][] {{2, 4, 3, 3},  {5, 7, 8, 5},  {2, 4, 3, 3},  {5, 7, 8, 5}};
//    System.out.println(Arrays.deepToString(array1));
//    int[][] result = task3(array1);
//    System.out.println(Arrays.deepToString(result));

//    int[][] array2 = new int[][] {{5, 7, 1, 1},{2, 4, 3},{7, 6, 3, 1},{5, 7, 8, 5}};
//    System.out.println(Arrays.deepToString(array2));
//    int[][] result1 = task3(array2);
//    System.out.println(Arrays.deepToString(result1));// Exception

//}
}



