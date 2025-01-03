/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author LENOVO
 */
public class ACRumah {
    
public static void main(String[] args) {
        ACBeraksi ac = new ACBeraksi();

        // Menyalakan AC
        ac.hidupkanAC();

        // Mendinginkan ruangan
        ac.dinginkanAC();
        ac.dinginkanAC();

        // Memeriksa status AC dan suhu
        System.out.println("AC sedang " + (ac.isACOn() ? "nyala" : "mati"));
        System.out.println("Suhu ruangan: " + ac.getSuhu() + " derajat Celcius");
    }
}
