package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         */
    	Set<String> tSet = new TreeSet<>();
    	/*
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         */
    	for (int i = 1 ; i<=20 ; i++) {
    		tSet.add("" + i);
    	}
    	/*
         * 3) Prints its content
         */
    	System.out.println(tSet);
    	
    	/*
         * 4) Removes all those strings whose represented number is divisible by
         * three
         */
   
    	Iterator<String> it = tSet.iterator();
    	while(it.hasNext()) {
    		if( Integer.parseInt(it.next()) % 3 == 0){
    			it.remove();
    		}
    	}
    	/*
         * 5) Prints the content of the Set using a for-each costruct
         */
    	for(String s : tSet) {
    		System.out.print(s + ", ");
    	}
    	
    	/*
         * 6) Verifies if all the numbers left in the set are even
    	*/
    	var newset = new TreeSet<>();
    	for (int i = 2 ; i<= 20 ; i += 2) {
    		newset.add(""+i);
    	}
    	
    	System.out.println("\nEven:" + newset);
    	System.out.println(tSet.containsAll(newset));
    }
 }
