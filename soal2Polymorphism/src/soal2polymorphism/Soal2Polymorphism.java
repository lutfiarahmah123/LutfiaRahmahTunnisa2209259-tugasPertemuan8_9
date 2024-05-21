/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2polymorphism;

import java.util.Date;



/**
 *
 * @author ASUS
 */
public class Soal2Polymorphism {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        Person person = new Person("Esa", "Cihanjuang", "0821-2836-2683", "Esa@gmail.com");
        Student student = new Student("Elsha", "ujung berung", "0827-3298-3837", "Elsha@gmail.com", Student.MahasiswaThnKedua);
        MyDate dateCreated = new MyDate(2024,01,01);
        Employee employee = new Employee("Citra", "Ujung Berung", "0812-2735-7538", "Citra@gmail.com", "A101", 30000000, dateCreated);
        Faculty faculty = new Faculty("Milen", "Cimahi", "0821-2834-2845", "Milen@gmail.com", "B202", 75000000, dateCreated, 10, "Professor");
        Staff staff = new Staff("Dewi", "ledeng", "0821-3748-8836", "Dewi@gmail.com", "C303", 80000000, dateCreated, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
