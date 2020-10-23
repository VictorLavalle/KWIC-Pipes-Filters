package com.KWIC;

import java.util.ArrayList;
/**
 * @author Víctor Lavalle 
 */
public class Combinations {
    
    private String[] combinations;
    private ArrayList<String> combinationsArray;
    
    /*Contructor of the array that will have the combinations of the sentence*/
    public Combinations(){
        combinationsArray = new ArrayList<>();
    }
    
    public void KWIC(String a[], int size, int n){
        if (size == 1){
           joinSentence(a,n);
        }
        for (int i=0; i<size; i++){
            KWIC(a, size-1, n);
            if (size % 2 == 1){
                String temp = a[0];
                a[0] = a[size-1];
                a[size-1] = temp;
            } 
            else{
                String temp = a[i];
                a[i] = a[size-1];
                a[size-1] = temp;
            }
        }
    }
    
    public void joinSentence(String a[], int n){
        String str = String.join(" ", a);
        combinationsArray.add(str);
 }
    
    public void convertArray(){
        combinations = combinationsArray.toArray(new String[combinationsArray.size()]);
    }

    public String[] getCombinations(){
        return combinations;
    }
    
}
