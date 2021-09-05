
    public class Student {
        Student(int number_of_stud_ticket1, String name1, String surname1, int year1, float am1, float ae1, float af1){
            number_of_stud_ticket=number_of_stud_ticket1;
            name=name1;
            surname=surname1;
            year=year1;
            average_math=am1;
            average_economy=ae1;
            average_foreign=af1;
        }

        int number_of_stud_ticket;
        String name;
        String surname;
        int year;
        float average_math;
        float average_economy;
        float average_foreign;

        Student(int number_of_stud_ticket2, String name2, String surname2, int year2) {
            this(number_of_stud_ticket2, name2, surname2, year2, 0.0f, 0.0f, 0.0f);
        }

        Student() {
                this(0, "incognito", null, 0, 0.0f, 0.0f, 0.0f);

        }
    }

    class StudentTest{

        void average_out (Student St){

            float average = (St.average_economy + St.average_foreign + St.average_math)/3;
            System.out.println(St.name + " - средняя оценка: " + average);

        }

        public static void main(String[] args) {

            Student Masha = new Student(12345, "Maria", "Petrovna", 1994, 8,9, 10);
            Student Petya = new Student(54321, "Peter", "Vladimirovich", 1993);
            Student Ivan = new Student();


            StudentTest St = new StudentTest();
            St.average_out(Masha);
            St.average_out(Petya);
            St.average_out(Ivan);

        }



    }

