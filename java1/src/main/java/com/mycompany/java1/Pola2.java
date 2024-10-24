public class Pola2 {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;

        for (int i = 1; i <= 4; i++) {
            count = 0;

            int batas = (i == 3) ? 4 : 5;

            while (count < batas) {

                if (num != 6 && num != 12 && num != 17 && num != 23) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
            System.out.println();
        }
    }
}
