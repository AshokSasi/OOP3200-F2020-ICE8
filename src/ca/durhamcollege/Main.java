/*
*Name: Ashok Sasitharan
*Date: November 11 2020

 */

package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
       name = keyboard.nextLine();
        System.out.printf("You entered: %s",name);
    }
}
