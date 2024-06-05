package BTVN.B2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a cua phuong trinh bac 2: ");
        double number1 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap b: ");
        double number2 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap c: ");
        double number3 = Double.parseDouble(sc.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(number1);
        quadraticEquation.setB(number2);
        quadraticEquation.setC(number3);
//        System.out.println(quadraticEquation.check());
//        System.out.println(quadraticEquation.getDiscriminant());
        System.out.println(quadraticEquation.check());
    }
}
