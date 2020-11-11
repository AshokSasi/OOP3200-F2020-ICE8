/*
*Name: Ashok Sasitharan
*Date: November 11 2020

 */

package ca.durhamcollege;

import java.util.InputMismatchException;
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
        boolean flag=false;
        //Input
        System.out.print("Enter your name: ");
       name = keyboard.nextLine();


       do
       {
           try
           {
               System.out.print("Please enter your age: ");
               age = keyboard.nextFloat();
                flag=true;

               if (age <= 0.0f || age >= 120.0f)
               {
                   System.out.println("Error: You must enter a age greater between 1 and 119.");
                   keyboard.nextLine();
                   flag=false;

               }



           }
           catch (InputMismatchException e)
           {
               System.out.println("Error: You must enter a valid floating point number.");
               keyboard.nextLine();
               flag=false;

           }

       }while(!flag);



        //output

        System.out.println();

        System.out.printf("You entered: %s",name);
        System.out.printf("\nYou entered %.2f \n",age);
    }
}
