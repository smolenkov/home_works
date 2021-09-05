
public class CompareStringBuilder {
    public boolean compare(StringBuilder obj1, StringBuilder obj2){
        String st1 = new String(obj1);
        String st2 = new String(obj2);
        return (st1.equals(st2));
    }
}
class test {
    public static void main(String[] args) {
        StringBuilder object1 = new StringBuilder("Mama mila ramu");
        StringBuilder object2 = new StringBuilder("Mama mila ramu");
        StringBuilder object3 = new StringBuilder("Rama mila mamu");
        StringBuilder object4 = new StringBuilder("Rama mila mamu");

        CompareStringBuilder test = new CompareStringBuilder();

        boolean a1 = test.compare(object1, object2);
        System.out.println("compare"+object1+" & "+object2+" = "+a1);

        boolean a2 = test.compare(object3, object2);
        System.out.println("compare"+object3+" & "+object2+" = "+a2);

        boolean a3 = test.compare(object3, object4);
        System.out.println("compare"+object3+" & "+object4+" = "+a3);

        boolean a4 = test.compare(object1, object4);
        System.out.println("compare "+object1+" & "+object4+" = "+a4);

    }
}
