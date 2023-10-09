package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Practice {

    public static void main(String[] args) throws IOException {
        //exceptions are of 3 types
        //throwable extended by Exceptions and Errors
        //Exception you can handle
        //types (Checked and unchecked)
        //checked mean the error is known
        //types of checked are IOException and SQLException
        //unchecked means the error is not known
        //types of unchecked are Runtime exception
        //Runtime has lots of excpetions
        // e.g ArithmeticExcepton
        //Errors u cannot handle
        //when putting assignment in a block,
        // make sure your declaration assigns a value
        //Runtime extends Exception while Exception extends throwable


        //first example of an unchecked exception
        int i = 8, j = 2, k = 0;
        int[] a = new int[4];

        //System.out.println(k);

        /*try{
            k = 1/j;
            for (int l = 0; l < a.length; l++)
            {
                a[l] = l + 1;
            }

            for (int value : a)
            {
                System.out.println(value);
            }
        }catch(Exception e)
        {
            System.out.println("cannot divide by zero");
        }
        System.out.println(k);*/


        //1. Write a Java program to create a method that takes an integer as a parameter and throws an exception
        // if the number is odd.

        Scanner input = new Scanner(in);
       /*     try{
                System.out.println("enter a number");
                int number = Integer.parseInt(input.nextLine());
                oddNumChecker(number);
            }catch(OddException e){
                System.out.println(e.getMessage());

            }catch (NumberFormatException exception)
            {
                System.err.println(exception.getMessage());
            }*/

        //3.  Write a Java program to create a method that reads a file and throws
        // an exception if the file is not found
/*
        File file = new File("./prova2.txt");

        try{
            if (file.exists())
            {
                System.out.print("This file exists");
            }else {
                throw new Exception("the file was never created");
            }
            }catch(Exception e)
            {
                System.err.print(e.getMessage());
            }*/

       //3. Write a Java program that reads a list of numbers
        // from a file and throws an exception if any of the numbers are positive.

        char[] in = new char[10];
        File file = new File("./exception/prova.txt");

        FileReader file2 = new FileReader((file));
        file2.read(in);
       System.out.println(Arrays.toString(in));

    }

    /*public static void oddNumChecker(int num)
    {
        if(num % 2 != 0)
        {
            throw new OddException("this is an odd number");
        }else {
            System.out.println("This number is even");
        }
    }*/
}
