package org.itstep;
public class Main {
    public static void main(String[] args) {
        CoffeeMachine mark1 = new Mark1();
        mark1.addGroundCoffee(500);
        mark1.addWater(2000);
        mark1.menu();
        Mark2 mark2 = new Mark2();
        mark2.addGroundCoffee(0);
        mark2.addWater(0);
        mark2.addMilk(10);
        mark2.menu();
        Mark3 mark3 = new Mark3();
        mark3.addBeanCoffee(30);
        mark3.addMilk(1000);
        mark3.addWater(1000);
        mark3.menu();
    }
}
