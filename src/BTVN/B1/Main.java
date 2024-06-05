package BTVN.B1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CaculatorCircle caculatorCircle = new CaculatorCircle();
        System.out.println("Nhập bán kính đường tròn: ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap mau cua duong tron:");
        String color = sc.nextLine();
        caculatorCircle.setRadius(radius);
        caculatorCircle.setColorCircle(color);

        System.out.println("hihi " + caculatorCircle.areaCircle(radius));
        System.out.println(caculatorCircle.display());
    }
}
