package com.accessories.videocard.amd;

public class AMD7 extends amdMain{

    AMD7(int fillRate, String name, int cost, int amountOfMemory) {
        super(fillRate, name, cost, amountOfMemory);
    }

    public AMD7(){super(4,"AMD7",7000,12);}
    public int getFillRate(){
        return fillRate;
    }
    public String getName(){
        return name;
    }
    public int getAmountOfMemory(){
        return amountOfMemory;
    }
    public int getCost(){
        return cost;
    }
}
