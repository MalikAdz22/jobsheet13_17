import java.util.Scanner;

public class Kubus17 {

    private double sisi;

    public Kubus17(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Masukkan sisi kubus: ");
        double sisi = scanner.nextDouble();

        Kubus17 kubus = new Kubus17(sisi);
        double volume = kubus.hitungVolume();
        double luasPermukaan = kubus.hitungLuasPermukaan();

        System.out.println("Volume kubus dengan sisi " + sisi + " adalah " + volume);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah " + luasPermukaan);
    }
}