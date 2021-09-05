public class Clock {
    public static void out() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                System.out.println("--------" + (minute % 10));
                if (hour > 1 &&  minute % 10 == 0) {
                    break OUTER;
                }
                for (int sec = 0; sec < 60; sec++) {
                    if (sec * hour > minute) continue MIDDLE;
                    System.out.println(hour + " : " + minute + " : " + sec);
                }
            }
        }
    }
}

class test {
    public static void main(String[] args) {
        Clock.out();
    }
}
