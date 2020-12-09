package org.itstep;
public class Main {
    public static void main(String[] args) {
        CofeMAH mark1 = new Version1();
        mark1.addGroundCoffee(500);
        mark1.addWater(2000);
        mark1.menu();
       Version2 mark2 = new Version2();
        mark2.addGroundCoffee(0);
        mark2.addWater(0);
        mark2.addMilk(10);
        mark2.menu();
        Version3 mark3 = new Version3();
        mark3.addBeanCoffee(30);
        mark3.addMilk(1000);
        mark3.addWater(1000);
        mark3.menu();
    }
}
