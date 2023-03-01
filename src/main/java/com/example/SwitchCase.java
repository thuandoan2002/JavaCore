package com.example;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 1;
        int age = 2;
        checkAge(age);
        switch (a) {
            case 1:
                System.out.printf("a = 1");
                break;  //tùy chọn
            case 2:
                System.out.printf("a = 2");
                break;  //tùy chọn
            case 3:
                System.out.printf("a = 3");
                break;  //tùy chọn
            default:
                System.out.printf("Khong xac dinh");
        }
    }

    public static void checkAge(int age) {
        switch (age) {
            case 2:
                System.out.printf("My age is 2 ");
                break;
            case 3:
                System.out.printf("My age is 3 ");
                break;
            default:
                System.out.printf("My age is not valid! ");
                break;

        }
    }

}
