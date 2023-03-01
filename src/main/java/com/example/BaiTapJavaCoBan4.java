package com.example;

import java.util.Scanner;
import java.util.SortedMap;

public class BaiTapJavaCoBan4 {
    public static void main(String[] args) {

        float a, b, c;
        System.out.println("Nhap vao 3 so: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if (a*a+b==c*c || b*b+c*c==a*a || c*c+a*a==b*b) {
            System.out.println("Ba so dung la 3 canh cua 1 tam giac vuong");
        }else {
            System.out.println("Ba so khong phai la canh cua 1 tam giac vuong");
        }
    }
}
