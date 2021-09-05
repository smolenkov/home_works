import java.util.ArrayList;

public class Test {
    public static String[] abc(String[]... string1) {
        String[] outputArray = new String[string1.length];
        for (String[] str1 : string1) {
            outputArray = str1;
        }
        return outputArray;

    }

    public static void main(String[] args) {
        String []temp = abc(args);
        for (int i=0; i< temp.length; i++){
            if (temp[i]==args[i]) temp[i]=null;
        }
        for(String i: temp){
            System.out.print(i+" ");
        }
    }
}
