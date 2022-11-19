/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * Kata Kunci Yield
 * Di java 14, ada kata kunci baru yaitu yield, doimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch steatment
 * ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement
 * 
 */
public class Switch_Tanpa_Yield {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan;
        
        switch (nilai) {
            case "A" -> ucapan = "Wow Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan ="Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default ->  ucapan = "Mungkin Anda Salah Jurusan";
        }
            System.out.println(ucapan);
            
                
                
        
    }
    
}
