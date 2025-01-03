/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author LENOVO
 */
public class BMI {
    
int beratbadan;
     double tinggibadan; 
     
   public BMI(int beratbadan, double tinggibadan)  {
       this.beratbadan = beratbadan;
       this.tinggibadan = tinggibadan / 100.0;
       
   } 
   
   public double hitungBMI() {
       return beratbadan / (tinggibadan * tinggibadan);
       
   }
   
   public String  kategoriBMI() {
       double bmi = hitungBMI();
       if (bmi < 18.5) {
           return "kurus";
   }else if (bmi >= 18.5 && bmi < 25) {
       return "ideal";
   }else if (bmi >=25 && bmi < 30){
       return "gemuk";
   }else {
       return "obsetasi";
   } 
   }
   
}
