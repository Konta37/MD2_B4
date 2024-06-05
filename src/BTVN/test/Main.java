package BTVN.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        book.inputData(sc);
        book.displayData();
    }
}
