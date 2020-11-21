package com.mycompany.app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        int[] marks = {7, 8, 9, 3, 0, 11};
        String[] students = {"Alex", "Andrew", "Evgenyi", "Karina"};

        Arrays.sort(marks);
        Arrays.sort(students);

        for (int elem : marks) {
            System.out.println(elem + " ");
        }
        System.out.println();

        for (String student : students) {
            System.out.println(student + " ");

        }
    }

}
