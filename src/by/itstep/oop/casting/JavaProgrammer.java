package by.itstep.oop.casting;

public class JavaProgrammer {

    void makeCode(){
        System.out.println("Write some default code here.");
    };

    public void playTennis(){
        System.out.println("Playing Tennis...");
    }

}

class MiddleJavaDeveloper extends JavaProgrammer {

    @Override
    void makeCode() {
        System.out.println("Write some good code here.");
        playTennis();
    }
}

class SeniorJavaDeveloper extends JavaProgrammer {

    @Override
    void makeCode() {
        System.out.println("Write some perfect code here.");
        playTennis();
    }

    void leaveOffice(){
        System.out.println("leave Office.");
    }
}


class JuniorJavaDeveloper extends JavaProgrammer {

    @Override
    void makeCode() {
        System.out.println("Write some bad code here.");
    }

    void study(){
        System.out.println("study.");
    }
}


class Company {
    public static void main(String[] args) {
        JuniorJavaDeveloper junior = new JuniorJavaDeveloper();
        JavaProgrammer programmer = (JavaProgrammer) junior; // upcasting

        Object o = (Object)new SeniorJavaDeveloper();
        Object o2 =(Object)(JavaProgrammer)new MiddleJavaDeveloper();

        JavaProgrammer jp = new JuniorJavaDeveloper(); // new SeniorJavaDeveloper();

        if(jp instanceof SeniorJavaDeveloper){
            SeniorJavaDeveloper sjd = (SeniorJavaDeveloper)jp;
            sjd.leaveOffice();
        } else if(jp.getClass() == JuniorJavaDeveloper.class){
            JuniorJavaDeveloper jun = (JuniorJavaDeveloper)jp;
            jun.study();
        }


        //
        JavaProgrammer [] programmers = {junior, (JavaProgrammer) o, (JavaProgrammer) o2, jp};
        System.out.println("programmers : " + programmers.length);

        for (JavaProgrammer prog : programmers){
            prog.makeCode();
        }

        method(2, 3);
        method(2.0, 3.5);

    }

    static void method(int a, int b){
        System.out.println(a + b);
    }


    static void method(double a, double b){
        System.out.println(a + b);
    }
}
