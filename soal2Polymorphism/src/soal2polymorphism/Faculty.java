/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2polymorphism;

/**
 *
 * @author ASUS
 */
public class Faculty extends Employee {
    private int officeHours;
    private String rank;
 

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateCreated, int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateCreated);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
    return "class Faculty, name : " +name + ", office Hours : " +officeHours +  ", Rank : " +rank;
    }
}



