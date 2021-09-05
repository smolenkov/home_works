import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class EpanFirst {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            return n * n;
        } else return -n;

    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n) {
        int i1 = n / 100;
        int i2 = (n - i1 * 100) / 10;
        int i3 = n - i1 * 100 - i2 * 10;
        int bufer;

        if (i1 < i2) {
            bufer = i2;
            i2 = i1;
            i1 = bufer;
        }
        if (i2 < i3) {
            bufer = i3;
            i3 = i2;
            i2 = bufer;
        }
        if (i1 < i2) {
            bufer = i2;
            i2 = i1;
            i1 = bufer;
        }
        n = i1 * 100 + i2 * 10 + i3;
        System.out.println(n);
        return n;
    }
}
 class EpamTest{
     public static void main(String[] args) {
         int a = EpanFirst.task1(-5);
         System.out.println(a);

         int b = EpanFirst.task2(123);


     }

 }
