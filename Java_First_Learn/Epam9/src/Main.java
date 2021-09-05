public class Main {
    public static void main(String[] args) throws MatrixException {
        double[][] test = {{5.1, 5.2}, {6.1, 6.2}};
        Matrix testMatrix = new Matrix(test);

        System.out.println("matrix rows: " + testMatrix.rows()+" matrix cols: " + testMatrix.columns());
        for (int i = 0; i < testMatrix.rows(); i++) {
            System.out.println("");
            for (int j = 0; j < testMatrix.columns(); j++) {
                System.out.print(testMatrix.getValue(i, j) + " ");
//                System.out.print(i+"."+j+" ");
            }
        }


    }
}
