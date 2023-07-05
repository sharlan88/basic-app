package by.itstep.oop.inh.animals;

public class Dog extends DAnimal {



    @Override
    void voice() {
        System.out.println(getName() + ": Bark - Bark");
    }

    @Override
    void eat() {
        System.out.println(getName() +" Dog eat(): meat");
    }

    void serve(){
        System.out.println(getName() + " Dog : serve()");
    }
}
