package latihan2_pert8;

import java.util.Scanner;

public class latihan8kedua {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float totalKehadiran;
        String jawaban = "";
        int realisasi = 0;
        
        System.out.print("input pilihan 2 sks/3 sks : ");
        int pilihan = scanner.nextInt();

        if (pilihan == 2){
            realisasi = 14;
        }else if (pilihan == 3){
            realisasi = 21;
        }else {
            System.out.println("pilih angka 2 dan 3 saja");
            return;
        }

        do {
            System.out.print("input kehadiran : ");
            int kehadiran = scanner.nextInt();
            
            totalKehadiran = ((float)kehadiran/realisasi) * 100;
            
            System.out.println("nilai kehadiran kamu :" + Math.round(totalKehadiran));
            System.out.println("ulangi atau tidak? y/n");
            jawaban = scanner.next();
            
        }while (jawaban.equals("y"));
        
        System.out.println("terimaksh");
    }
}