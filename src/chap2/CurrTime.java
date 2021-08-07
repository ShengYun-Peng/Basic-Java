package chap2;

import java.io.PrintStream;

public class CurrTime {
    public static void main(String[] args) {
        long totalMill = System.currentTimeMillis();

        long totalSecond = totalMill / 1000;
        long currSecond = totalSecond % 60;

        long totalMinute = totalSecond / 60;
        long currMinute = totalMinute % 60;

        long totalHours = totalMinute / 60;
        long currHours = totalHours % 24;

        System.out.println("GMT: " + currHours + ":" + currMinute + ":" + currSecond);
    }
}
