/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2polymorphism;

/**
 *
 * @author ASUS
 */
public class Student extends Person {
    public static final String MahasiswaBaru = "MahasiswaBaru";
    public static final String MahasiswaThnKedua = "MahasiswaThnKedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
    return "class Student, name : " +name + ", Status : " +status;

    }
}


