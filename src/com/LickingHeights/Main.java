package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int userMonth;
        int userDay;
        int userMonth2;
        int userYear;


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
        System.out.println("Thank you.");


    }
    public static int userMonth2( int userMonth) {

        switch (userMonth) {
            case 1:
                return 13;

            case 2:
                return 14;

            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return userMonth;
        }
    }

        public static int weekDay(int userDay, int userMonth2, int userYear){
            userMonth2 = userMonth2(userMonth2);
            if (userMonth2 > 12) {
                userYear--;
            }

            int K = (userYear % 100);
            int J = (userYear / 100);

            int weekDay = userDay + (13 * (userMonth2 + 1)) / 5 + K + (K / 4) + (J / 4) - (-2 * J);

            return weekDay;
        }
        public static String month(int userMonth) {

            switch (userMonth) {

                case 1:
                    return "January";
                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
                    
            }
        }
    }