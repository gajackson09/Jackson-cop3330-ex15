/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program computes the tax on an order amount
import java.util.Scanner;
public class ex15{
   public static void main(String[] args){    
   Scanner input = new Scanner(System.in);

   int password = 12345;

   System.out.print("What is the password ");
        int userpassword = input.nextInt();

    if(password == userpassword){
        System.out.println("Welcome");
        }
        else{
            System.out.println("I don't know you.");       
        }

    }//end of main
}//end of class