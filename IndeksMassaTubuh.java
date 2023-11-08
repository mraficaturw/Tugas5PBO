package TugasPBO5;
import java.util.Scanner;

public class IndeksMassaTubuh {

    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
        
        System.out.println("+================================+");
        System.out.println("|    NILAI IMT    |  KRITERIA    |");
        System.out.println("+================================+");
        System.out.println("|      <18.4      | Kurang       |");
        System.out.println("|   18.5 - 24.9   | Ideal        |");
        System.out.println("|   25.0 - 29.9   | Lebih        |");
        System.out.println("|   30.0 - 39.9   | Gemuk        |");
        System.out.println("|      >40.0      | Sangat Gemuk |");
        System.out.println("+================================+");
        
        System.out.print("Masukkan Berat Badan (kg): ");
        float bb = input.nextFloat();

        System.out.print("Masukkan Tinggi Badan (m): ");
        float tb = input.nextFloat();

        float imt = bb / (tb * tb);
        
        String kriteria;
        if (imt < 18.5){
            kriteria = "Berat Badan Kurang";
        }else if(imt >= 18.5 && imt < 25){
            kriteria = "Berat Badan Ideal";
        }else if(imt >= 25 && imt < 30){
            kriteria = "Berat Badan Lebih";
        }else if(imt >= 30 && imt < 40){
            kriteria = "Gemuk";
        }else{
            kriteria = "Sangat Gemuk";
        }
        
        System.out.println("IMT Anda adalah          : " + imt);
        System.out.println("Kriteria                 : " + kriteria);
    }
    
}