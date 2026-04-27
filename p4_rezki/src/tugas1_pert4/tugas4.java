package tugas1_pert4;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Jumlah Pertandingan : ");
            int JumlahPertandingan = scanner.nextInt();
            
            System.out.print("Win Rate : ");
            int WinRate = scanner.nextInt();
            
            System.out.print("Target Win Rate : ");
            int TargetWinRate = scanner.nextInt();
            
            int totalWin = (int) Math.round(JumlahPertandingan * ( WinRate/100.0));
            int X = (TargetWinRate * JumlahPertandingan - WinRate * JumlahPertandingan) / (100 - TargetWinRate);
            
            System.out.println("============");
            System.out.println("Anda Win Sebanyak " + totalWin + " kali");
            System.out.println("Anda membutuhkan " + X + " Match untuk mencapai " + TargetWinRate + "%");
            
        }
    }
}
