package org.orcacode;

import java.io.*;
import java.lang.reflect.Field;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.GregorianCalendar;


/**
 * Alireza Abolhasani
 * Hackerrank-Java
 * 12/2/2025
 */
public class JavaDateandTime_15 {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        String strDay = " ";
        if (year > 2000 && year < 3000) {
            Calendar calendar = GregorianCalendar.getInstance();
            calendar.set(year, month - 1, day);
            calendar.setLenient(false);
//            calendar.getTime();
            switch (calendar.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.MONDAY:
                    strDay = "MONDAY";
                    break;
                case Calendar.TUESDAY:
                    strDay = "TUESDAY";
                    break;
                case Calendar.WEDNESDAY:
                    strDay = "WEDNESDAY";
                    break;
                case Calendar.THURSDAY:
                    strDay = "THURSDAY";
                    break;
                case Calendar.FRIDAY:
                    strDay = "FRIDAY";
                    break;
                case Calendar.SATURDAY:
                    strDay = "SATURDAY";
                    break;
                case Calendar.SUNDAY:
                    strDay = "SUNDAY";
                    break;
                default:
                    break;
            }
        }
        return strDay;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = JavaDateandTime_15.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}