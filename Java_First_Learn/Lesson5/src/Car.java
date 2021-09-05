public class Car {
    String color;
    String engine;
    float speed;

    float gaz (float add_speed){
        speed += add_speed;
        System.out.print("Подбавим газку на " + add_speed);
        return speed;
    }

    float tormoz (float minus_speed){
        speed -= minus_speed;
        System.out.print("Притормозим на " + minus_speed);
        return speed;
    }

    void show_info(){
        System.out.println("  color: " + color + " engine: " + engine + " speed: " + speed);
    }
}

class Test_Car{
    public static void main(String[] args) {
        Car Audi = new Car();
        Audi.speed = 100;
        Audi.engine = "V8";
        Audi.color = "Red";

        Audi.gaz(20);
        Audi.show_info();
        Audi.gaz(40);
        Audi.show_info();
        Audi.tormoz(100);
        Audi.show_info();


    }
}