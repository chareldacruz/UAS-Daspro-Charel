/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematka;

/**
 *
 * @author LENOVO
 */
public class MatematikaBeraksi {
    
public static void main(String[] args) {
        Matematika hitung = new Matematika();

        int hasilTambah = hitung.pertambahan(125, 125);
        int hasilKurang = hitung.pengurangan(30, 25);
        int hasilKali = hitung.perkalian(10, 20);
        int hasilBagi = hitung.pembagian(21, 2);

        System.out.println("Pertambahan: 125+ 125 = " + hasilTambah);
        System.out.println("Pengurangan: 30- 25 = " + hasilKurang);
        System.out.println("Perkalian: 10 * 20 = " + hasilKali);
        System.out.println("Pembagian: 21 / 2 = " + hasilBagi);
    }
}
