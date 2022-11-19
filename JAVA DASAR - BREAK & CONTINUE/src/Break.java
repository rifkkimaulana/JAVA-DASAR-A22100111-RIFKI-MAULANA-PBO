/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * Pada Switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
 * Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan
 * Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya.
 * 
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
                    
                    if (counter > 10) {
                        break;
                    }
        }
    }
    
}
