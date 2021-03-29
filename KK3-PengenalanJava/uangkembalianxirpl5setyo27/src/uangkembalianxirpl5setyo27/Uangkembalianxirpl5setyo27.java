/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uangkembalianxirpl5setyo27;

import java.util.Scanner;

/**
 *
 * @author Seth
 */
public class Uangkembalianxirpl5setyo27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Uang : ");
        double JumlahUang = input.nextDouble();
        int hitung = (int)(JumlahUang/100000);
        int sisa = (int)(JumlahUang%100000);
        int hitung2 = sisa/50000;
        int sisa2 = (int)(JumlahUang%50000);
        int hitung3 = sisa2/20000;
        int sisa3 = (int)(JumlahUang%20000);
        int hitung4 = sisa3/10000;
        int sisa4 = (int)(JumlahUang%10000);
        int hitung5 = sisa4/5000;
        int sisa5 = (int)(JumlahUang%5000);
        int hitung6 = sisa5/1000;
        int sisa6 = (int)(JumlahUang%1000);
        int hitung7 = sisa6/500;
        int sisa7 = (int)(JumlahUang%500);
        int hitung8 = sisa7/200;
        int sisa8 = (int)(JumlahUang%200);
        int hitung9 = sisa8/100;
        int sisa9 = (int)(JumlahUang%100);
        
        
        System.out.println();
        System.out.println("Jumlah uang 100.000 sebanyak "+hitung);
        System.out.println("Jumlah uang 50.000 sebanyak "+hitung2);
        System.out.println("Jumlah uang 20.000 sebanyak "+hitung3);
        System.out.println("Jumlah uang 10.000 sebanyak "+hitung4);
        System.out.println("Jumlah uang 5.000 sebanyak "+hitung5);
        System.out.println("Jumlah uang 1.000 sebanyak "+hitung6);
        System.out.println("Jumlah uang 500 sebanyak "+hitung7);
        System.out.println("Jumlah uang 200 sebanyak "+hitung8);
        System.out.println("Jumlah uang 100 sebanyak "+hitung9);
        if (sisa9 < 100){
            System.out.println("Sisa " + sisa9);
        }
    }
        
}
