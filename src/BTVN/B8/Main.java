package BTVN.B8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        emp.inputData(sc);
        emp.display();
    }
}
