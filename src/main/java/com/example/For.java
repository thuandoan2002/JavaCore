package com.example;

import java.util.ArrayList;
import java.util.List;

public class For {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setName("Ha");
        user.setAge(2);


        User user1 = new User();
        user1.setAge(3);
        user1.setName("Hoa");


        User user3 = new User();
        user3.setAge(4);
        user3.setName("Thuan");


        users.add(user);
        users.add(user1);
        users.add(user3);

        for (int i = 0; i < users.size(); i++) {
            User user2 = users.get(i);
            System.out.printf("age for: " + user2.getAge() + "\n");
            if (i == 1) {
                break;
            }
        }

        for (User user2 : users) {
            System.out.printf("age foreach: " + user2.getAge() + "\n");
            break;
        }
    }
}
