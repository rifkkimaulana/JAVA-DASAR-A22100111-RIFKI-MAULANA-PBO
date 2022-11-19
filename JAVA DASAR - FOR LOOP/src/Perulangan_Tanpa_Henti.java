/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * For loop
 * For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
 * block kode yang terdapat di dalah for akan selalu diulangi selama kondisi for terpenuhi
 * 
 * Syntak perulangan
 * for(ini statement;kondisi;post statement){
 * //block perulangan
 * }
 * 
 * > Init Statement akan dieksekusi hanya sekali di awal sebelum perulangan
 * > Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika galse perulangan akan berhenti
 * > post statement akan dieksekusi setiap kali diakhir pengulangan
 * > Init statement, kondisi dan post statement tidak wajib diisi, jika kondisi tidak diisi berarti kondisi selalu bernilai true.
 * 
 */
public class Perulangan_Tanpa_Henti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(;;){
            System.out.println("Perulangan Tanpa Henti");
        }
    }
    
}
