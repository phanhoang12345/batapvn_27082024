
package thedowhile;

import java.util.Scanner;


public class Thedowhile {

    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        String phrase;
        do { 
            System.out.println("Type your password"); 
            phrase = console.next();
        } while (!phrase.equals("duytan"));
    }
    
}
