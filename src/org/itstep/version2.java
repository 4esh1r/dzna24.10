package org.itstep;

import java.util.Scanner;

public class version2 extends Mark1 {
    private int milk = 0;
    private int milkLimit = 2000;

    public version2() {
        super(400);
    }

    protected version2(int RubbishBinLimit, int milkLimit){
        super(RubbishBinLimit);
        this.milkLimit = milkLimit;
    }

    public void addMilk(int milk){
        if(milk + this.milk > this.milkLimit){
            System.out.println("WHOOO ,Молока поменьше");
        }
        else {
            this.milk += milk;
        }
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        if(milk + this.milk > this.milkLimit){
            System.out.println("WHOOO ,Молока поменьше ");
        }
        else {
            this.milk = milk;
        }
    }

    public boolean test(int coffee, int water, int milk) {
        int i = 0;
        if(milk > getMilk()){
            i++;
            System.out.println("milk NOT FOUND");
        }
        if(!super.test(coffee, milk)){
            i++;
        }
        return i == 0;
    }

    public void cookLatte(int needMilk){
        int needCoffee = 22;
        int needWater = 30;
        if (test(needCoffee, needWater, needMilk)) {
            setGroundCoffee(getGroundCoffee() - needCoffee);
            setWater(getWater() - needWater);
            setRubbishBin(getRubbishBin() + needCoffee);
            setMilk(getMilk()-needMilk);
            System.out.println("your drugs");
        }
    }

    public void cookCappuccino(int needMilk){
        cookLatte(needMilk);
    }

    @Override
    public void menu() {
        int menu;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - On");
            System.out.println("2 - Esspresso Sir");
            System.out.println("3 - Amerikano DINDON");
            System.out.println("4 - Latte for my Girl");
            System.out.println("5 - CAPA CAPA!");
            System.out.println("6 - O4ISTKA");
            System.out.println("7 - OF");
            System.out.println("0 - Exit menu");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> On();
                case 2 -> cookEspresso();
                case 3 -> cookAmericano();
                case 4 -> {
                    System.out.println("How Many milk sir?");
                    int needMilk = scanner.nextInt();
                    cookLatte(needMilk);
                }
                case 5 -> {
                    System.out.println("How Many milk sir?");
                    int needMilk = scanner.nextInt();
                    cookCappuccino(needMilk);
                }
                case 6 -> setRubbishBin(0);
                case 7 ->Off();
                default -> menu = 0;
            }
        } while (menu != 0);
    }
}
