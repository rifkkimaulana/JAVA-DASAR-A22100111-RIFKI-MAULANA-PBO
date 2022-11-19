/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * Kata Kunci Var
 * - Sejak versi java 10, java mendukung pembuatan variable dengan kata kunci var, sehingga kita tidak perlu menyebutkan tipe datanya
 * - Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable kita harus
 * menganisiasi value / nilai dari variable tersebut secara langsung
 * 
 */
public class Kata_Kunci_Var {
    public static void main (String args[]) {
        //var name; // error
        var name = "Rifki Maulana";
        
        var age = 38;
        var address = "Indonesia";
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        
    }
}
