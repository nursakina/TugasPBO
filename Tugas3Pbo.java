// Nama   : Nursakina
// Nim    : D0221334
//kelas   : Infprmatika E

package tugas3pbo;

import java.util.Scanner;

public class Tugas3Pbo {

    public static void main(String[] args) {
           Scanner input = new Scanner (System.in);
           
    //Menghitung luas segitiga 
        int a, t;
        double luas ;
        
        System.out.println("Menghitung luas segitiga");
        System.out.println("===============================");
        
        System.out.println("Masukkan Alas = ");
        a = input.nextInt();
        System.out.println("Masukkan Tinggi = ");
        t = input.nextInt();
    
        luas = 0.5*a*t;
        System.out.println("Luas segitiga adalah = " + luas );
        
    //Menghitung luas lingkarang
       double r, L;
       final double phi = 3.14;
       System.out.println("Mencari luas Lingkarang");
       System.out.println("===============================");
       System.out.println("Masukkan jari-jari= ");
       r = input.nextDouble();
       L = phi*r*r;
       System.out.println("luas Lingkarang = " + luas);
       
    //Menghitung luas persegi panjang
        System.out.println("Menghitung Luas Persegi Panjang");

        System.out.println("===============================");
        System.out.print("Masukan Panjang = ");
        int p = input.nextInt();
        System.out.print("Masukan Lebar = ");
        int l = input.nextInt();
        int Luas = p*l;
        System.out.println("Luas Persegi Panjang Adalah= "+ Luas);
      
        
     
    }
    
}
