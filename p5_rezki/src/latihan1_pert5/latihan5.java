package latihan1_pert5;

import java.util.Scanner;

public class latihan5 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("berat badan :");
            int BeratB = scanner.nextInt();
            
            System.out.print("tinggi badan:");
            int TinggiB = scanner.nextInt();

            float TinggiM = (float)TinggiB/100 ;
            float BMI = BeratB / (TinggiM * TinggiM);

            if (BMI < 18.5){
                System.out.println("Kamu kurus");
            } else if (BMI < 25.0) {
                System.out.println("Kamu normal");
            } else if (BMI < 30.0) {
                System.out.println("Kamu gemuk");
            } else {
                System.out.println("guede");
            }

        }
        
    }
    
}
