package tugas1_pert7;

import java.util.Scanner;

public class tugas7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("pilih 2 sks / 3 sks :");
            int pilihan = scanner.nextInt();
            
            System.out.print("input kehadiran : ");
            int totalKehadiran = scanner.nextInt();
            
            System.out.print("input tugas : ");
            int tugas = scanner.nextInt();
            
            System.out.print("input uts : ");
            int uts = scanner.nextInt();
            
            System.out.print("input uas : ");
            int uas = scanner.nextInt();
            int realisasi = 0;
            
            if (pilihan == 2){
                realisasi = 14;
            }else if (pilihan == 3){
                realisasi = 21;
            }else{
                System.out.println("pilih 2 atau 3 saja");
            }

            float Presensi = ((float)totalKehadiran / realisasi) * 10;
            float Persen = ((float)totalKehadiran / realisasi) * 100;
            int TUGAS = tugas * 20 / 100;
            int UTS = uts * 30 / 100;
            int UAS = uas * 40 / 100;
            float TOTAL = Presensi + TUGAS + UTS + UAS;
            
            if (Persen < 75){
                System.out.println("ga lulus");
            }else{
                
                if (TOTAL >= 80){
                    System.out.println("grade a");
                }else if (TOTAL >= 75){
                    System.out.println("grade b");
                }else if (TOTAL >= 60){
                    System.out.println("grade c");
                }else if (UAS >= 55 && TOTAL >= 55){
                    System.out.println("grade d");
                }else{
                    System.out.println("tidak lulus");
                }
            }
            
            System.out.println("============");
            System.out.println("REALISASI = " + realisasi);
            System.out.println("Presensi = " + totalKehadiran);
            System.out.println("NILAI anda " + Math.round(TOTAL));
            System.out.println("============");
            
        }
    }