/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * Switch Steatment
 * - Kadang kfita hanya butuh menggunakan kondisi sederhana di if steatment, seperti hanya menggunakan perbandingan ==
 * - Switch adalah steatement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya
 * - kondisi di switch statement hanya untuk perbandingan ==
 * 
 */
public class Switch_Steatment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> System.out.println("Mungkin Anda Salah Jurusan");
                
                
        }
    }
    
}
