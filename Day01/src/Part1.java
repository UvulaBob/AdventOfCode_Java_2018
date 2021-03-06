import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Part1 {

    public static void main(String[] args) throws IOException{
        int total = 0;
        List<String> lines = Files.readAllLines(Paths.get(new File("").getAbsolutePath() + "\\src\\input.txt"));

        for (String line : lines) {
            total += Integer.parseInt(line);
        }


        System.out.println("Total: " + total);
        System.out.println("Done!");
    }
}
