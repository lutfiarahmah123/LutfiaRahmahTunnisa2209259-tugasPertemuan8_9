/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2polymorphism;



/**
 *
 * @author ASUS
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateCreated;
    
     

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary,MyDate dateCreated) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateCreated = dateCreated;

    }

    @Override
    public String toString() {
        return "class Karyawan, name : " +name + ", Office : " + office + ", Salary: " + salary  + ", Office Date: " + dateCreated;
    }
}


