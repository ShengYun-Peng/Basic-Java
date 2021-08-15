package chap12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/chap12/test1.txt");
        Scanner input = new Scanner(file);
        // you can set different delimiters
        input.useDelimiter("s");

        while (input.hasNext()) {
            System.out.println(input.next());
        }

        input.close();
    }
}
