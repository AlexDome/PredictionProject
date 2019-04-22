package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int userMonth;
        int userDay;


        System.out.println("Monday's child is fair of face.");
        System.out.println("Tuesday's child is full of grace.");
        System.out.println("Wednesday's child is full of woe.");
        System.out.println("Thursday's child has far to go.");
        System.out.println("Friday's child is loving and giving.");
        System.out.println("Saturday's child works hard for a living.");
        System.out.println("But the child born on the Sabbath Day,");
        System.out.println("Is fair and wise and good in every way.");
        System.out.println();
        System.out.println("Let's see what day of the week you were born on.");
        System.out.println("What month were you born in? Please enter as a number 1-12");
        userMonth = keyboard.nextInt();

        System.out.println();
        System.out.println("Can you give me the day you were born on? Please give it to me as a number");
        userDay = keyboard.nextInt();
        System.out.println("Thank you very much for giving me this information, I will ")
    }
}