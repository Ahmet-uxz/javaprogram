public class Pola5 {
    public static void main(String[] args) {
        char[][] array = {
            {'*'},
            {'0'},
            {'*', '*'},
            {'0', '1'},
            {'*', '*', '*'},
            {'0', '1', '2'}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
