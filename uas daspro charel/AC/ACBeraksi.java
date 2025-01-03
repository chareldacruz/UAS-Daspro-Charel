/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author LENOVO
 */
public class ACBeraksi {
    
private boolean isOn; // Menunjukkan apakah AC menyala atau tidak
    private int suhu; // Menunjukkan suhu ruangan

    // Konstruktor untuk menginisialisasi nilai awal
    public ACBeraksi() {
        isOn = false; // Awalnya AC dalam keadaan mati
        suhu = 25; // Suhu awal ruangan (dalam derajat Celcius)
    }

    // Metode untuk menyalakan AC
    public void hidupkanAC() {
        isOn = true;
        System.out.println("AC dinyalakan.");
    }

    // Metode untuk mematikan AC
    public void matikanAC() {
        isOn = false;
        System.out.println("AC dimatikan.");
    }

    // Metode untuk menurunkan suhu AC
    public void dinginkanAC() {
        if (isOn) {
            suhu -= 2;
            System.out.println("Suhu diturunkan menjadi " + suhu + " derajat Celcius.");
        } else {
            System.out.println("AC belum dinyalakan.");
        }
    }

    // Metode untuk menaikkan suhu AC
    public void panaskanAC() {
        if (isOn) {
            suhu += 2;
            System.out.println("Suhu dinaikkan menjadi " + suhu + " derajat Celcius.");
        } else {
            System.out.println("AC belum dinyalakan.");
        }
    }

    // Metode untuk mendapatkan status AC (hidup atau mati)
    public boolean isACOn() {
        return isOn;
    }

    // Metode untuk mendapatkan suhu ruangan
    public int getSuhu() {
        return suhu;
    }
}
