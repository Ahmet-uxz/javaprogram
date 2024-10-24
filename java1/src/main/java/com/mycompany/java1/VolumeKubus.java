import java.util.Scanner;

public class VolumeKubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        double volume = Math.pow(sisi, 3);

        System.out.println("Volume kubus dengan sisi " + sisi + " adalah: " + volume);
    }
}
