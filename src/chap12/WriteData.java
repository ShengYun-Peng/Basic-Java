package chap12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        // you can write to an existing file or a new file
        File file = new File("./src/chap12/test1.txt");
        System.out.println("The file exists: " + file.exists());

        PrintWriter output = new PrintWriter(file);
        output.print("write something ");
        output.println(13);

        output.close();
    }
}
