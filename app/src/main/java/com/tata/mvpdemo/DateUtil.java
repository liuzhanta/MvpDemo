package com.tata.mvpdemo;

public class DateUtil {
    public static String format(long second) {
        if (second<=0) {
            return toDate("00","00","");
        }
        long timeLeft = second / 1000;

        // 00:00:02
        if (timeLeft < 60) {
            return toDate("00", "00", numberFormat(timeLeft));
        }

        // 00:12:02

        long min = timeLeft / 60;
        if (min < 60) {
            return toDate("00", numberFormat(min), numberFormat(timeLeft % 60));
        }

        long hour = min / 60;
        return toDate(numberFormat(hour), numberFormat(min % 60), numberFormat(timeLeft % 60));

    }

    private static String numberFormat(long number) {
        return String.valueOf(number < 10 ? "0" + number : number);
    }


    public static String toDate(String hour, String minute, String second) {
        String time = "%1$s:%2$s:%3$s";
        return String.format(time, hour, minute, second);
    }
}
