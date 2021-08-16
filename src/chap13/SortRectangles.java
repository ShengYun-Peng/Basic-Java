package chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortRectangles {
    public static void main(String[] args) {
        ComparableCircle[] circles = {new ComparableCircle(4), new ComparableCircle(3.2),
                new ComparableCircle(3.1), new ComparableCircle(1), new ComparableCircle(1)};
        ArrayList<ComparableCircle> list = new ArrayList<>(Arrays.asList(circles));
        Arrays.sort(circles);
        for (ComparableCircle e : circles)
            System.out.println(e);
        System.out.println();

        Collections.sort(list);
        System.out.println(list);

        System.out.println(circles[0].equals(circles[1]));
    }
}
