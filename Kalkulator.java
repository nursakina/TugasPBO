package kalkulator;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        //kalkulator sederhana
        System.out.println("masukkan pilihan operator");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan pilihan anda: ");
        int pilihan = input.nextInt();
        
        System.out.println();
        System.out.println("masukkan bilangan 1: ");
        int bilangan1 = input.nextInt();
        System.out.println("masukkan bilangan 2: ");
        int bilangan2 = input.nextInt();
        
        
        if(pilihan == 1){
            int hasil = bilangan1 + bilangan2 ;
            System.out.println("Hasil penjumlahan bilangan : " + hasil);
        }else if (pilihan == 2){
            int hasil = bilangan1 + bilangan2 ;
            System.out.println("Hasil penjumlahan bilangan : " + hasil);
        }else if (pilihan == 3){
            int hasil = bilangan1 + bilangan2 ;
            System.out.println("Hasil penjumlahan bilangan : " + hasil);
        }else if (pilihan == 4){
            int hasil = bilangan1 + bilangan2 ;
            System.out.println("Hasil penjumlahan bilangan : " + hasil);
                  
        }
        
    }
    
}
