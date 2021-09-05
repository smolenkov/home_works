import java.awt.*;
import java.util.Arrays;

public class ArrayRectangles {
    private Rectangle[] rectangleArray;


    public ArrayRectangles(int len) {
        if (len <= 0) throw new IllegalArgumentException("len of array should be >0");
        this.rectangleArray = new Rectangle[len];
    }

    public ArrayRectangles(Rectangle... rectangleArray) {
        if (rectangleArray == null) {
            throw new IllegalArgumentException("array shouldn't  be empty");
        }
        this.rectangleArray = Arrays.copyOf(rectangleArray, rectangleArray.length);
    }

    boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] == null) {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    public int numberMaxArea() {
        double maxArea = rectangleArray[0].area();
        int index = 0;
        for (int i = 1; i < rectangleArray.length; i++) {
            double area = rectangleArray[i].area();
            if (area > maxArea) {
                maxArea = area;
                index = i;
            }
        }
        return index;
    }

    public int numberMinPerimeter() {
        int index = 0;
        double min = rectangleArray[0].perimeter();
        for (int i = 1; i < rectangleArray.length; i++) {
            if (rectangleArray[i].perimeter() < min) {
                min = rectangleArray[i].perimeter();
                index = i;
            }
        }
        return index;
    }

    public int numberSquares() {
        int count = 0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i].isSquare())
                count++;
        }
        return count;
    }
}
/*
On an Advanced level also needed:

Complete Level Low Assignment

Develop class ArrayRectangles, in which declare:

Private field rectangleArray  - array of rectangles
Constructor creating an empty array of rectangles with length n
Constructor that receives an arbitrary amount of objects of type Rectangle or an array of objects of type Rectangle.
Method addRectangle that adds a rectangle of type Rectangle to the array on the nearest free place and returning true, or returning false, if there is no free space in the array
Method numberMaxArea, that returns order number (index) of the first rectangle with the maximum area value in array (numeration starts from zero)
Method numberMinPerimeter, that returns order number(index) of the first rectangle with the minimum perimeter value in array (numeration starts from zero)
Method numberSquares, that returns the number of squares in the array of rectangles

Завершить задание низкого уровня

Разработайте класс ArrayRectangles, в котором объявите:

Приватное поле rectangleArray - массив прямоугольников
Конструктор, создающий пустой массив прямоугольников длиной n
Конструктор, который получает произвольное количество объектов типа Rectangle или массив объектов типа Rectangle.
Метод addRectangle, который добавляет прямоугольник типа Rectangle в массив на ближайшем свободном месте и возвращает true или возвращает false, если в массиве нет свободного места
Метод numberMaxArea, возвращающий порядковый номер (индекс) первого прямоугольника с максимальным значением площади в массиве (нумерация начинается с нуля)
Номер метода MinPerimeter,
который возвращает порядковый номер (индекс) первого прямоугольника с минимальным значением периметра в массиве (нумерация начинается с нуля)
Метод numberSquares, который возвращает количество квадратов в массиве прямоугольников.
 */