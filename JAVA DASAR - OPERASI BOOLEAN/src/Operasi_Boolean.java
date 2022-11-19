/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 */
public class Operasi_Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 80;
        
        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;
        
        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
        
    }
    
}
