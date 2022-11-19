/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * Scope
 * Di java, variable hanya bisa diakses di dalam area dimana mereka dibuat
 * hal ini disebut scope
 * contoh, jika sebuah variabel dibuat di method, maka hanya bisa di akses di method tersebut, atau jika dibuat didalam block,
 * maka hanya bisa diakses di dalam block tersebut.
 * 
 */
public class Scope {
    public static void main(String args[]) {
        sayHello("Hello");
    }
    
   static void sayHello(String name) {
        String Hello = "Hello " + name;
        if (!name.isBlank()) {
            String hi = " Hi " + name;
            System.out.println(hi);
        }
        
        System.out.println(Hello);
        //System.out.println(hi); //error
    }
}
