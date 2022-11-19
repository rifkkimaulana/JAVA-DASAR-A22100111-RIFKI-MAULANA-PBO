/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * Kata Kunci Final
 * - Secara default, variable di java bisa diubah-ubah nilainya
 * -Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertamakali dibuat, kita bisa menggunakan kata kunci final.
 * - Istilah variable ini bnayak juga yang menyebutnya konstan.
 * 
 */
public class Kata_Kunci_final {
    public static void main(String args[]) {
        final String name = "Rifki Maulana";
        var age = 18;
        var address = "Indonesia";
        
        //name = "Nama Diubah"
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
    
}
