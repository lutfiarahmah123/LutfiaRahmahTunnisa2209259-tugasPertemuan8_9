/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1inheritance;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Soal1inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner isi = new Scanner(System.in);
       
       System.out.println("Add side 1 = ");
       double side1 = isi.nextDouble();
       System.out.println("Add side 2 = ");
       double side2 = isi.nextDouble();
       System.out.println("Add side 3 = ");
       double side3 = isi.nextDouble();
       
       System.out.println("Warna apa : ");
       String color = isi.next();
       
       System.out.println("segitiga terisi atau tidak : ");
       boolean filled = isi.nextBoolean();
       
       Segitiga segitiga = new Segitiga();
        System.out.println("Luas Segitiga " +segitiga.getArea());
        System.out.println("Keliling Segitiga " +segitiga.getPerimeter());
    }
}
