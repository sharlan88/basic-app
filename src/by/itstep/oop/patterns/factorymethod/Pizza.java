package by.itstep.oop.patterns.factorymethod;

public abstract class Pizza {
    public abstract void printInfo();
}

class Pepperoni extends Pizza{

    @Override
    public void printInfo() {
        System.out.println("Classic Italian Pepperoni");
    }
}


class Pizzeria {
    public static Pizza makePizza(int key){
        if(key == 1){
            return new Pepperoni();
        } else if(key == 2){
            //
        } else if(key == 3){
            //
        }

        throw new IllegalArgumentException("Wrong pizza number");
    }
}

class PizzaClient {
    public static void main(String[] args) {
        Pizza pizza = Pizzeria.makePizza(1);
        pizza.printInfo();

        Pizza[] pizzaArray = {Pizzeria.makePizza(1),
                Pizzeria.makePizza(1), Pizzeria.makePizza(2)};


    }
}
