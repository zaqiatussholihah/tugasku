/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daspro.antrianvaksinasi;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class DoubleLinkedListsMain {
    
    public static void main(String[] args) {
        DoubleLinkedLists antrianVaksinasi = new DoubleLinkedLists();
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        
        do {
            System.out.println("++++++++++++++++++++");
            System.out.println("Antrian vaksin zaqia");
            System.out.println("++++++++++++++++++++");
            System.out.println("1. Tambah data");
            System.out.println("2. Hapus data");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama penerima vaksin: ");
                    String nama = scanner.next();
                    antrianVaksinasi.add(nama);
                    break;
                case 2:
                    antrianVaksinasi.removeFirst();
                    break;
                case 3:
                    antrianVaksinasi.print();
                    break;
                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Menu yang Anda pilih tidak valid. Silakan pilih menu yang tersedia.");
                    break;
            }
            
            System.out.println();
        } while (menu != 4);
        
        scanner.close();
    }
    
}
