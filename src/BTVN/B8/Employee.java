package BTVN.B8;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int employeeAge;
    private boolean employeeSex;
    private double employeeRate;
    private double employeeSalary = 5000000;
    public Employee() {}

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double getEmployeeRate() {
        return employeeRate;
    }

    public void setEmployeeRate(double employeeRate) {
        this.employeeRate = employeeRate;
    }

    public boolean isEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(boolean employeeSex) {
        this.employeeSex = employeeSex;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void inputData(Scanner sc){
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextLine();
        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter Employee Age: ");
        employeeAge = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Employee Rate Salary: ");
        employeeRate = Double.parseDouble(sc.nextLine());
        this.CalSalary();
    }
    private void CalSalary(){
        this.employeeSalary = employeeRate * employeeSalary;
    }

    public void display(){
        System.out.printf("Employee ID: %s\n Age: %d\n rate Salary: %.2f salary: %.2f\n",employeeId,employeeAge,employeeRate,employeeSalary);
    }

}
