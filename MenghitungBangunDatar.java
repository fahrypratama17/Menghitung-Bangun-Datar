package Modul_2

import java.util.Scanner;

public class MenghitungBangunDatar{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int pilihan, a, b, r;

        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.printf("%s\n\n", "3. Menghitung luas dan keliling segitiga");

        System.out.print("Pilihan anda: ");
        pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.print("Masukkan a: ");
                a = input.nextInt();
                System.out.print("Masukkan b: ");
                b = input.nextInt();

                int kelilingpersegipanjang = (a+b)*2;
                int luaspersegipanjang = a*b;

                System.out.printf("\n%-25s %c %d %s  \n", "Keliling persegi panjang", ':', kelilingpersegipanjang, "cm");
                System.out.printf("%-25s %c %d %s ", "Luas persegi panjang", ':', luaspersegipanjang, "cm2");
                break;
            case 2:
                System.out.print("Masukkan r: ");
                r = input.nextInt();

                int R = r*2;
                double kelilinglingkaran = 3.14*R;
                double luaslingkaran = 3.14*r*r;
                
                System.out.printf("\n%-20s %c %.2f %s \n", "Keliling lingkaran", ':', kelilinglingkaran, "cm");
                System.out.printf("%-20s %c %.2f %s ", "Luas lingkaran", ':', luaslingkaran, "cm2");
                break;
            case 3:
                System.out.print("Masukkan a: ");
                a = input.nextInt();
                System.out.print("Masukkan b: ");
                b = input.nextInt();
                System.out.print("Masukkan r: " );
                r = input.nextInt();

                int kelilingsegitiga = a+b+r;
                int luassegitiga = a*b/2;

                System.out.printf("\n%-20s %c %d %s\n", "Keliling segitiga", ':', kelilingsegitiga, "cm");
                System.out.printf("%-20s %c %d %s ", "Luas segitiga", ':', luassegitiga, "cm2");
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
        }
    }
}
