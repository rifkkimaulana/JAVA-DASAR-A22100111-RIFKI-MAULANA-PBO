
import static java.lang.Character.UnicodeScript.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Rifki Maulana
 */
public class Tanpa_Variable_Argument {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static void sayCongrats(String name, int[] value) {
        
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalVlaue = total / values.length;
        
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Lulus");
        }
    }
}
