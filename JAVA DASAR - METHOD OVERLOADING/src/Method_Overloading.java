/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * 
 * Method Overloading
 * Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
 * Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda entah jumalah atau tipe data parameternyba
 * Jika ada yang sama, maka program Java error
 * 
 */
public class Method_Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static void sayHello() {
        System.out.println("Hello");
    }
    
    static void sayHello(String firsName) {
        System.out.println("Hello " + firsName);
    }
    
    static void sayHello (String firsName, String lastName) {
        System.out.println("Hello " + firsName + " " + lastName);
    }
    
}
