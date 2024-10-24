import java.util.Scanner;

public class teluryangdibeli {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
    System.out.print("Masukan (kg) telur yang dibeli: ");
    Double kiloTelur = inputan.nextDouble();

    System.out.print("Masukan Uang Bayar");
    Double uangBayar = inputan.nextDouble();

    double hargaTelur = kiloTelur * 28000;
    double kembalian = uangBayar - hargaTelur;

    System.out.println("Harga Telur per Kilogram: " + kembalian);
    }
}