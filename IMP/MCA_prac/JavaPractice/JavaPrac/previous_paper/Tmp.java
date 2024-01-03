class Matrix {
    private int rows, columns;
    private int matrix[][];

    Matrix(int _r, int _c) {
        rows = _r;
        columns = _c;
        matrix = new int[rows][columns];
    }

    void set() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                matrix[i][j] = (i + j);
        }

    }

    void display() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

}

public class Tmp {

    public static void main(String[] args) {
        Matrix mt = new Matrix(4, 5);
        mt.set();
        mt.display();
    }
}