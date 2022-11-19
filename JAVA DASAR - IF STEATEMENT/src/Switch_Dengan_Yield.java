/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 *
 */
public class Switch_Dengan_Yield {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan = switch (nilai) {
            case "A":
                yield "Wow Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan);
    }
}
