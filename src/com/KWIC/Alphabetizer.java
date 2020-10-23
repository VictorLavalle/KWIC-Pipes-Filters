package com.KWIC;

import java.util.Arrays;
/**
 * @author Víctor Lavalle
 */
public class Alphabetizer {
    
    private String[] ordered;
    
    public void sorting(String[] a){
        Arrays.sort(a);
        ordered = a;
    }
    
    public String[] getOrdered(){
        return ordered;
    }
    
}
