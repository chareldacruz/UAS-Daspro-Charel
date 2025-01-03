/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BANK;

/**
 *
 * @author LENOVO
 */
public class Bank {
    
private double saldo;

    // Konstruktor dengan parameter saldo
    public Bank(double saldoAwal) {
        if (saldoAwal < 0) {
            throw new IllegalArgumentException("Saldo awal tidak boleh negatif.");
        }
        this.saldo = saldoAwal;
    }

    // Metode untuk menyimpan uang
    public void simpanUang(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah yang disimpan harus positif.");
        }
        saldo += jumlah;
        System.out.println("Uang berhasil disimpan sebesar Rp " + jumlah);
    }

    // Metode untuk mengambil uang
    public void ambilUang(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah yang diambil harus positif.");
        }
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Uang berhasil diambil sebesar Rp " + jumlah);
        }
    }

    // Metode untuk mendapatkan saldo
    public double getSaldo() {
        return saldo;
    }
}

   