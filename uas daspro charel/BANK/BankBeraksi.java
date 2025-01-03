/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BANK;

/**
 *
 * @author LENOVO
 */
public class BankBeraksi {
    
public static void main(String[] args) {
        // Membuat objek Bank dengan saldo awal Rp 100.000
        Bank bankku = new Bank(100000);

        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp " + bankku.getSaldo());

        // Menyimpan uang
        bankku.simpanUang(500000);

        // Mengambil uang
        bankku.ambilUang(150000);

        System.out.println("Saldo akhir: Rp " + bankku.getSaldo());
    }
}

