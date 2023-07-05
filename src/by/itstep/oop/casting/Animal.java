package by.itstep.oop.casting;

public abstract class Animal {
    String name;

    abstract void sleep();
}

class Cat extends Animal {

    @Override
    void sleep() {
        System.out.println("cat is sleeping");
    }


}

class Dog extends Animal {

    @Override
    void sleep() {
        System.out.println("dog is sleeping");
    }




}






class TestAnimals {


    public static void testAnimal(Animal a){
        a.sleep();
    }




    public static void main(String[] args) {
        testAnimal(new Animal() {
            @Override
            void sleep() {
                System.out.println("TEST");
            }
        });

    }
}