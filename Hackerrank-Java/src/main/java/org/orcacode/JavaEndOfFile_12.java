package org.orcacode;

import java.util.Scanner;

/**
 * Alireza Abolhasani
 * Hackerrank-Java
 * 11/27/2025
 */
public class JavaEndOfFile_12 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        sc.close();



//        Queue<String> qStr= new PriorityQueue<>();
//        try (Scanner in = new Scanner(System.in)) {
//            Queue<String> qstr = new PriorityQueue<String>();
//            while (in.hasNextLine()) {
//                System.out.printf("%d%s%s",i+1," ",qstr.poll());
//            }
//            int size = qstr.size();
//            for (int i= 0; i<size;i++) {
//                System.out.printf("%d%s%s",i+1," ",qstr.poll());
//                System.out.println();
//            }
//        }

    }
}
