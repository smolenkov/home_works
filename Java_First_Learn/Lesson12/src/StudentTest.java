public class StudentTest {
    boolean compareAll(Student St1, Student St2){
        if ((St1.name == St2.name) && (St1.course == St2.course)){
            return true;
        }
        return false;
    }
    void compare(Student St1, Student St2){
        if(St1.name != St2.name){
            System.out.println("Разные имена");
        }
        if(St1.course != St2.course){
            System.out.println("Разные курсы");
        }
    }

}
class Student{
    String name;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    int course;
}
class Test{
    public static void main(String[] args) {
        Student St1 = new Student("Vasya", 1);
        Student St2 = new Student("Vasya", 1);

        StudentTest i = new StudentTest();
        System.out.println(i.compareAll(St1, St2));

        i.compare(St1, St2);
    }
}