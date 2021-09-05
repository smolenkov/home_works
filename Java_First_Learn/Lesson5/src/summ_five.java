
class summ{
    void sum(int a1, int b1, int c1, int d1) {
        System.out.println(a1 + b1 + c1 + d1);
    }

    void sum(int a2, int b2, int c2) {
        System.out.println(a2 + b2 + c2);
    }

    void sum(int a3, int b3) {
        System.out.println(a3 + b3);
    }

    void sum(int a4) {
        System.out.println(a4);
    }

    void sum() {
        System.out.println(0);
    }
}
public class summ_five{
    public static void main(String[] args) {

        summ f = new summ();

        f.sum(1, 2, 3, 4);
        f.sum(1, 2, 3);
        f.sum(1, 2);
        f.sum(1);
        f.sum();
    }
}
