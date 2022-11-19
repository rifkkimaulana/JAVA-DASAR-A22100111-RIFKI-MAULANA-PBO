/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 * OPERASI DI ARRAY
 * array[index] --> Mengambil data di array
 * array[index]=value --> Mengubah data di array
 * array.length --> mengambil panjang array
 * 
 */
public class Operasi_Di_Array {
    public static void main (String args[]) {
        long[] arrayLong = {
            10, 90, 80, 67, 29
        };
        
        arrayLong[0] = 100;
        
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);
        
    }
    
}
