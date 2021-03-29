/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beratidealxirpl527setyo27;
import java.util.*;
/**
 *
 * @author Seth
 */
public class Beratidealxirpl527setyo27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilihan;
        double tinggi ,hasil;
        String nama;
        Scanner s = new Scanner(System.in);
        System.out.print("1. Laki-laki \n2. Perempuan \nPilih salah satu pilihan di atas : ");
        pilihan = s.nextInt();
        System.out.print("Masukan Nama Anda: ");
        nama = s.next();
        System.out.print("Masukan Tinggi Badan Anda: ");
        tinggi = s.nextDouble();
        System.out.println("Nama " + nama);
        switch (pilihan) {
            case 1:
                hasil = ((tinggi-100)-(0.1*(tinggi-100)));
                System.out.println("Jenis Kelamin Laki-laki");
                System.out.println("Berat Ideal = " + hasil);
                break;
            case 2:
                hasil = ((tinggi-100)-(0.15*(tinggi-100)));
                System.out.println("Jenis Kelamin Perempuan");
                System.out.println("Berat Ideal = " + hasil);
                break;
            default:
                System.out.println("Input Tidak diketahui");
                break;
        }
        
        
    }
    
}
