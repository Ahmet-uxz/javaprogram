import java.util.Scanner;

public class KonversiSuhu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;

        System.out.printf("Suhu dalam Fahrenheit: %.2f%n", fahrenheit);

        scanner.close();
    }
}
