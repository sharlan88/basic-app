package by.itstep;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
        System.out.println("Begin");
        runSomeTask();

        System.out.println("End");

    }

    public static void printHello(){
        System.out.println("Hello");
        System.out.println("2");
        System.out.println("1");
    }





    public static void task1() {
        System.out.println("Begin method body");
        System.out.println("Logic is here...");
        System.out.println("End of method.");
    }

    public static void task2() {
        System.out.println("Task 2 Begin.");
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Input A:");
        int a = sc.nextInt();
        System.out.println("Input B:");
        int b = sc.nextInt();
        System.out.println("Input C:");
        int c = sc.nextInt();
        System.out.println("Result: " + a + "*x*x + " + b + "*x + " + c + " =0");

        double d = Math.pow(b, 2) - 4*a*c;
        System.out.println("D is " + d);
        if(d > 0){
            System.out.println("2 roots");
            double x1, x2;
            x1 =  (-b + Math.sqrt(d)) / (2 * a);
            x2 =  (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("X1 is " + x1);
            System.out.println("X2 is " + x2);
        } else if(d == 0){
            System.out.println("single root");
            double x1;
            x1 =  -b / (2 * a);
            System.out.println("X1 is " + x1);
        } else {
            System.out.println("no roots");
        }
    }

    public static void summa(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number:");
        int a = sc.nextInt();
        System.out.println("Input second number:");
        int b = sc.nextInt();
        System.out.println("Input third number:");
        int c = sc.nextInt();

        System.out.println(a + b + c);
    }

    public static void rectangleInfo(){
      // input A & B
      // calculate S & P
      // is it Square ?

        Scanner sc = new Scanner(System.in);

        System.out.println("Input A:");
        int a = sc.nextInt();
        System.out.println("Input B:");
        int b = sc.nextInt();

        long s = a * b;
        long p = (a + b) * 2;

        System.out.println("S = " + s);
        System.out.println("P = " + p);



    }

    public static void triangleInfo(){

        //TODO : impl
        // input A & B & C
        // is valid triangle ?
        // if YES then calculate S & P

    }

    public static void runSomeTask(){
        System.out.println("1. printHello()");

        //FIXME : fix
        System.out.println("2. rectangleInfo()");
        System.out.println("3. task2()");
        System.out.println("4. summa()");
        System.out.println("5. task1()");

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Item number:");
        int num = sc.nextInt();

        if(num == 1){
            printHello();
        } else if(num == 2){
            rectangleInfo();
        } else if(num == 3){
            task2();
        } else if(num == 4){
            summa();
        } else if(num == 5){
            task1();
        } else {
            System.out.println("Not such method!");
        }

    }


}
