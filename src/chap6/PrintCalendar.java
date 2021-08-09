package chap6;

import java.util.Scanner;

public class PrintCalendar {
    private static final int START_DAY_FOR_JAN_1_1800 = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter full year
        System.out.print("Please enter the year: ");
        int year = input.nextInt();

        // enter month
        System.out.print("Please enter the month between 1 and 12: ");
        int month = input.nextInt();

        // print the calendar
        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("\t\t" + getMonthName(month) + " " + year);
        System.out.println("----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year, int month) {
        int startDate = getStartDate(year, month);
        int totalDaysInMonth = getNumberOfDaysInMonth(year, month);
        for (int i = 0; i < startDate; ++i)
            System.out.print("\t");

        for (int i = 0; i < totalDaysInMonth; ++i) {
            if ((startDate + i + 1) % 7 == 0) {
                System.out.printf("%4d\n", i + 1);
            } else {
                System.out.printf("%4d", i + 1);
            }
        }
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }

        return monthName;
    }

    public static int getStartDate(int year, int month) {
        int totalDays = getTotalNumberOfDays(year, month) + START_DAY_FOR_JAN_1_1800;
        return totalDays % 7;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int numberOfDaysBetweenYears = 0;
        for (int i = 0; i < year - 1800; ++i) {
            if (isLeapYear(1800 + i))
                numberOfDaysBetweenYears += 366;
            else
                numberOfDaysBetweenYears += 365;
        }

        int numberOfDaysBetweenMonth = 0;
        for (int i = 1; i < month; ++i) {
            numberOfDaysBetweenMonth += getNumberOfDaysInMonth(year, i);
        }

        return numberOfDaysBetweenYears + numberOfDaysBetweenMonth;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 2)
            return (isLeapYear(year) ? 29 : 28);

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        return -1;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
    }
}
