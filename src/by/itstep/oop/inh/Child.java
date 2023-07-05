package by.itstep.oop.inh;

import by.itstep.oop.Cat;

// 'IS-A' relationship.
public class Child extends Parent {

    // 'HAS-A' relationship
    private Cat cat;

    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void jump(){
        System.out.println("jumping " + getName());
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    //
    @Override
    public void sayMyName() {
        //super -
        super.sayMyName();
        System.out.println("My name is " + getName());
    }
}
