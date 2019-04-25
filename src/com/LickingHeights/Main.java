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

        System.out.println("You were born in "+userMonth+".");
        System.out.println("There are "+" in "+userMonth+". Can you give me the day you were born on? Please give it to me as a number");
        userDay = keyboard.nextInt();





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

            default:
                return 0;
        }
    }

        public static int weekDay(int userDay, int userMonth2, int userYear){
            userMonth2 = userMonth2(userMonth2);
            if (userMonth2 > 12) {
                userYear--;
            }

            int K = (userYear % 100);
            int J = (userYear / 100);

            int weekDay = (userDay + (13 * (userMonth2 + 1)) / 5 + K + (K / 4) + (J / 4) - (-2 * J)) % 7;

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

                default:
                    return "";
            }
        }
        public static String weekDays(int weekDay) {
            switch (weekDay){
                case 0:
                    return "Saturday";
                case 1:
                    return "Sunday";
                case 2:
                    return "Monday";
                case 3:
                    return "Tuesday";
                case 4:
                    return "Wednesday";
                case 5:
                    return "Thursday";
                case 6:
                    return "Friday";

                default:
                    return "";
            }
        }
        public static int monthDays(int userMonth){
            switch (userMonth){
                case 1:
                    return 31;
                case 2:
                    return 28;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 31;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;

            }
            return monthDays(userMonth);
        }
        public static String daysPoem(int weekDay){
            switch (weekDay){
                case 2:
                    return "According to the poem, Monday's child is fair of face.";
                case 3:
                    return "According to the poem, Tuesday's child is full of grace.";
                case 4:
                    return "According to the poem, Wednesday's child is full of woe.";
                case 5:
                    return "According to the poem, Thursday's child has far to go.";
                case 6:
                    return "According to the poem, Friday's child is loving and giving.";
                case 0:
                    return "According to the poem, Saturday's child works hard for a living.";
                case 1:
                    return "According to the poem, The child born on the Sabbath day, Sunday, is fair and wise and good in every way.";

                    default:
                        return "";
            }
        }
    }