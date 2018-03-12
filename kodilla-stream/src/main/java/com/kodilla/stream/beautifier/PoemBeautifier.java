package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String name, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(name);
        System.out.println(result);
    }

}
