
import java.text.DecimalFormat;

public class Matrix {
    private static final String INCOMPATIBLE_MATRIX_SIZES = "Incompatible matrix sizes";
    private final double[][] twoDimensionalArray;

    public Matrix(int row, int column) throws MatrixException {
        MatrixException.checkSizeMatrix(row, column);
        this.twoDimensionalArray = new double[row][column];
    }

    public Matrix(double[][] twoDimensionalArray) throws MatrixException {
        MatrixException.checkMatrix(twoDimensionalArray);
        this.twoDimensionalArray = twoDimensionalArray;
        System.out.println("array from method; "+twoDimensionalArray.length);
        for (int i = 0; i < rows(); i++) {
            System.out.println("");
            for (int j = 0; j < columns(); j++) {
                System.out.print(twoDimensionalArray[i][j]+" ");
            }
        }
    }

    public final int rows() {
        return twoDimensionalArray.length;
    }

    public final int columns() {
        return twoDimensionalArray[0].length;
    }

    public double[][] twoDimensionalArrayOutOfMatrix() {
        return twoDimensionalArray;
    }

    public double getValue(int row, int column) throws MatrixException {
        MatrixException.checkCorrectIndex(row, column, twoDimensionalArray);
        return twoDimensionalArray[row][column];
    }

    public void setValue(int row, int column, double newValue) throws MatrixException {
        MatrixException.checkCorrectIndex(row, column, twoDimensionalArray);
        twoDimensionalArray[row][column] = newValue;
    }

    public Matrix addition(final Matrix matrix) throws MatrixException {
        MatrixException.compareMatrix(matrix, rows(), columns());
        Matrix result = new Matrix(rows(), columns());
        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < columns(); j++) {
                result.setValue(i, j, twoDimensionalArray[i][j] + matrix.getValue(i, j));
            }
        }
        return result;
    }

    public Matrix subtraction(final Matrix matrix) throws MatrixException {
        MatrixException.compareMatrix(matrix, rows(), columns());
        Matrix result = new Matrix(rows(), columns());
        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < columns(); j++) {
                result.setValue(i, j, twoDimensionalArray[i][j] - matrix.getValue(i, j));
            }
        }
        return result;
    }

    public Matrix multiplication(final Matrix matrix) throws MatrixException {
        if (rows() != matrix.columns()) throw new MatrixException(INCOMPATIBLE_MATRIX_SIZES);
        Matrix result = new Matrix(columns(), rows());
        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < matrix.columns(); j++) {
                for (int k = 0; k < columns(); k++) {
                    result.setValue(i, j, result.getValue(i, j) + twoDimensionalArray[i][k] * matrix.getValue(k, j));
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.rows(); i++) {
            for (int j = 0; j < this.columns(); j++) {
                try {
                    if (j != this.columns() - 1) {
                        builder.append(decimalFormat.format(getValue(i, j)) + " ");
                    } else {
                        builder.append(decimalFormat.format(getValue(i, j)));
                    }
                } catch (MatrixException e) {
                    e.getMessage();
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}


/*
Task
To create type Matrix, which incapsulates two-dimensional array-matrix block of real (double) type.
Matrix is the cover for two-dimensional array of real values, storing matrix values with operations of matrix addition,
deduction and multiplication.
Real type values (double) can be in matrix, specifying during creation, the number of array rows and columns,
which will store these values. After creation, the number of rows and columns are not changed.
Values to matrix elements can be set while creating matrix, and later with the help of indexer.
Matrix can provide information regarding the number of array rows and columns, receive array elements
in form of two-dimensional standard array,
add, deduct and multiply matrixes compatible by size. If a user is trying to perform operations
with matrix of incompatible sizes – user type exceptions
MatrixException are thrown from operations. Other matrix methods also throw exceptions,
if a user applies them incorrectly (conveys incorrect parameters into constructor, in indexer – non-existing index and so on).

Implementation of the following functionality is required in Matrix class:
• Creating of empty matrix with predetermined number of rows and
columns (all values in matrix equal 0).
• Creating of matrix based on existing two-dimensional array.
• Receiving of number of matrix rows and columns.
• Receiving of standard two-dimensional array out of matrix.
• Access to recording and reading of elements via predetermined correct
index (indexer).
• Method of matrixes addition.
• Method of matrixes deduction.
• Method of matrixes multiplication.
• Raise exceptions specified in Javadoc-comments to class methods.

Создать тип Matrix, инкапсулирующий двумерный массив-матричный блок вещественного (двойного) типа.

Матрица - это оболочка для двумерного массива действительных значений, хранящая значения матриц с операциями сложения,
вычитания и умножения матриц.

Значения вещественного типа (double) могут быть в матрице, задаваемой при создании,
количество строк и столбцов массива, в которых будут храниться эти значения. После создания количество строк и столбцов не меняется.
Значения элементов матрицы можно задать при создании матрицы, а затем с помощью индексатора.
Матрица может предоставлять информацию о количестве строк и столбцов массива, получать элементы массива в виде двух-
размерный стандартный массив, сложение, вычитание и умножение матриц, совместимых по размеру.
Если пользователь пытается выполнить операции с матрицей несовместимых размеров - из операций выбрасываются исключения
пользовательского типа MatrixException. Другие матричные методы также вызывают исключения,
если пользователь применяет их неправильно (передает неверные параметры в конструктор, в индексаторе - несуществующий индекс и так далее).

В классе Matrix требуется реализация следующего функционала:
• Создание пустой матрицы с заданным количеством строк и столбцов (все значения в матрице равны 0).
• Создание матрицы на основе существующего двумерного массива.
• Получение количества строк и столбцов матрицы.
• Получение стандартного двумерного массива вне матрицы.
• Доступ к записи и чтению элементов через заранее определенный правильный индекс (индексатор).
• Метод сложения матриц.
• Метод вывода матриц.
• Метод умножения матриц.
• Поднимать исключения, указанные в Javadoc-комментариях, к методам класса.
 */

