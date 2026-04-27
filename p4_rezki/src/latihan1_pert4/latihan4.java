package latihan1_pert4;

import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("input realisasi : ");
            int realisasi = scanner.nextInt();
            
            System.out.print("input kehadiran : ");
            int kehadiran = scanner.nextInt();
            
            System.out.print("input tugas : ");
            int tugas = scanner.nextInt();
            
            System.out.print("input uts : ");
            int uts = scanner.nextInt();
            
            System.out.print("input uas : ");
            int uas = scanner.nextInt();
            
            float Presensi = kehadiran / realisasi * 10;
            float TUGAS = tugas * 20 / 100;
            float UTS = uts * 30 / 100;
            float UAS = uas * 40 / 100;
            float TOTAL = Presensi + TUGAS + UTS + UAS;
            
            System.out.println("============");
            System.out.println("REALISASI = " + realisasi);
            System.out.println("Presensi = " + kehadiran);
            System.out.println("NILAI anda " + TOTAL);
            
        }
    }
}