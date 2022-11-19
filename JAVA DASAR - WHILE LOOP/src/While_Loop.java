/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * While Loop adalah versi perulangan yang lebih sederhana dibanding for loop
 * Di while loop, hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement
 * 
 */
public class While_Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var counter = 1;
        
        while (counter <= 10) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
    }
    } 
}
