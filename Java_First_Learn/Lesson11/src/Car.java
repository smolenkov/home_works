public class Car{
    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getDoors() {
        return doors;
    }

    private String color;
    private String engine;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

    private int doors;

    public void changeDoors (int newDoors){
        this.doors = newDoors;
    }
    public static void swap (Car car1, Car car2){
        int bufer = car1.getDoors();
        car1.setDoors(car2.getDoors());
        car2.setDoors(bufer);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", doors=" + doors +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Car Audi = new Car("red", "V8", 4);
        Car Mercedes = new Car("black", "V12", 2);

        System.out.println(Audi);
        System.out.println(Mercedes);
        System.out.println("-----------------------------------");


        Audi.changeDoors(5);
        Mercedes.changeDoors(4);

        System.out.println(Audi);
        System.out.println(Mercedes);
        System.out.println("-----------------------------------");

        Car.swap(Audi, Mercedes);

        System.out.println(Audi);
        System.out.println(Mercedes);
    }
}
