package com.KWIC;
/**
 * @author Víctor Lavalle
 */
public class Parting {
    
    private String[] tokens;
    
    public void splitSentence(String sentence){
        tokens = sentence.split(" ");
    }
    
    public String[] sendTokens(){
        return tokens;
    }
    
}   

