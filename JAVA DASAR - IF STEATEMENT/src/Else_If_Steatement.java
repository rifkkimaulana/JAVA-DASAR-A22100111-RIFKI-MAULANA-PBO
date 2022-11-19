/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * Else If Steatement
 * - Kada dalam if, kita butuh memkbuat beberapa kondisi
 * - Kasus seperti ini, di java kita bisa menggunakan Else if Expression
 * - Else if di jaca bisa lebih dari satu
 * 
 */
public class Else_If_Steatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;
        
        if (nilai >= 80 && absen > 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
    
}
