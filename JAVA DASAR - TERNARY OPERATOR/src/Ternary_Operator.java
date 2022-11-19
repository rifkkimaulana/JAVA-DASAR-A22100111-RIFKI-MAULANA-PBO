/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * Ternary Operator
 * - Ternary operator adalah operator sederhana dari if steatmenet
 * - Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false maka nilai keuda diambil
 * 
 */
public class Ternary_Operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan COba Lagi";
        
        System.out.println(ucapan);
    }
    
}
