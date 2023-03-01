package com.example;

public class BienInstance {
    private int  age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void printlnAge() {
        System.out.printf("Age: " + age + "\n");
    }

    public void printlnAge1() {
        setAge(100);
        System.out.printf("Age: " + age + "\n");
    }

    public void subtract() {
        this.age = 1000;
    }


}
