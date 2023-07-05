package by.itstep.oop;

public class Human {
    public static String type = "H";

    private static int counter;
    private int age;
    private String name;

    public Human(){
        System.out.println("Human + 1");
        counter++;
        age++;
    }

    public static int getCounter() {
        return counter;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class TestHuman {
    public static void main(String[] args) {


        Human h1 = new Human();
        int age = h1.getAge();

        Human h2 = new Human();
        h2.setName("Alex");

        Human h3 = new Human();
        h3.setName("John");

        Human h4 = new Human();

        int n = Human.getCounter();

        System.out.println("Number of Humans: " + n);
        System.out.println("Age: " + age);


        System.out.println(h3.getCounter());
    }
}
