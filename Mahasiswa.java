package TugasPBO5;
import java.util.Scanner;

public class Mahasiswa {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NPM     : ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa   : ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran  : ");
        double nk = input.nextInt();
        System.out.print("Nilai Tugas      : ");
        double tgs = input.nextDouble(); 
        System.out.print("Nilai UTS        : ");
        double uts = input.nextDouble(); 
        System.out.print("Nilai UAS        : ");
        double uas = input.nextDouble(); 
        
        double nilaiAkhir =  (0.10 * nk) + (0.20 * tgs) +(0.30 * uts) + (0.40 * uas);
        
        String grade;
        if (nilaiAkhir >= 76) {
            grade = "A";
        } else if (nilaiAkhir >= 66) {
            grade = "B";
        } else if (nilaiAkhir >= 56) {
            grade = "C";
        } else if (nilaiAkhir >= 46) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        String keterangan;
        if (nilaiAkhir >= 76) {
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            keterangan = "KURANG";
        } else {
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println(" \n");
        System.out.println("NPM Mahasiswa    : " +npm);
        System.out.println("Nama Mahasiswa   : " +nama);
        System.out.println("Nilai Rata-Rata  : " +nilaiAkhir);
        System.out.println("Grade            : " + grade);
        System.out.println("Keterangan       : " + keterangan);
    }
    
}
