/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
 * Biasanya agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
 * Namun di Java, kita bisa menggunakan variable argument, untuk mengirim dat a yang berisi jumlah tak tentu, bisa nol atau lebih
 * Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
 * 
 */
public class Variable_Argument_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    }
    static void sayCongrats(String name, int...values) {
        int total = 0;
        for (var value : values) {
            total += value;
           
    }
        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Lulus");
            
        }
    }
}
