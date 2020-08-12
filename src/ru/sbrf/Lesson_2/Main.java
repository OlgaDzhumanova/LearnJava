package ru.sbrf.Lesson_2;


import static java.lang.Character.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        byte a = 118;
        short b = 12345;
        int Sum = (byte) (a + b);
        System.out.println(Sum);

        int c = 123456;
        long x = 1122334455;
        int Sub = (int) (c * x);
        System.out.println(Sub);
    }
}
class isChar {
    public static char isChar() {
        char isCharA = '9';
        if (isCharA == 'A') {
            System.out.println("true");
        } else {
            System.out.println("false");
            return isCharA;
        }

        char isCharNumber = 'R';
        if ((isCharNumber >= 48) & (isCharNumber <= 57)) {
            System.out.println("true");
        } else {
            System.out.println("false");
            return isCharNumber;
        }
        return isCharA;
    }

        class Ing {

            public void Ing() {
                int Ing;
                for (Ing = 0; Ing <= 30; Ing += 1) ;
                System.out.println(Integer.toBinaryString(Ing));

                System.out.println(Integer.toBinaryString(MAX_VALUE));
                System.out.println(Integer.toBinaryString(MAX_VALUE + 1));
            }

            public void CharNum() {
                char Num = 'g';
                System.out.println((int) Num);

                int Sub = 85;
                System.out.println((char) Sub);
            }

            public int getMaxNumber() {
                int getMaxNumber = Math.max(52, 98);
                System.out.println(getMaxNumber);
                return getMaxNumber;
            }
        }
    }
