public class MatrixException extends Exception {
    public MatrixException(String message) {
        super(message);
    }

    private static final String INCOMPATIBLE_MATRIX_SIZES = "Incompatible matrix sizes";
    private static final String ZERO_NUMBER_OF_ROWS = "Array passed with zero number of rows";
    private static final String ZERO_NUMBER_OF_COLUMNS = "Array passed with zero number of columns";

    public static void checkCorrectIndex(int row, int column, double[][] matrix) throws MatrixException {
        if (row >= matrix.length || column >= matrix[0].length || row < 0 || column < 0)
            throw new MatrixException(INCOMPATIBLE_MATRIX_SIZES);
    }

    public static void checkMatrix(double[][] twoDimensionalArray) throws MatrixException {
        if (twoDimensionalArray.length == 0) throw new MatrixException(ZERO_NUMBER_OF_ROWS);
        if (twoDimensionalArray[0].length == 0) throw new MatrixException(ZERO_NUMBER_OF_COLUMNS);
        int count = twoDimensionalArray[0].length;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            if (twoDimensionalArray[i].length == 0) throw new MatrixException(ZERO_NUMBER_OF_COLUMNS);
            if (twoDimensionalArray[i].length != count) throw new MatrixException(INCOMPATIBLE_MATRIX_SIZES);
            if (twoDimensionalArray[i] == null) throw new UnsupportedOperationException(INCOMPATIBLE_MATRIX_SIZES);
        }
    }

    public static void checkSizeMatrix(int row, int column) throws MatrixException {
        if (row <= 0) throw new MatrixException(ZERO_NUMBER_OF_ROWS);
        if (column <= 0) throw new MatrixException(ZERO_NUMBER_OF_COLUMNS);
    }

    public static void compareMatrix(Matrix matrix, int row, int column) throws MatrixException {
        if (matrix.rows() != row || matrix.columns() != column) throw new MatrixException(INCOMPATIBLE_MATRIX_SIZES);
    }
}

