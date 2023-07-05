package by.itstep.oop;

public class Cat {

    private String name;
    private boolean hasOwner;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setHasOwner(boolean newHasOwner) {
        hasOwner = newHasOwner;
    }

    public boolean getHasOwner() {
        return hasOwner;
    }

    public void play(){
        System.out.println(name + " is playing");
    }

    public void sleep(){
        System.out.println(name + " is playing");
    }
}
