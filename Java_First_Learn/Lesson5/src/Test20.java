public class Test20 {

    int sum (int x, int y, int z){
        int result = x*y*z;
        return result;
    }

}

class Test21{
    public static void main(String[] args) {
        Test20 Volume1 = new Test20();
        int Volume_of_body = Volume1.sum(5,6,7);
        System.out.println("Volume = " + Volume_of_body);
        System.out.println(Volume1.sum(1,2,3));
    }

}


