package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void calculator() throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String s = reader.readLine();
        if(s.contains("+")){
            String[] numbers = s.split("\\+");
            int a,b;
            if(s.contains("I")||s.contains("V")||s.contains("X")){
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if(a>0 & a<=10 & b>0 & b<=10){
                    System.out.println("Output: " + ArabicConvert.arabicToRoman(a+b));
                }else {
                    throw new IOException("На вход доступны числа только от 1 до 10");
                }

            }else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if(a >0 & a <=10 & b>0 & b<=10){
                    System.out.println("Output: " + (a+b));
                }else {
                    throw new IOException("На вход доступны числа только от 1 до 10");
                }
            }
        }else if (s.contains("-")) {
            String[] numbers = s.split("\\-");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Output: " + ArabicConvert.arabicToRoman(a - b));
                } else {
                    throw new IOException("Доступны только числа от 1 до 10");
                }
            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Output: " + (a - b));
                } else {
                    throw new IOException("Доступны только числа от 1 до 10");
                }
            }
        } else if (s.contains("*")) {
            String[] numbers = s.split("\\*");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Output: " + ArabicConvert.arabicToRoman(a * b));
                } else {
                    throw new IOException("Доступны только числа от 1 до 10");
                }
            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Output: " + (a * b));
                } else {
                    throw new IOException("Доступны только числа от 1 до 10");
                }
            }
        } else if (s.contains("/")) {
            String[] numbers = s.split("\\/");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Output: " + ArabicConvert.arabicToRoman(a / b));
                } else {
                    throw new IOException("Доступны только числа от 1 до 10");
                }
            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Output: " + (a / b));
                } else {
                    throw new IOException("Доступны только числа от 1 до 10");
                }
            }
        }
    }

}
