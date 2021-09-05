public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this.a = a;
        this.b = 5;
    }

    public Rectangle() {
        this.a = 4;
        this.b = 3;
    }
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getSideA() {
        return a;
    }

    public double getSideB() {
        return b;
    }

    public double area() {
        return (getSideA() * getSideB());
    }

    public double perimeter() {
        return ((getSideA() + getSideB()) * 2);
    }

    public boolean isSquare() {
        return (getSideA() == getSideB());
    }

    public void replaceSides() {
        double tmp =getSideA();
        setA(getSideB());
        setB(tmp);
    }

}

