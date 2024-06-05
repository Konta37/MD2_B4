package BTVN.B4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fan fan = new Fan();
        boolean isTurn =false;
        int fanStatus = 1;
        do {
            if(!isTurn){
                System.out.println("Chuong trinh");
                System.out.println("1. Bat quat?");
                System.out.println("2. Doi mau");
                System.out.println("3. Doi ban kinh");
                System.out.println("4. Nhap toc do quat (1,2,3)");
                System.out.println("5. Hien trang thai quat");
                System.out.println("6. thoat");
            }else {
                System.out.println("Chuong trinh");
                System.out.println("1. Tat quat?");
                System.out.println("2. Doi mau");
                System.out.println("3. Doi ban kinh");
                System.out.println("4. Nhap toc do quat (1,2,3)");
                System.out.println("5. Hien trang thai quat");
                System.out.println("6. thoat");
            }

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if(!isTurn){
                        isTurn = true;
                        fan.setIsTurn(isTurn);
                        fan.setStatus(fanStatus);
                    }
                    else {
                        isTurn = false;
                        fan.setIsTurn(isTurn);
                        fan.setStatus(0);
                    }
                    break;
                case 2:
                    System.out.println("Nhap mau");
                    String fanColor = sc.nextLine();
                    fan.setColor(fanColor);
                    break;
                case 3:
                    System.out.println("Nhap ban kinh");
                    double fanRadius = Double.parseDouble(sc.nextLine());
                    fan.setRadius(fanRadius);
                    break;
                case 4:
                    System.out.println("Nhap toc do quat (1,2,3)");
                    fanStatus = Integer.parseInt(sc.nextLine());
                    if(fanStatus == 1 || fanStatus == 2 || fanStatus == 3){
                        fan.setStatus(fanStatus);
                    }else {
                        System.out.println("Ban nhap sai toc do quat");
                        fan.setStatus(0);
                    }
                    break;
                case 5:
                    System.out.println(fan.display());
                    break;
                case 6:
                    System.exit(0);
            }


        } while (true);
    }
}
