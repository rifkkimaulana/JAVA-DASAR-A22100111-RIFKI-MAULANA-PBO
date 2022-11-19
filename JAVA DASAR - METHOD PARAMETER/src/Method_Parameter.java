/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * method Parameter
 * Kita bisa mengirim informasi ke method yang ingin kita panggil
 * Untuk melakukan hal tersebut, kita perlu menambahkan paremeter atau argument di method yang sudah kita buat
 * Cara membuat parameter sama seperti cara membuat variable
 * Parameter ditempatkan di dalam kurung() di deklarasi method
 * Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma
 * 
 */
public class Method_Parameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sayHello("Eko", "Khannedy");
        
    }
    static void sayHello(String firsName, String lastName){
        System.out.println("Hello " + firsName + " " + lastName);
        
    }
}
