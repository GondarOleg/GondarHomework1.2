package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        String intToString;
        do {
            System.out.println("Введи число разрядностью не меньше 2:");
            i = scanner.nextInt();
            intToString = String.valueOf(i);
        }
            while (intToString.length() < 2);

        System.out.println(firstDigitsSumm(intToString) == lastDigitsSumm(intToString) ? "true" : "false");

        System.out.println("Введи длину первого катета: ");
        int a = scanner.nextInt();
        System.out.println("Введи длину второго катета: ");
        int b = scanner.nextInt();
        System.out.println("Площадь = " + (a * b / 2) + "\nПериметр = " + (a + b + Math.sqrt(a*a + b*b)));


    }

    public static int firstDigitsSumm(String string){
        return Integer.valueOf(string.charAt(0)) + Integer.valueOf(string.charAt(1));
    }

    public static int lastDigitsSumm(String string){
        return Integer.valueOf(string.charAt(string.length() - 1)) + Integer.valueOf(string.charAt(string.length() - 2));
    }


    }
