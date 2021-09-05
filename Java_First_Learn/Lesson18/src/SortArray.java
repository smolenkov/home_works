import java.util.Arrays;

public class SortArray {
    public static int[] sort(int[] array) {
        int len = array.length;
        int bufer;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-1; j++) {
                if (array[j] > array[j + 1]) {
                    bufer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = bufer;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
    int[]test = {1, 4, 6, 76, 45, 687, 45, 90, 54, 23 ,576 ,24, 9, 1, 1, 6, 6, 456, 324, -54, -43, 0, 0, 45, 45, 21};
    sort(test);
    for (int i=0; i< test.length; i++) {
        System.out.print(test[i] + " ");
    }
    }
}
