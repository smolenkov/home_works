import java.util.Scanner;

public class input_5 {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите 5");
            i = scanner.nextInt();
        } while (i != 5);
        System.out.println("Вы ввели 5");
    }
}
