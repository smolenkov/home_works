import java.util.ArrayList;
import java.util.ListIterator;

public class Test {
    public static String[] abc(String... param) {
        int len = param.length;
        ArrayList<String> Output = new ArrayList<>(len);
        for(String var: param) Output.add(var);
        ListIterator<String> it = Output.listIterator();
        String []outArray;
        String tmp;
        System.out.println(len);
        System.out.println(Output.toString());
        int firstIndex;
        int lastIndex;
        while (it.hasNext()){
            tmp = it.next();
            firstIndex=Output.indexOf(tmp);
            lastIndex=Output.lastIndexOf(tmp);
//            System.out.print(tmp+" "+"first index - "+Output.indexOf(tmp)+"last index - "+Output.lastIndexOf(tmp)+" ");
            if (firstIndex != lastIndex){
                it.remove();
                System.out.println(tmp+" removed");
            }
        }
        outArray=Output.toArray(new String[0]);
//        for (String str: outArray) System.out.print(str + " ");
        return outArray;

    }

    public static void main(String[] args) {
        String[] test = {"sasa", "zaza", "vava","sasa","sasa","vava", "tete","yuyu","zazaza","koko"};
//        for (String str:test) System.out.print(str + " ");
        for (String str: abc(test)) System.out.print(str + " ");

    }
}
