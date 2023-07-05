package by.itstep;

public class ForTester {

    //0 2 4 6 8 10... (1000 TIMES)
    public static void task1(){
        for(int i = 0; i < 2000; i = i + 2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //1 3 5 7 .. (500 times)
    public static void task2(){
        for(int i = 1; i < 1000; i = i + 2){
            System.out.print(i + " ");
        }
        System.out.println();
    }


    //10 20 30 40 50 ... (50 times)
    public static void task3(){
        for(int i = 0, number = 10; i < 50; i++){
            System.out.print(number + " ");
            number = number + 10;

        }
        System.out.println();
    }


    //-1 -2 -3 -4 -5 (100 times)
    public static void task4(){
        for(int i = 0 , num = -1; i < 100; i++){
            System.out.print(num + " ");
            num--; // num = num - 1;
        }
        System.out.println();
    }



    // -1 2 -3 4 -5 (100 times)
    public static void task5(){
        for(int i = 0, number = -1; i < 100; i++){
            if(number % 2 == 0){ //
                System.out.print(((-1) * number ) + " ");
            } else {
                System.out.print(number + " ");
            }
            number--;
        }
        System.out.println();
    }


    // 2 3 10 0 2 3 ... (25 times) (from 0 to 10)
    public static void task6(){
        for(int i = 0; i < 25; i++){
            int x = (int) (Math.random() * 11) ;
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void task7(){
        for (int a = 2; a <= 9; a++){
            for(int b = 2; b <= 10; b++){
                int result  =  a * b;
                System.out.println(a + " X " + b + " = " + result);
            }
            System.out.println("*******");
        }
    }

    public static void task8(){
        for (int num = 0; num <9; num++){
            int studentNumber = ((int) (Math.random() * 12)) + 1 ;
            System.out.println(studentNumber);
        }
    }



    public static void main(String[] args) {

        //      0       1           3            2
        //for(<var>;<condition>;<iteration>) {<body>}
        // <var> - runs only once
        // <condition> - true/false
        // <iteration> - before each condition (right after body)
//        for(int i = 0; i < 10; i++){
//            System.out.println(i);
//        }
//
//        for(;true; ){
//            System.out.println("Inside FOR");
//            int x = (int) (Math.random() * 10);
//            if(x == 5){
//                break;//
//            }
//        }

         // %
//        int number = 3;
//        int number2 = 2;
//
//        int result = number % number2;
//        System.out.println(result);



//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();



        task8();
    }


//    public static void taskTwo() {
//// 2. Даны три числа. Вывести эти числа в порядке убывания / возрастания.
//        System.out.println("Beginning Task Two");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input three numbers");
//        double num1 = sc.nextDouble(); // 2
//        double num2 = sc.nextDouble(); // 1
//        double num3 = sc.nextDouble(); // 3
//        System.out.println("From (g)reatest to smallest or from (s)mallest to greatest?");
//        char letter = sc.next().charAt(0);
//        for (; !(letter == 'g' || letter == 's'); ) {
//            System.out.println("You must input g or s");
//            letter = sc.next().charAt(0);
//        }
//        if (num1 > num2) {
//            if (num2 > num3 || num2 == num3) {
//                if (letter == 'g') {
//                    System.out.println(num1 + " " + num2 + " " + num3);
//                } else System.out.println(num3 + " " + num2 + " " + num1);
//            } else if (num3 > num1 || num3 == num1) {
//                if (letter == 'g') {
//                    System.out.println(num3 + " " + num1 + " " + num2);
//                } else System.out.println(num2 + " " + num1 + " " + num3);
//            } else if (letter == 'g') {
//                System.out.println(num1 + " " + num3 + " " + num2);
//            } else System.out.println(num2 + " " + num3 + " " + num1);
//        } else if (num1 < num2) {
//            if (num3 > num2 || num2 == num3) {
//                if (letter == 'g') {
//                    System.out.println(num3 + " " + num2 + " " + num1);
//                } else System.out.println(num1 + " " + num2 + " " + num3);
//            } else if (num3 > num1 || num3 == num1) {
//                if (letter == 'g') {
//                    System.out.println(num2 + " " + num3 + " " + num1);
//                } else System.out.println(num1 + " " + num3 + " " + num2);
//            } else if (letter == 'g') {
//                System.out.println(num2 + " " + num1 + " " + num3);
//            } else System.out.println(num3 + " " + num1 + " " + num2);
//        } else {
//            if (num3 > num2) {
//                if (letter == 'g') {
//                    System.out.println(num3 + " " + num2 + " " + num1);
//                } else System.out.println(num1 + " " + num2 + " " + num3);
//            } else {
//                if (letter == 'g') {
//                    System.out.println(num1 + " " + num2 + " " + num3);
//                } else System.out.println(num3 + " " + num2 + " " + num1);
//            }
//        }
//        System.out.println("Finishing Task Two");
//    }

}
