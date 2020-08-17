package ru.sbrf.Lesson_2;


import static java.lang.Character.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        byte a = 115;
        short b = 12345;
        int c = 123456;
        long f = 1122334455;
        System.out.println((byte) (a + b));
        System.out.println((int) (c * f));
    }

    public static char isChar() {
        char e = 'n';
        System.out.println((e == 'A') ? ("true") : ("false"));
        return e;
    }

    public static char isCharNumber() {
        char e = '9';
        System.out.println(((e >= 48) & (e <= 57)) ? ("true") : ("false"));
        return e;
    }

    public static void Ing() {
        int Ing;
        for (Ing = 0; Ing <= 30; Ing += 1) ;
        System.out.println(Integer.toBinaryString(Ing));

        System.out.println(Integer.toBinaryString(MAX_VALUE));
        System.out.println(Integer.toBinaryString(MAX_VALUE + 1));
    }

    public static void CharNum() {
        int Sub = 85;
        char Num = 'g';
        System.out.println((int) Num);
        System.out.println((char) Sub);

    }

    public static int getMaxNumber() {
        int getMaxNumber = Math.max(52, 98);
        System.out.println(getMaxNumber);
        return getMaxNumber;


    }
}