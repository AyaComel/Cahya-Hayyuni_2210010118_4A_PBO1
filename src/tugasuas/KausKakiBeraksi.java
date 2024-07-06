package tugasuas;

import java.util.Scanner;

public class KausKakiBeraksi {
    public static void main(String[] args) {
        // Input/Output Sederhana
        try {
            Scanner scanner = new Scanner(System.in);

            // Array
            KausKakiDetail[] kaus = new KausKakiDetail[2];

            for (int i = 0; i < kaus.length; i++) {
                System.out.print("Masukkan merek kaus " + (i + 1) + ": ");
                String merek = scanner.nextLine();
                System.out.print("Masukkan jenis kaus " + (i + 1) + ": ");
                String jenis = scanner.nextLine();

                // Objek
                kaus[i] = new KausKakiDetail(merek, jenis);
            }

            for (KausKakiDetail kauskaki : kaus) {
                System.out.println("============");
                System.out.println("Detail Kaus: ");
                System.out.println(kauskaki.displayInfo());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan: Format tidak valid " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}