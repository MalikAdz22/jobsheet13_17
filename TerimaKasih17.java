import java.util.Scanner;
public class TerimaKasih17 {
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan); 
    }
    public static void UcapanTerimakasih() {
        System.out.println("halo"); 
    }
 
    public static void main(String[] args) {
        UcapanTerimakasih();
        String ucapan = "terima kasih Pak... Bu... Semoga sehat selalu";
        UcapanTambahan(ucapan);
    }
}