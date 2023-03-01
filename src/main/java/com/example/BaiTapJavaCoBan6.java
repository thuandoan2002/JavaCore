package com.example;

import java.util.Scanner;

public class BaiTapJavaCoBan6 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.printf("Nhap vao so nguyen: ");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.printf("sum");
            }
        }
    }
}
