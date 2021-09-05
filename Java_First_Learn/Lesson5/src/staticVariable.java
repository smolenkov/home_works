public class staticVariable {
    static final double PI = 3.1415;
    public static int multiple (int a1, int b1, int c1){
        return a1*b1*c1;
    }
    public static void devide (int a, int b){
        System.out.println(a +" / "+b+" = "+(a/b)+", remainder - "+a%b);
    }
    public double circleArea(int r1){
        return PI*r1*r1;
    }
    public static double circleLength(int r2){
        return 2*PI*r2;
    }
    public void Info(int r){
        System.out.println("R = " +r+ " " + " L=" +circleLength(r)+ " " + " S=" +circleArea(r));
    }
}
class Test {
    public static void main(String[] args) {
        int res1 = staticVariable.multiple(4, 5, 6);
        int res2 = staticVariable.multiple(33, 44, 6);
        System.out.println(res1);
        System.out.println(res2);

        staticVariable.devide(50, 6);
        staticVariable.devide(67, 17);

        staticVariable i = new staticVariable();
        i.Info(7);
    }
}
