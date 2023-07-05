package by.itstep;

import java.util.Scanner;

public class WhileTester {

    public static void main(String[] args) throws InterruptedException {
//        int t = 23;
//        final int max = 100;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input V (ml) MAX is 5000:");
//        int ml = sc.nextInt();
//
//        if(ml >= 200 && ml <= 5000){
//            while (t <= max){
//                System.out.println("working..");
//                Thread.sleep(500 * (ml/1000));
//                int x = (int)(Math.random() * 6) + 5; // from 5 to 10
//                t += x; // t = t + x;
//                System.out.println("Current water tmp is " + t);
//            }
//        } else {
//            System.out.println("Incorrect V. MIN is 0.2l , MAX 5l");
//        }

        task8();
    }



    public static void task8(){
        int num = 0;
        while(num < 10){
            int studentNumber = ((int) (Math.random() * 13)) + 1 ;
            System.out.println(studentNumber);
            num +=1; // num = num + 1;
        }
    }
}
