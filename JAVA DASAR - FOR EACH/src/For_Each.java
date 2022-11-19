/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * For Each
 * Kadang kfita biasa mengakses data array menggunakan perulangan
 * Mengakses data arrat menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
 * Namun untungnya, di java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di array secara otomatis
 * 
 */
public class For_Each {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] array = {
            "Eko", "Kurniawan", "Khennedy",
            "Programmer", "Zaman", "Now"
        };
    for (var value : array) {
    System.out.println(value);
        }
    }
    
}
