/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanuklsulit;

/**
 *
 * @author LOQ
 */

import java.util.Scanner;

public class Latihanuklsulit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PERHITUNGAN NILAI DAN MATRIKS ===");
        System.out.println("5. Hitung Rata-rata Nilai Siswa");
        System.out.println("6. Penjumlahan Dua Matriks");
        System.out.print("Masukkan pilihan (5 atau 6): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 5:
                hitungRataRataNilai(input);
                break;

            case 6:
                jumlahkanMatriks(input);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        input.close();
    }

    
    public static void hitungRataRataNilai(Scanner input) {
        System.out.print("\nMasukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("\nRata-rata nilai seluruh siswa adalah: " + rataRata);
    }

   
    public static void jumlahkanMatriks(Scanner input) {
        System.out.print("\nMasukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\nMasukkan elemen-elemen matriks pertama:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks1[" + i + "][" + j + "] = ");
                matriks1[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan elemen-elemen matriks kedua:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks2[" + i + "][" + j + "] = ");
                matriks2[i][j] = input.nextInt();
            }
        }

        // Penjumlahan dua matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        System.out.println("\nHasil penjumlahan dua matriks adalah:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            
                    }
}
}

    

