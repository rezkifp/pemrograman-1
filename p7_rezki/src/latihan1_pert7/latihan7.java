package latihan1_pert7;

import java.util.Scanner;

public class latihan7 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("input kehadiran : ");
            int kehadiran = scanner.nextInt();
            
            System.out.print("input nilai akhir : ");
            int nilaiAkhir = scanner.nextInt();

            float minimal = ((kehadiran/21.0f) * 100);

            if (minimal >= 80){
                System.out.println("grade a");
            }else if (minimal >= 75){
                System.out.println("grade b");
            }else if (minimal >= 60){
                System.out.println("grade c");
            }else if (nilaiAkhir >= 55 && minimal >= 55){
                System.out.println("grade d");
            }else{
                System.out.println("tidak lulus");
            }
        }
    }
}
