package com.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = scanner.next();
        System.out.println(s);
        String news = s.replace(s.charAt(0), s.toUpperCase().charAt(0));
        System.out.println(news);
    }
}


//        System.out.printf("Hello and welcome!");
//        int i = 0;
//        for (; i < 10; i++) {
//         if(i%2==0)
//            System.out.println("i = " + i);
//        }

