public class Pola4 {
    public static void main(String[] args) {
        int[][] array = {
            {-1, 0, -1, 0, -1},
            {0, -1, 0, -1, 0},
            {-1, 0, -1, 0, -1},
            {0, -1, 0, -1, 0}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
