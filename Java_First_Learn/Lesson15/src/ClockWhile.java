public class ClockWhile {
    public static void out() {
        int hour = 0;
        int sec;
        OUTER:
        while (hour < 6) {
            int minute = -1;
            MIDDLE:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    System.out.println("--------" + (minute % 10));
                    break OUTER;
                }
                sec = 0;
                while (sec < 60) {
                    if (sec * hour > minute) continue MIDDLE;
                    System.out.println(hour + " : " + minute + " : " + sec);
                    sec++;
                }
            } while (minute < 59);
            hour++;
        }
    }
}

class test {
    public static void main(String[] args) {
        ClockWhile.out();
    }
}