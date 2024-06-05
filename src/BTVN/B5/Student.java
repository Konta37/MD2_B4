package BTVN.B5;

public class Student {
    private String studentName = "John";
    private String studentClass  = "C02";
    public Student() {}
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String studentName(){
        return studentName;
    }
    public void setStudentClass(String studentClass){
        this.studentClass = studentClass;
    }
    public String studentClass(){
        return studentClass;
    }
    public String display(){
        return "Student Name: " + studentName + " Student Class: " + studentClass;
    }

}
