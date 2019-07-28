package javacp2560.lab6.part2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream(new File("src\\javacp2560\\lab6\\part2\\save.dat"));
        FileOutputStream out = new FileOutputStream("src\\javacp2560\\lab6\\part2\\save.dat");
        props.load(in);

        props.setProperty("highScore", "10000");
        props.setProperty("gamesPlayed", "87");
        props.setProperty("coins", "45");

        props.store(out, "Latest Game Save");

        props.list(System.out);

        out.close();
        in.close();
    }
}
