package com.example;

import java.util.Scanner;

public class BaiTapJavaCoBan1 {

    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao 1 so nguyen: ");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        if (n >= 0) {
            System.out.println("Day la 1 so nguyen duong");
        }else {
            System.out.println("Day la 1 so nguyen am");
        }
    }
}
