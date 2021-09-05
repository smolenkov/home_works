public class HomeWork9{
    HomeWork9(String name1, int id1)
    {
        String name = name1;
        int id = id1;
        System.out.println(name+" - "+id);
    }

}
class Test {
    public static void main(String[] args) {
        HomeWork9 obj1 = new HomeWork9("1", 11);
        HomeWork9 obj2 = new HomeWork9("2", 22);
        HomeWork9 obj3 = new HomeWork9("3", 33);
        HomeWork9 obj4 = new HomeWork9("4", 44);
        HomeWork9 obj5 = new HomeWork9("5", 55);
        HomeWork9 obj6 = new HomeWork9("6", 66);
        HomeWork9 obj7 = new HomeWork9("7", 77);
        HomeWork9 obj8 = new HomeWork9("8", 88);

        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        obj5 = null;
        obj6 = null;
    }
}
