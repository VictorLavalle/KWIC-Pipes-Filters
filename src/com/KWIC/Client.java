package com.KWIC;
/**
 * @author Víctor Lavalle 
 */
public class Client {

    public static void main(String[] args) {
        Sentence sentence = new Sentence();
        Parting part= new Parting();
        Combinations comb= new Combinations();
        Alphabetizer alpha = new Alphabetizer();
        Out out = new Out();
        
        sentence.readSentence();
        part.splitSentence(sentence.sendSentence());
        comb.KWIC(part.sendTokens(), part.sendTokens().length, part.sendTokens().length);
        comb.convertArray();
        alpha.sorting(comb.getCombinations());
        out.printOut(alpha.getOrdered());  
    }
}
