public class Animal {
    private int eye;

    public Animal(int eye) {
        this.eye = eye;
        System.out.println("I'm animal");
    }

    public void eat(){
        System.out.println("Animal eats");
    };
    public void drink(){
        System.out.println("Animal drinks");
    };
}
class Pet extends Animal{
int tall =1;
int paw = 4;
String name;
    public Pet(int eye, String name) {
        super(2);
        this.name=name;
        System.out.println("I'm a pet");
    }
    public void run(){
        System.out.println("Pet runs");
    }
}
class Dog extends Pet{

    public Dog(int eye, String name) {
        super(eye,name);
        System.out.println("i am a dog, my name is "+name);
    }
    public void playa(){
        System.out.println("dog plays");
    }
}
class Cat extends Pet{

    public Cat(int eye, String name) {
        super(eye,name);
        System.out.println("i am a cat, my name is "+name);
    }
    public void sleep(){
        System.out.println("cat sleeps");
    }
}
class Test{
    public static void main(String[] args) {
        Dog dog=new Dog(2,"Sharick");
        System.out.println(dog.paw);
        Cat cat=new Cat(2,"Murzik");
        cat.sleep();;
    }
}
