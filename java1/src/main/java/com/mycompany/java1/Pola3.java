public class Pola3 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4, 5},
            {20, 19, 18, 17, 16},
            {6, 7, 8, 9, 10},
            {15, 14, 13, 12, 11}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
