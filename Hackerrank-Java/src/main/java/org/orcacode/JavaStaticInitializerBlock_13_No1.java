package org.orcacode;

import java.util.Scanner;

/**
 * Alireza Abolhasani
 * Hackerrank-Java
 * 12/1/2025
 */
public class JavaStaticInitializerBlock_13_No1 {

    private static boolean flag = true;
    private static int B=initializeClassVariable();
    private static int H=initializeClassVariable();

    public static int initializeClassVariable(){
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        try{
            checkCondition(number);
        }catch(Exception s){
            flag = false;
            System.out.println(s.getMessage());
        }
        return number;
    }

    public static void checkCondition(int number){
        if (number <=0 ){
            throw new IllegalArgumentException("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class


