package javatest;

import java.util.Scanner;

public class ju {


private static Scanner sc;

public static void main(String[] args){
    sc = new Scanner(System.in);
    System.out.println("What is your name ? ");
    String str = sc.nextLine();      
    System.out.println("coucou" + " " + str);
   }
}