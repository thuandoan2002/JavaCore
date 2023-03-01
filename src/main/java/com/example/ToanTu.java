package com.example;

public class ToanTu {
    public static void main(String[] args) {
        int a = 22;
        int b = 5;
        int c = a % b;
        int d = a / b;
        System.out.printf(d + "\n");
        System.out.printf(c + "\n");
//        int e = ++b;
//        System.out.printf(e +"\n");
        int g = a * b;
        System.out.printf(g + "\n");
        int h = c + a * b ;
        System.out.printf(h + "\n");
        int i = (c + a) * b;
        System.out.printf(i + "\n");

    }
}
