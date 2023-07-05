package by.itstep;

public class IfTask {
    public static void main(String[] args) {
        boolean flag = true;
        flag = false;

        int age = 25;
        int iq = 80;
        int cash = 1000;


        boolean isRich = false;
        if(cash > 1000){
            isRich = true;
        }

        boolean isClever = false;
        if(iq > 80){
            isClever = true;
        }

        boolean isYoung = false;
        if(age < 26){
            isYoung = true;
        }

        if(cash > 1000 && iq > 80 && age < 26){
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }

    }
}
