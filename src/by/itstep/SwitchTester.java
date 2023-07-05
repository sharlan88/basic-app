package by.itstep;

import java.util.Scanner;

public class SwitchTester {

    public static void main(String[] args) {
        int num = 1;
        // switch (var) {body with cases}

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default :
                System.out.println("Not ONE and Not Two!");
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Input week day number:");
        int dayNumber = sc.nextInt();
        switch (dayNumber){
            case 1 :
                System.out.println("Monday");
                break;
            default:
                System.out.println("[from 1 to 7]. Incorrect number of day! " + dayNumber);
        }




    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input month num:");
        int monthNum = sc.nextInt();
        switch (monthNum){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;

        }



    }


    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input letter (single):");
        char ch = sc.next().charAt(0);
        int code = (int)ch; //
        System.out.println("Code is " + code);
        if(Character.isLetter(ch)){ // (code >= 65 && code <= 90) || (code >= 97 && code <= 122)
            System.out.println("letter");
            switch (Character.toLowerCase(ch)){
                case 'a':
                case 'i':
                case 'e':
                case 'y':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("consonant");
                    break;

            }
        } else {
            System.out.println("Your input is not a letter. Please input letter");
        }

    }


}
