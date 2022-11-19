/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * Do While Loop
 * Do While Loop adalah perulangan yang mirip dengan while
 * perbedaanya hanya pada pengecekan kondisi
 * pengeceaan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di 
 * do whileloop dilakukakan setelah perulangan dilakukan
 * Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true
 * 
 */
public class Do_While_Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var counter = 100;
        
        do {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        } while (counter <= 10);
    }
    
}
