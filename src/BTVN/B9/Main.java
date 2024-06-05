package BTVN.B9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<Student>();
        do {


            System.out.println("=======Program=======");
            System.out.println("Enter your choice : ");
            System.out.println("1. Add new student");
            System.out.println("2. Edit student");
            System.out.println("3. Show all students");
            System.out.println("4. Delete student");
            System.out.println("5. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Student student = new Student();
                    System.out.println("Enter student id : ");
                    String id = sc.nextLine();
                    student.setId(id);
                    System.out.println("Enter student name : ");
                    String name = sc.nextLine();
                    student.setName(name);
                    System.out.println("Enter student age : ");
                    int age = Integer.parseInt(sc.nextLine());
                    student.setAge(age);
                    System.out.println("Enter student gender : ");
                    boolean gender = Boolean.parseBoolean(sc.nextLine());
                    student.setGender(gender);
                    System.out.println("Enter student address : ");
                    String address = sc.nextLine();
                    student.setAddress(address);
                    System.out.println("Enter student phone number : ");
                    String phone = sc.nextLine();
                    student.setPhone(phone);
                    studentsList.add(student);
                    break;
                case 2:
                    System.out.println("Enter student id to edit:");
                    id = sc.nextLine();
                    for(int i = 0; i<studentsList.size(); i++){
                        if(studentsList.get(i).getId().equals(id)){
                            System.out.println("Enter student name : ");
                            name = sc.nextLine();
                            studentsList.get(i).setName(name);
                            System.out.println("Enter student age : ");
                            age = Integer.parseInt(sc.nextLine());
                            studentsList.get(i).setAge(age);
                            System.out.println("Enter student gender : ");
                            gender = Boolean.parseBoolean(sc.nextLine());
                            studentsList.get(i).setGender(gender);
                            System.out.println("Enter student address : ");
                            address = sc.nextLine();
                            studentsList.get(i).setAddress(address);
                            System.out.println("Enter student phone number : ");
                            phone = sc.nextLine();
                            studentsList.get(i).setPhone(phone);
                        }
                    }
                    break;
                case 3:
                    for (Student student1 : studentsList) {
                        student1.display();
                    }
                    break;
                case 4:
                    System.out.println("Enter student id to delete:");
                    id = sc.nextLine();
                    for(int i = 0; i<studentsList.size(); i++){
                        if(studentsList.get(i).getId().equals(id)){
                            studentsList.remove(i);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
            }

        }while(true);

    }
}
