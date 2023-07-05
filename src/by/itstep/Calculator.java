package by.itstep;

import java.util.Scanner;

public class Calculator {


    public static void printX2(int a) {
        System.out.println("Result is " + (a * 2));
    }

    public static void printSumma(int a, int b) {
        System.out.println("S = " + summa(a, b));
    }

    public static int summa(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Div by Zero");
        }
        return a / b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int squareRoot(double base) {
        int result = (int) Math.sqrt(base);
        return result;
    }

    public static int pif(int a, int b) {
        int c = squareRoot((Math.pow(a, 2) + Math.pow(b, 2)));
        return c;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Summa");
        System.out.println("2. Multiplication");
        System.out.println("3. Division");
        System.out.println("4. Square Root");
        //...
        int methodNumber = sc.nextInt();
        switch (methodNumber) {
            case 1: {
                System.out.println("Input A:");
                int a = sc.nextInt();
                System.out.println("Input B:");
                int b = sc.nextInt();
                int r = summa(a, b);
                System.out.println("Result is " + r);
                break;
            }
            case 2: {
                System.out.println("Input A:");
                int a = sc.nextInt();
                System.out.println("Input B:");
                int b = sc.nextInt();
                int r = mult(a, b);
                System.out.println("Result is " + r);
                break;
            }
            case 3: {
                System.out.println("Input A:");
                int a = sc.nextInt();
                System.out.println("Input B:");
                int b = sc.nextInt();
                double r = div(a, b);
                System.out.println("Result is " + r);
                break;
            }

            case 4: {
                System.out.println("Input Number:");
                int a = sc.nextInt();
                double r = squareRoot(a);
                System.out.println("Result is " + r);
                break;
            }
            default: {
                System.out.println("Wrong method number!");
            }
        }


    }


    public static void randomMethod(int times) {
        if (times < 1) {
            System.out.println("Wrong times number!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < times; i++) {
                int mNum = (int) (Math.random() * 6) + 1;
                switch (mNum) {
                    case 1: {
                        System.out.println("Input A:");
                        int a = sc.nextInt();
                        System.out.println("Input B:");
                        int b = sc.nextInt();
                        int r = summa(a, b);
                        System.out.println("Result is " + r);
                        break;
                    }
                    case 2: {
                        System.out.println("Input A:");
                        int a = sc.nextInt();
                        System.out.println("Input B:");
                        int b = sc.nextInt();
                        int r = mult(a, b);
                        System.out.println("Result is " + r);
                        break;
                    }
                    case 3: {
                        System.out.println("Input A:");
                        int a = sc.nextInt();
                        System.out.println("Input B:");
                        int b = sc.nextInt();
                        double r = div(a, b);
                        System.out.println("Result is " + r);
                        break;
                    }
                    case 4: {
                        System.out.println("Input Number:");
                        int a = sc.nextInt();
                        double r = squareRoot(a);
                        System.out.println("Result is " + r);
                        break;
                    }
                    default: {
                        System.out.println("Wrong method number!");
                    }
                }
            }

        }
    }


    // Client
    public static void main(String[] args) {
//        printSumma(10, -60);
//        int s = summa(10, 20);
//        System.out.println(s);
//
//        int r = sub(200, -200);
//        System.out.println("Sub result is " + r);
//
//        double d = div(5564654, 2);
//        System.out.println("Div result is " + d);
//
//
//        System.out.println(sub(sub(mult(4, 4), 2), summa(4, 4)));
//
//        System.out.println(squareRoot(9));
//
//        int c = pif(3, 4);
//        System.out.println("C = " + c);
    randomMethod(2);
    }
}
