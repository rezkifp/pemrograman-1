package tugas1_pert8;

import java.util.Scanner;

public class tugasinputdowhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String jawaban = "";
        
        do {
            System.out.print("input nilai tugas mahasiswa : ");
            int mahasiswaTugas = scanner.nextInt();
    
            System.out.print("input nilai uts mahasiswa : ");
            int mahasiswaUTS = scanner.nextInt();
    
            System.out.print("input nilai uas mahasiswa : ");
            int mahasiswaUAS = scanner.nextInt();
            
            System.out.println("nilai tugas kamu :" + mahasiswaTugas);
            System.out.println("nilai uts kamu :" + mahasiswaUTS);
            System.out.println("nilai uas kamu :" + mahasiswaUAS);
            System.out.println("ulangi atau tidak? y/n");
            jawaban = scanner.next();
            
        }while (jawaban.equals("y"));
        
        System.out.println("terimaksh");
    }
}