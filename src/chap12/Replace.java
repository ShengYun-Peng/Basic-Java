package chap12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Wrong args number, should be 4");
            System.exit(1);
        }

        // javac ./chap12/Replace.java
        // java chap12.Replace ./chap12/replace.txt ./chap12/result.txt StringBuilder StringBuffer
        File sourceFile = new File(args[0]);
        File targetFile = new File(args[1]);

        try {
            Scanner input = new Scanner(sourceFile);
            PrintWriter output= new PrintWriter(targetFile);
            while (input.hasNext()) {
                String line = input.nextLine();
                line = line.replaceAll(args[2], args[3]);
                output.println(line);
            }
            output.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
