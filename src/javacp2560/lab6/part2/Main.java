package javacp2560.lab6.part2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("src\\javacp2560\\lab6\\part2\\save.dat"));
    }
}
