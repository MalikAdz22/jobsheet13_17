import java.util.Scanner;

public class Tugas17 {

    public static void main(String[] args) {
        int[][] nilaiTugas = new int[5][7];

        System.out.println("=== Input Data Nilai Mahasiswa ===");
        inputDataNilaiMahasiswa(nilaiTugas);

        System.out.println("=== Menampilkan Seluruh Nilai Mahasiswa ===");
        tampilSeluruhNilaiMahasiswa(nilaiTugas);

        System.out.println("=== Mencari Hari dengan Nilai Tertinggi ===");
        hariNilaiTertinggi(nilaiTugas);

        System.out.println("=== Menampilkan Mahasiswa dengan Nilai Tertinggi ===");
        mahasiswaNilaiTertinggi(nilaiTugas);
    }

    public static void inputDataNilaiMahasiswa(int[][] nilaiTugas) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.println("=== Input Data Nilai Mahasiswa ke-" + (i + 1) + " ===");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Nilai tugas minggu ke-" + (j + 1) + " : ");
                nilaiTugas[i][j] = scanner.nextInt();
            }
        }
    }


    public static void tampilSeluruhNilaiMahasiswa(int[][] nilaiTugas) {
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.println("=== Data Nilai Mahasiswa ke-" + (i + 1) + " ===");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print(nilaiTugas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void hariNilaiTertinggi(int[][] nilaiTugas) {
        int nilaiTertinggi = nilaiTugas[0][0];
        int hariNilaiTertinggi = 0;

        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTertinggi < nilaiTugas[i][j]) {
                    nilaiTertinggi = nilaiTugas[i][j];
                    hariNilaiTertinggi = j + 1;
                }
            }
        }

        System.out.println("Nilai tertinggi adalah " + nilaiTertinggi + ", terdapat pada hari ke-" + hariNilaiTertinggi);
    }

    public static void mahasiswaNilaiTertinggi(int[][] nilaiTugas) {
        int nilaiTertinggi = nilaiTugas[0][0];
        String namaMahasiswaNilaiTertinggi = "";

        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTertinggi < nilaiTugas[i][j]) {
                    nilaiTertinggi = nilaiTugas[i][j];
                    namaMahasiswaNilaiTertinggi = "Mahasiswa ke-" + (i + 1) + ", minggu ke-" + (j + 1);
                }
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + namaMahasiswaNilaiTertinggi);
    }
}