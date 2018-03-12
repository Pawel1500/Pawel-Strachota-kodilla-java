package com.kodilla.stream.beautifier;
public class StreamMain {
    public static void main(String[] args) {
        TextBeautifier textBeautifier = new TextBeautifier();

        System.out.println("Examples");
        String name=textBeautifier.toUpperText("Alan");
        System.out.println(name);

        String name1=textBeautifier.multiplyText("Alan");
        System.out.println(name1);

        String name2=textBeautifier.changeName("Alan");
        System.out.println(name2);

        String name3=textBeautifier.subText("Mateusz");
        System.out.println(name3);
    }
}
