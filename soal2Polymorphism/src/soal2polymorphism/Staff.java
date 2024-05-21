/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2polymorphism;



/**
 *
 * @author ASUS
 */
public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateCreated, String title) {
        super(name, address, phoneNumber, email, office, salary, dateCreated);
        this.title = title;
    }

    @Override
    public String toString() {
        return "class Staff, name : " +name + ", Title : " + title;

    }
    }


