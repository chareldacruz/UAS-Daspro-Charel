/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BMIBeraksi {
    
public static void main(String[] args) {
        Scanner kalkulator = new Scanner(System.in);
       
       System.out.println("berat badan (kg):");
       int beratbadan = kalkulator.nextInt();
       
       System.out.println("tinggi badan (cm):");
       int tinggibadan = kalkulator.nextInt();
       
             BMI bmiCalculator = new BMI (beratbadan, tinggibadan);
             
       double bmi = bmiCalculator.hitungBMI();
       System.out.printf("hasil bmi anda adalah : %.2f%n", bmi);
       System.out.println("kategori:" + bmiCalculator.kategoriBMI());
       
       kalkulator.close();
      
    }      
}