package com.kodilla.stream;

import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example lambda"));

    }
}
