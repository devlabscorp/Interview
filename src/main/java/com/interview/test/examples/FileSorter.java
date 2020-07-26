package com.interview.test.examples;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.stream.Stream;

public class FileSorter {

    public boolean sortLinesByLength() throws Exception {
        String fileName = "/hello.txt";

        Path path = Paths.get(this.getClass().getResource(fileName).toURI());
        Stream<String> sortedStream = Files.lines(path).sorted(Comparator.comparingInt(String::length));

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardOpenOption.WRITE);) {
            sortedStream.forEach(str -> {
                try {
                    bufferedWriter.write(str);
                    bufferedWriter.write("\n");
                } catch (IOException e) {
                    System.out.println(e);
                }
            });
        }

        return true;


    }

    public static void main(String[] args) throws Exception {
        FileSorter fs = new FileSorter();
        fs.sortLinesByLength();
    }
}
