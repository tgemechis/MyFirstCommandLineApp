package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Welcome, " + name);
        System.out.print("What is your favourite color");
        String color = keyboard.nextLine();
        System.out.println("Your favourite color is , " + color);

        if (color.equalsIgnoreCase("blue")) {
            System.out.println("My favourite color is blue");
        } else {
            System.out.print("My favourite color is green ");
        }
    }
}

