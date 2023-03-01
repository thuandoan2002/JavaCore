package practice;

import java.util.Scanner;

public class Bai1 {
    //Nhập dữ liệu từ bàn phím a và b
    // Tính tổng 2 số
    //Tính hiệu của 2 số
    // Tính tích của 2 số
    // Tính thương của 2 số

    public static void main(String[] args) {
        methodB();

    }

    public static void methodA() {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        while (true) {

            int c;
            System.out.printf("Moi ban chon  chuc nang: \n");
            System.out.printf("------------------------ \n");
            System.out.printf("0: Nhap 2 gia tri \n");
            System.out.printf("1: Tinh tong so a va b \n");
            System.out.printf("2: Tinh hieu so a va b \n");
            System.out.printf("3: Tinh tich so a va b \n");
            System.out.printf("4: Tinh thuong so a va b \n");
            System.out.printf("5: Thoat chuong trinh \n");
            c = sc.nextInt();
            if (c == 0) {
                System.out.printf("Moi ban nhap so a: \n");
                a = sc.nextInt();
                System.out.printf("Moi ban nhap so b: \n");
                b = sc.nextInt();
            } else if (c == 1) {
                int tong = a + b;
                System.out.printf("Tong 2 so a va b la: " + tong + "\n");
            } else if (c == 2) {
                int hieu = a - b;
                System.out.printf("Hieu 2 so a va b la: " + hieu + "\n");
            } else if (c == 3) {
                int tich = a * b;
                System.out.printf("Tich 2 so cua a va b la : " + tich + "\n");
            } else if (c == 4) {
                int thuong = a / b;
                System.out.printf("Thuong 2 so a va b la: " + thuong + "\n");
            } else if (c == 5) {
                System.exit(0);
            }
        }
    }

    public static void methodB() {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        while (true) {

            int c;
            System.out.printf("Moi ban chon  chuc nang: \n");
            System.out.printf("------------------------ \n");
            System.out.printf("0: Nhap 2 gia tri \n");
            System.out.printf("1: Tinh tong so a va b \n");
            System.out.printf("2: Tinh hieu so a va b \n");
            System.out.printf("3: Tinh tich so a va b \n");
            System.out.printf("4: Tinh thuong so a va b \n");
            System.out.printf("5: Thoat chuong trinh \n");
            c = sc.nextInt();

            switch (c) {
                case 0:
                    System.out.printf("Moi ban nhap so a: \n");
                    a = sc.nextInt();
                    System.out.printf("Moi ban nhap so b: \n");
                    b = sc.nextInt();
                    break;
                case 1:
                    int tong = a + b;
                    System.out.printf("Tong 2 so a va b la: " + tong + "\n");
                    break;  //tùy chọn
                case 2:
                    int hieu = a - b;
                    System.out.printf("Hieu 2 so a va b la: " + hieu + "\n");
                    break;  //tùy chọn
                case 3:
                    int tich = a * b;
                    System.out.printf("Tich 2 so cua a va b la : " + tich + "\n");
                    break;  //tùy chọn
                case 4:
                    int thuong = a / b;
                    System.out.printf("Thuong 2 so a va b la: " + thuong + "\n");
                    break;  //tùy chọn
                case 5:
                    System.exit(0);
                    break;  //tùy chọn
                default:
                    System.out.printf("Khong xac dinh");
            }
        }

    }
}
