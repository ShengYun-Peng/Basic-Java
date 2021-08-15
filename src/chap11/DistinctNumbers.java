package chap11;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int value = input.nextInt();
        while (value != 0) {
            if (!list.contains(value))
                list.add(value);
            value = input.nextInt();
        }

        System.out.println(list);
    }
}
