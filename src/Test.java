public class Test {

    public static void main(String[] args) {
        int [][] matrix = {
                { 1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };

        findNegativeCountInRow(matrix, 3);
    }

    private static void findNegativeCountInRow(int[][] matrix, int rowNumber) {
        int negativeCount = 0;
        for (int element : matrix[rowNumber]){
            if (element < 0) {
                negativeCount ++;
            }
        }

        System.out.println("Matrix: ");
        printMatrix(matrix);

    }

   public static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            for (int anInt : array) {
                System.out.print(String.format("%5d", anInt));
            }
            System.out.println();
        }
    }
}




