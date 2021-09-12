/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program creates a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.
import java.util.Scanner;
public class ex03{
   public static void main(String[] args){    
   Scanner input= new Scanner(System.in);

   System.out.print("What is the quote? ");
        String quote = input.nextLine();
   System.out.print("Who said it? ");
        String author = input.nextLine();

    System.out.println(author + " says, " + '"' + quote + '"');
    }//end of main
}//end of class