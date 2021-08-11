package chap7;

import java.util.Arrays;

public class TestCommandLine {
    public static void main(String[] args) {
        // use java chap7.TestCommandLine hello 1 2 3 to run the code
        System.out.println(Arrays.toString(args));
    }
}
