public class Main {
    public static void main(String[] args) {
        Pinguin p1 = new Pinguin("PinPin");
        Lion l1 = new Lion("Leva");
        Mechenosec m1 = new Mechenosec("petya");
        Animal a1 = new Animal("tvar") {
            @Override
            void eat() {

            }

            @Override
            void sleep() {

            }
        };
        Fish f1 = new Fish("riba") {
            @Override
            void swim() {

            }

            @Override
            void eat() {

            }
        };

        Mechenosec mechenosec = new Mechenosec(" Vasya ");
        System.out.println(" mechenosrc name is " + mechenosec.name);
        mechenosec.sleep();
        mechenosec.eat();
        mechenosec.swim();
        Speakable pinguin = new Pinguin(" PinSpeakable ");
        pinguin.speak();
        Pinguin pinguin2 = new Pinguin(" Pin ");
        pinguin2.eat();
        pinguin2.sleep();
        pinguin2.speak();
        pinguin2.fly();
        Animal lion = new Lion(" Leva ");
        lion.eat();
        lion.sleep();
        Mammal lion1 = new Lion(" Leva1 ");
        lion1.run();
        lion1.eat();
        lion1.sleep();
        lion1.speak();
        Lion lion2 = new Lion(" Leva2 ");
        lion2.run();
        lion2.eat();
        lion2.sleep();
        lion2.speak();
        Speakable [] array1 ={p1, l1, pinguin, pinguin2 };
        Animal [] array2 ={p1, l1, m1,f1,a1, pinguin2, (Animal) pinguin, lion, lion1, lion2, mechenosec };
    }
}
