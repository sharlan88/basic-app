package by.itstep.oop;

import java.util.Scanner;

// Class <=> Model <=> Type <=> Template.
public class Person {

    // field - поля.
    int age;
    String name;
    String lastName; //
    char gender;// can be 'f', 'm'
    boolean isSingle;
    boolean isDB;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //methods <=> functions.
    void sayMyName(){
        System.out.println("Hello , my name is " + name);
    }

    void dance(){
        System.out.println(name + " is dancing");
    }

    void drink(){
        if(age >= 18){
            System.out.println("Vine or/and Beer");
        } else {
            System.out.println("Water, only water");
        }
    }

}

class Tester {
    public static void main(String[] args) {
        int num;
        //
        Person person;
        // instance creation <=> object creation. via 'new' operator
        person = new Person();

        // instance fields initialisation <=> object populating
        person.name = "John";
        person.age = 32;
        person.gender = 'm';
        person.isSingle = true;
        person.lastName = "Johnson";
        person.isDB = true;




        // object behavior <=> methods invocation
        person.sayMyName();
        person.drink();
        person.dance();

        System.out.println("*********************");


        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 15;
        person2.gender = 'm';
        person2.isSingle = true;
        person2.lastName = "Johnson";
        person2.sayMyName();
        person2.drink();
        person2.drink();
        person2.dance();

        Person person3 = new Person();
        person.name = "John";
        person.age = 32;
        person.gender = 'm';
        person.isSingle = true;
        person.lastName = "Johnson";

        // object behavior <=> methods invocation
        person.sayMyName();
        person.drink();
        person.dance();



    }
}
