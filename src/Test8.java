public class Test8 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                MULTIPLICATION_TABLE[i][j] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");

            }
            System.out.println();
        }
    }
}
