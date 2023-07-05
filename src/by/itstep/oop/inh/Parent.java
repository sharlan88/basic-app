package by.itstep.oop.inh;

public class Parent {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayMyName(){
        System.out.println("моё имя " + name);
    }
}
