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
        //define scanner
        Scanner keyboard = new Scanner(System.in);

        //variables
        String name = "";
        float age = 0.0f;
        //Input
        System.out.print("Enter your name: ");
       name = keyboard.nextLine();

        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        //output
        System.out.println();

        System.out.printf("You entered: %s",name);
        System.out.printf("\nYou entered %.2f \n",age);
    }
}
