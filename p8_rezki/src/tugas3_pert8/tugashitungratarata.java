package tugas3_pert8;

import java.util.Scanner;

public class tugashitungratarata {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int realisasi = 0;
        float inc = 0;
        float totalSemua = 0;
        String jawaban = "";

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
            System.out.print("input kehadiran mahasiswa : ");
            int mahasiswaKehadiran = scanner.nextInt();

            System.out.print("input nilai tugas mahasiswa : ");
            int mahasiswaTugas = scanner.nextInt();
    
            System.out.print("input nilai uts mahasiswa : ");
            int mahasiswaUTS = scanner.nextInt();
    
            System.out.print("input nilai uas mahasiswa : ");
            int mahasiswaUAS = scanner.nextInt();
            
            float Presensi = mahasiswaKehadiran / realisasi * 10;
            float tugas = mahasiswaTugas * 20 / 100;
            float uts = mahasiswaUTS * 30 / 100;
            float uas = mahasiswaUAS * 40 / 100;
            float total = Presensi + tugas + uts + uas;
            totalSemua += total;
            inc++;
            
            System.out.println("jumlah nilai kamu semester ini : " + Math.round(total));
            System.out.println("ulangi atau tidak? y/n");
            jawaban = scanner.next();
            
        }while (jawaban.equals("y"));
        
        float rata = totalSemua / inc;
        System.out.println("rata rata total semua nilai : " + Math.round(rata));
        System.out.println("terimaksh");
    }
}
