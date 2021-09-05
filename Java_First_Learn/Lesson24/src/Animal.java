abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    String name;

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("it is always interesting to watch how fish sleep");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    String name;

    public Bird(String name) {
        super(name);
        this.name = name;
    }

    public void speak() {
        System.out.println(name + "sings");
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable {
    String name;

    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    String name;

    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim() {
        System.out.println("Mechenosec is beautiful fish who swimming fast");
    }

    public void eat() {
        System.out.println("Mechenosec eats usually food");
    }
}
class Pinguin extends Bird{
    String name;

    public Pinguin(String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Pinguin"+name+" likes eat fish");
    }
    public void sleep() {
        System.out.println("Pinguins "+name+"sleep snuggling each other");
    }
    public void fly(){
        System.out.println("Pinguins "+name+"can not fly");
    }
    public void speak() {
        System.out.println(name + "Pinguins can not sing like nightingale");
    }
}
class Lion extends Mammal{
    String name;


    public Lion(String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Lion "+name+"likes meat");
    }
    public void sleep() {
        System.out.println("mostly lion"+name+" sleeps");
    }
    public void run() {
        System.out.println("Lion "+name+"is not fastest cat");
    }
}
