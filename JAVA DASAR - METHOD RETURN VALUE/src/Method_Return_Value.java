
import static javax.management.Query.value;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah method mengembalikan nilai
 * Agar method bisa menghasilkan value maka kita harus mengubah kata kunci void fengan tipe data yang dihasilkan
 * Dan di dalam block method untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
 * Di java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu
 * 
 */
public class Method_Return_Value {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = sum(a, b);
        
        System.out.println(c);
    }
    
    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }
    
}
