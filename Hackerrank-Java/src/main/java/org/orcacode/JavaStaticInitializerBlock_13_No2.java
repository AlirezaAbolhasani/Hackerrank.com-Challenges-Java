package org.orcacode;

import java.util.Scanner;

/**
 * Alireza Abolhasani
 * Hackerrank-Java
 * 12/1/2025
 */
public class JavaStaticInitializerBlock_13_No2 {

    private static boolean flag = true;
    private static int B;
    private static int H;

    static{
        Scanner s = new Scanner(System.in);
        try{
            B = s.nextInt();
            H = s.nextInt();
            if(B<= 0 || H <= 0){
                flag = false;
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
        }catch(Exception a){
            System.out.print(a.getMessage());
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class


