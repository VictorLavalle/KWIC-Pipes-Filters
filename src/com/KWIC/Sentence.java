package com.KWIC;

import java.util.Scanner;
/**
 * @author Víctor Lavalle 
 */
public class Sentence {
    
     private String phrase;
     
     public void readSentence(){
         Scanner scan= new Scanner(System.in);
         System.out.print(">>Type a Sentence: \n");
         phrase = scan.nextLine();
         System.out.println("\n");
     }
     
     public String sendSentence(){
         return phrase;
     }
}
