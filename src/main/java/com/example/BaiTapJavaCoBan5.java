package com.example;

import java.util.Scanner;

public class BaiTapJavaCoBan5 {
    public static void main(String[] args) {
        String MSSV;
        System.out.println("Nhap vao MSSV");
        Scanner sc = new Scanner(System.in);

        MSSV = sc.nextLine();

        if (MSSV.matches("B\\d{7}")) {
            System.out.println("Phu hop");
        }else {
            System.out.println("Khong phu hop");
        }
    }
}