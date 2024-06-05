package BTVN.B6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap myString :");
        String myString = sc.nextLine();
        MyClass myClass = new MyClass();
        myClass.setMyString(myString);
        System.out.println(myClass.display());
    }
}
