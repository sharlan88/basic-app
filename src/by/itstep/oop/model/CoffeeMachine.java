package by.itstep.oop.model;

public class CoffeeMachine {

    private final double maxWaterTank = 1000; // ml


    private static int salesCounter = 0;
    private String model;
    private int numberOfCups;

    private double waterTank;

    private double coffeeTank;
    private double milkTank;
    private double garbageTank;

    private int currentWaterTemp;

    private boolean isActive = false;
    private boolean isOn = false;


    public void addWater(int extraWater){
        if((extraWater + waterTank) >= maxWaterTank){
            System.out.println("can't add water");
        } else {
            waterTank = waterTank + extraWater;
            System.out.println("current water:" + waterTank + "(ml)");
        }

    }



    public CoffeeMachine(String model){
        salesCounter++;
        this.model = model;
        this.numberOfCups = 0;
    }

    public void switchOn() throws InterruptedException {
        if(!isOn){
            System.out.println("CoffeeMachine " + model + " is starting..");
            Thread.sleep(1000);
            isOn = true;
            System.out.println("CoffeeMachine " + model + " is started!");
        } else {
            System.out.println("Already started!");
        }

    }

    public void switchOff() throws InterruptedException {
        if(isOn){
            System.out.println("CoffeeMachine " + model + " is stopping..");
            Thread.sleep(1000);
            isOn = false;
            System.out.println("CoffeeMachine " + model + " is stopped!");
        } else {
            System.out.println("Already stopped!");
        }

    }





}
