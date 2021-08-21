package chap20;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringByLength {
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
        Arrays.sort(cities, new myComparator());
        System.out.println(Arrays.toString(cities));
    }
}

class myComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}
