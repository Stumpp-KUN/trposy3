package com.accessories.videocard.amd;

public class AMD8 extends amdMain{

    AMD8(int fillRate, String name, int cost, int amountOfMemory) {
        super(fillRate, name, cost, amountOfMemory);
    }
    public AMD8(){super(4,"AMD8",9000,16);}

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
