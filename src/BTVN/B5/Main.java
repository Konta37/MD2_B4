package BTVN.B5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        do {
            System.out.print("Chuong trinh ");
            System.out.println("1. Nhap ten hoc sinh");
            System.out.println("2. Nhap lop hoc sinh");
            System.out.println("3. Hien thong tin hoc sinh");
            System.out.println("4. Thoat");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhap ten hoc sinh: ");
                    String studentName = sc.nextLine();
                    student.setStudentName(studentName);
                    break;
                case 2:
                    System.out.print("Nhap lop hoc sinh: ");
                    String studentClass = sc.nextLine();
                    student.setStudentClass(studentClass);
                    break;
                case 3:
                    System.out.println(student.display());
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
