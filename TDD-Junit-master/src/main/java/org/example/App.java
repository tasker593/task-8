package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        RemoveCharacters rc = new RemoveCharacters();
        System.out.println("Enter string : ");
        String string = scanner.next();
        System.out.println("Result after removing first two A : " + rc.removeA(string));
    }
}
