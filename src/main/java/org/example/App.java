package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        String name;
        String greeting;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = sc.next();

        greeting = "Hello, " + name + ", nice to meet you!";

        System.out.println(greeting);
    }
}
