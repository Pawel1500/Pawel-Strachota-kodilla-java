package com.kodilla.stream.beautifier;

public class TextBeautifier {
    public String multiplyText(String name) {
        return "ABC"+name+"ABC";
    }

    public String addText(String name) {
        return name+"ABC";
    }

    public String toUpperText(String name) {

        return name.toUpperCase();
    }
    public String changeName(String name) {


        return name.replaceAll(name,"Zmiana Imienia");
    }
    public String subText(String name) {

        return name.substring(2,7);
    }

}
