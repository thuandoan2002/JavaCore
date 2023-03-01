package com.example;

import java.util.Scanner;

public class BaiTapJavaCoBan2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao 1 so nguyen");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        switch (n) {
            case 0:
                System.out.println("Khong");
                break;
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
            case 6:
                System.out.println("Sau");
                break;
            case 7:
                System.out.println("Bay");
                break;
            case 8:
                System.out.println("Tam");
                break;
            case 9:
                System.out.println("Chin");
                break;
        }
    }
}
