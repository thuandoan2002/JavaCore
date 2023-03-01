package com.example;

import javax.swing.table.TableRowSorter;
import java.util.Scanner;

public class BaiTapJavaCoBan8 {
    public static void main(String[] args) {
        int n;
        boolean soNguyenTo = false;
        System.out.printf("Nhap vao so nguyen to: ");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        System.out.printf("1, 2");
        for (int i =3; i <= n; i++) {
            soNguyenTo = true;
            for (int j = 2; j < i; j++) {
                if (i % j ==0) {

                    soNguyenTo = false;
                }
                if (soNguyenTo == true) {
                    System.out.printf(i + "");
                }
            }
        }
    }
}
