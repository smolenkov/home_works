public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public Student(StringBuilder name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(StringBuilder name) {
        if (name.length()>=3)
        this.name = name;
    }

    public void setCourse(int course) {
        if (course<=4 && course>=1)
        this.course = course;
    }

    public void setGrade(int grade) {
        if (grade<=10 && grade>=1)
        this.grade = grade;
    }

    public void showinfo() {
        System.out.println("Student{" +
                "name=" + getName() +
                ", course=" + getCourse() +
                ", grade=" + getGrade() +
                '}');
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(new StringBuilder("vasya"), 4, 6);
        student.showinfo();
    }
}
