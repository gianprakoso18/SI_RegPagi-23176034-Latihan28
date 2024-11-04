/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan28;

/**
 *
 * @author gianp
 * NAMA     : Gian Prakoso
 * KELAS    : Sistem Informasi
 * NIM      : 23176034
 */
import java.util.Scanner;

public class Latihan28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kalimat dari pengguna
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        // Input kata yang ingin diganti
        System.out.print("Ganti Kata: ");
        String kataLama = scanner.nextLine();

        // Input kata baru
        System.out.print("Menjadi Kata: ");
        String kataBaru = scanner.nextLine();

        // Mengganti kata lama dengan kata baru
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        // Menampilkan hasil
        System.out.println("\n==== Hasil Formatting ====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);

        scanner.close();
    }
}