package by.itstep.oop.inh.animals;

public class Tiger extends Cat {

    void attack(){
        System.out.println(getName() + " attack()");
    }

    @Override
    void eat() {
        System.out.println("");
    }
}
