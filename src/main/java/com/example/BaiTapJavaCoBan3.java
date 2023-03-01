package com.example;

import java.util.Scanner;

public class BaiTapJavaCoBan3 {
    public static void main(String[] args) {
        float a, b, c;
        System.out.println("Nhap vao 3 so: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if (a+b>c && b+c>a && c+a>b) {
            System.out.println("Ba so dung la 3 canh cua 1 tam giac");
        }else {
            System.out.println("Ba so khong phai la 3 canh cua 1 tam giac");
        }
    }
}
