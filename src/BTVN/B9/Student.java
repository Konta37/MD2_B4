package BTVN.B9;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private boolean gender;
    private String address;
    private String phone;

    public Student() {
    }

    public Student(int id, String name, int age, boolean gender, String address, String phone) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData(Scanner sc){
        System.out.println("Enter student id: ");
        this.id = sc.nextLine();
        System.out.println("Enter student name: ");
        this.name = sc.nextLine();
        System.out.println("Enter student age: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter student gender: ");
        this.gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Enter student address: ");
        this.address = sc.nextLine();
        System.out.println("Enter student phone: ");
        this.phone = sc.nextLine();
    }
    public void display(){
        System.out.println("Sinh vien");
        System.out.println("Student ID: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student gender: " + gender);
        System.out.println("Student address: " + address);
        System.out.println("Student phone: " + phone);
    }
}
