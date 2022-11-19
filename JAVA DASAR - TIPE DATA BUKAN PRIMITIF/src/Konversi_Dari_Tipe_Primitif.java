/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 */
public class Konversi_Dari_Tipe_Primitif {
    public static void main (String args[]) {
        int age = 30;
        
        Integer ageObject = age;
        
        int ageAgain = ageObject;
        
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
    }
    
}
