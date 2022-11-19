/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * ELSE IF STEATMENT
 * - Blok if akan dieksekusi ketika kondisi if bernilai true
 * - Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
 * - Hal ini bisa dilakukan menggunakan else expression
 * 
 */
public class Else_If_Steatment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;
        
        if (nilai >= 75 && absen >= 75) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
            
        }
    }
    
}
