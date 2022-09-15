package com.slot2junit;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public int adding(int a,int b) {
    	return a+b;
    }
    
    public boolean checkEven(int n) {
    	if(n%2==0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    
    public int divide(int a,int b)
    {
    	return a/b;
    }
    
    
    //2,5,81,91,24,6,1,3;
    public int[] sortingofarray(int ar[])
    {
    	Arrays.sort(ar);
    	return ar;
    }
    
    public String wishme() {
    	return "9059065724";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
