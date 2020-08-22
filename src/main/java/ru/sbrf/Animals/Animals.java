package ru.sbrf.Animals;

public class Animals {
    private String a;
    private String a1;
    public static String Skill(String a, String a1) {
        if (a == "yes"){
            System.out.println(a1 + " " + "on");
        } else {
            System.out.println(a1 + " " + "off");
        }
        return a;
    }
}
